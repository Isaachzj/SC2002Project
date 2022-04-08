package reservation;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;

import hotel.*;
import guest.*;
import list_methods.ArrayException;
import room.*;
import enumeration.AvailStatus;

public class CreateReservation {
	public static Reservation createReservation(Room room) throws ArrayException{
		Scanner sc = new Scanner(System.in);
		
		//Entering number of guests
		System.out.println("Enter number of guests:");
		int numOfGuest = sc.nextInt();
		int maxOccupancy = room.getMaxOccupancy();
		while (numOfGuest<=0) {
			System.out.println("Enter a valid number!");
			numOfGuest = sc.nextInt(); sc.nextLine();
		}
		//Checking if number of guests exceeds room max occupancy limit
		if (numOfGuest>maxOccupancy) {System.out.println("You have exceeded the maximum occupancy for this room!"); return null;}
		
		//Enter check in date
		LocalDateTime checkInDateTime = DateTime.getLocalDateTime("Check In");

		System.out.println("----------------------------------------------");
		
		LocalDateTime checkOutDateTime = DateTime.getLocalDateTime("Check Out");
		
		//IMPLEMENT ERROR CHECKING HERE
		while (checkOutDateTime.isBefore(checkInDateTime)) {
			System.out.println("You cannot check out before check in!");
			checkOutDateTime = DateTime.getLocalDateTime("Check Out");
		}
		long numOfWeekday = LengthOfStay.calcWeekDays(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate());
		long numOfWeekend = LengthOfStay.calcWeekEnds(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate());
		
		//Create Reservation Object

		Reservation reservation = new Reservation(room, checkInDateTime, checkOutDateTime, numOfWeekday, numOfWeekend, numOfGuest);
		//Add guest to reservation guest list

		//Creates guests and add guests to reservation guest list
		reservation.addGuest();
		
		//passes Reservation object to the room
		room.setReservation(reservation);
		room.setAvail(AvailStatus.RESERVED);
		
		return reservation; //returns Reservation object to add to reservation list in Hotel object
	}
}
