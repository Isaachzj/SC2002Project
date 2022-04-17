package app_hotel;


import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
import hotel.Hotel;
import reservation.*;
import room.Room;
import list_methods.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import days_date_time.DateTime;
/**
 * This is a Boundary Class; as it is used as a user interface;
 * Method will make a reservation for the guest, an Exception would be thrown when error encountered
 * Method will also check if the customer has any discounts, will ensure discounts (in percentage),
 * will return a positive value less than 100 [i.e. discounts from 0% to 100% (non-inclusive)]
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 *
 */
public class MakeReservation {
	/**
	 * Method will make a reservation for the guest, an Exception would be thrown when error encountered
	 * Method will also check if the customer has any discounts, will ensure discounts (in percentage),
	 * will return a positive value less than 100 [i.e. discounts from 0% to 100% (non-inclusive)]
	 * @param hotel this is the Hotel object
	 * @param walkIn this checks if guest has prior reservation or is walking in to book hotel
	 * @return this is the makeReservation object
	 * @throws ArrayException occurs upon an error, calls array exception and throws a custom exception
	 */
	public static Reservation makeReservation(Hotel hotel, boolean walkIn) throws ArrayException{
	/**
	 * # Initialisation
	 */
		Scanner sc = new Scanner(System.in);
		int numOfGuest=0, maxOccupancy=0, index=-1;
		boolean overlap = false;
		Room room, daRoom;
		Reservation reservation;
		ArrayList<Room> rooms = new ArrayList<Room>();
		LocalDateTime checkInDateTime, checkOutDateTime;
		
		/**
		 * # Ask for room type (Not hardcoded!)
		 */
		System.out.println("Choose Room Type (Select Number):");
		for (int i=0; i<TypeOfRoom.values().length; i++) {
			System.out.printf("%d. %s\n", i+1, TypeOfRoom.values()[i]);
		}
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0 || choice>TypeOfRoom.values().length) {
			System.out.println("Enter a valid choice or i'll cut your pay!!");
			choice = sc.nextInt(); sc.nextLine();
		}
		TypeOfRoom roomType = TypeOfRoom.values()[choice-1];
		
	/**
	 * # Get vacant (Rooms with VACANT status) room of desired type and obtain max occupancy.
	 * If no vacant room, get all rooms with specified type in an array
	 */
		room = hotel.getVacantRoom(roomType);
		if (room!=null) {maxOccupancy = room.getMaxOccupancy();}
		else {rooms = hotel.getSameTypeRooms(roomType); maxOccupancy = rooms.get(0).getMaxOccupancy();}
			
	/**
	 * # Entering number of guests
	 */
		System.out.println("Enter number of guests:");
		numOfGuest = sc.nextInt(); sc.nextLine();
		while (numOfGuest<=0) {
			System.out.println("Enter a valid number!");
			numOfGuest = sc.nextInt(); sc.nextLine();
		}
		/**
		 * # Checking if number of guests exceeds room max occupancy limit
		 */
		if (numOfGuest>maxOccupancy) {System.out.println("You have exceeded the maximum occupancy for this room! \nProcess Terminated!"); return null;}
		
		
		/**
		 * # Entering Check In and Check out date time details (CheckOut only if walking in)
		 */
		if (walkIn) {checkInDateTime = LocalDateTime.now();}
		else {checkInDateTime = DateTime.getLocalDateTime("Check In");}
		
		LocalDateTime currentTime = LocalDateTime.now();
		while (checkInDateTime.isBefore(currentTime)) {
			System.out.println("Are you sure? It is already after the intended check in date and time!");
			checkInDateTime = DateTime.getLocalDateTime("Check In");
		}
		System.out.println("----------------------------------------------");
		checkOutDateTime = DateTime.getLocalDateTime("Check Out");
		while (checkOutDateTime.isBefore(checkInDateTime)) {
			System.out.println("You trying to be funny isit?! Cannot check out before checking in!!");
			checkOutDateTime = DateTime.getLocalDateTime("Check Out");
		}
		while (checkOutDateTime.isEqual(checkInDateTime)) {
			System.out.println("You trying to be funny isit?! Cannot check in and out at the same time!!");
			checkOutDateTime = DateTime.getLocalDateTime("Check Out");
		}
				
	/**
	 * Getting room that allows for such a reservation
	 * -	If there is a vacant room, assign reservation to that room
	 * -	If not, select a room that allows for such a reservation in the future
	 * -	Else, reservation is invalid
	 */
		
		/**
		 * # for case where there are no vacant rooms at all
		 */
		if (room==null) {
			/**
			 * For loop to obtain room that allows for such a reservation
			 * -	If room can accommodate the future reservation, assign that room for the reservation
			 * -	If not, find another room.
			 * -	If no rooms, reservation is invalid
			 */
			for (int i=0; i<rooms.size(); i++) {
				daRoom = rooms.get(i);
				
				/**
				 * # Getting all reservations of daRoom
				 */
				ArrayList<Reservation> daRoomReservations = hotel.getRoomReservationList(daRoom);
				
				if (daRoom.getAvail() == AvailStatus.UNDER_MAINTENANCE) {continue;}
				/**
				 * Checking if current reservation timing overlaps with existing reservations
				 * -	once overlap is found, check existing reservations of another room
				 * (break inner for loop)
				 */
					for (int y=0; y<daRoomReservations.size(); y++) {
						Reservation curReservation = daRoomReservations.get(y);
						/**
						 * if checkInDateTime of reservation to be made is in between current reservation
						 * checkInDateTime and checkOutDateTime, there is an overlap
						 */
						if (checkInDateTime.isAfter(curReservation.getCheckInDateTime()) && checkInDateTime.isBefore(curReservation.getCheckOutDateTime())) {overlap=true; break;}
						/**
						 * if checkOutDateTime of reservation to be made is in between current reservation
						 * checkInDateTime and checkOutDateTime, there is an overlap
						 */
						else if (checkOutDateTime.isAfter(curReservation.getCheckInDateTime()) && checkOutDateTime.isBefore(curReservation.getCheckOutDateTime())) {overlap=true; break;}
						/**
						 * if checkInDateTime of reservation to be made is before current reservation
						 * checkInDateTime and checkOutDateTime of reservation to be made is after
						 * current reservation checkOutDateTime, there is also an overlap
						 */
						else if (checkInDateTime.isBefore(curReservation.getCheckInDateTime()) && checkOutDateTime.isAfter(curReservation.getCheckOutDateTime())) {overlap=true; break;}
						/**
						 * if check in time is the same as that of an existing reservation,
						 * there is also an overlap
						 */
						else if (curReservation.getCheckInDateTime() == checkInDateTime) {overlap=true; break;}
						/**
						 * if check out time is the same as that of an existing reservation,
						 * there is also an overlap
						 */
						else if (curReservation.getCheckOutDateTime() == checkOutDateTime) {overlap=true; break;}
					}//end inner for loop
				
				if (overlap) {overlap=false; continue;} //checking reservations of next room if have
				else {index = i; break;} //already found a room		
			}
			
			//if no rooms of requested type can accommodate the reservation, reservation is invalid
			if (index==-1) {
				System.out.println("Cannot make Reservation!\nProcess Terminated!");
				return null;
			}
			
			//if a room is found
			Room thisRoom = rooms.get(index);
			reservation = CreateReservation.createReservation(thisRoom, numOfGuest, checkInDateTime, checkOutDateTime);
			hotel.addReservation(reservation);
		}
		
		/**
		 * # for case where there are already vacant rooms that we can assign reservations to
		 */
		else {
			/**
			 * Creating the Reservation object
			 */
			reservation = CreateReservation.createReservation(room, numOfGuest, checkInDateTime, checkOutDateTime);
			/**
			 * Add Reservation object to Hotel
			 */
			hotel.addReservation(reservation);
		}
		
		/**
		 * Print success statement
		 */
		System.out.println("Reserved Room Successfully!!");
		System.out.println("Reserver: " + reservation.getGuest().getName());
		System.out.println("Room Type: " + reservation.getRoom().getRoomType());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm");
		System.out.println("Check In: " + reservation.getCheckInDateTime().format(formatter));
		
		/**
		 * this returned reservation object will be used in the CheckIn class for walk-in customers
		 */
		return reservation;
	}
}
