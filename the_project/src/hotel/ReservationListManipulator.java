package hotel;

import guest.*;
import room.*;
import reservation.*;
import list_methods.*;
import java.util.*;
import java.time.LocalDateTime;
/**
 * Allows changes to be made to the Reservation object by the use of addEntry method
 * and removeEntry method, as well as getEntry method.
 * Includes method overloading
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class ReservationListManipulator implements AddGivenObject, RemoveGivenObject, Get {
	
	/**
	 * This is the Hotel object who has the reservation list that is to be manipulated
	 */
	private Hotel hotel;
	/**
	 * This is the Reservation List Manipulator
	 * @param hotel assigns hotel object to ReservationListManipulator so that the ReservationListManipulator can manipulate the reservation list in this hotel
	 */
	public ReservationListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	
	/**
	 * To be called right after creating reservation (pass reservation object in).
	 * This method allows the reservation Object to be added;
	 * an ArrayExceotion would be thrown upon any error encountered
	 */
	public void addEntry(Object daReservation) throws ArrayException {
		Reservation reservation;
		if (daReservation==null) {throw new ArrayException("Reservation Terminated!!");} //will be thrown when num of guests exceeds max occupancy when creating reservation
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		hotel.getReservationList().add(reservation);
	}
	
	/**
	 * To be called in checkout function
	 * This method allows the reservation Object to be removed;
	 * an ArrayException would be thrown upon any error encountered
	 */
	public void removeEntry(Object daReservation) throws ArrayException {
		Reservation reservation;
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		hotel.getReservationList().remove(reservation);
	}
	
	/**
	 * To be called in checkin function
	 * this method allows the Reservation Object to be instantiated
	 */
	public Reservation getEntry() {
		Reservation reservation;
		boolean found=false;
		int index = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Reserver's name:");
		String reserverName = sc.nextLine().toLowerCase();
		System.out.println("Enter the Reserver's mobile number");
		String mobileNumber = sc.nextLine();
		
		/**
		 * # Compare with guest
		 */
		for (int i=0; i<hotel.getReservationList().size(); i++) {
			Reservation curReservation = hotel.getReservationList().get(i);
			Guest reserver = curReservation.getGuestList().get(0); //gets the first reserver
			/**
			 * # if inputed name matches reserver's name in reservation
			 */
			if (reserverName.compareTo(reserver.getName().toLowerCase())==0 && mobileNumber.compareTo(reserver.getContacts().getMobileNumber())==0) {
				index = i; found = true;
			}
		}
		
		/**
		 * # if not found return null
		 */
		if (!found) return null;
		
		/**
		 * # get reservation and return it
		 */
		reservation = hotel.getReservationList().get(index);
		return reservation;
	}
	
	//To be called in checkout class (OVERLOADED)
	/**
	 * this method is the opposite of the above method; it returns
	 * the Reservation Object for the given ArrayList of reservation
	 * Method Overloading is used in this case
	 * @param reservationList this is the ArrayList of reservation for
	 * the Reservation object to be retrieved from
	 * @return this is the Reservation object that is retrieved
	 */
	public Reservation getEntry(ArrayList<Reservation> reservationList) {
		Reservation reservation=null;
		LocalDateTime earliestTime = LocalDateTime.MAX;	
		/**
		 * if no more reservations
		 */
		if (reservationList.size()==0) {
			return reservation;
		}
		/**
		 * getting earliest reservation
		 */
		for (int i=0; i<reservationList.size(); i++) {
			Reservation curReservation = reservationList.get(i);
			if (curReservation.getCheckInDateTime().isBefore(earliestTime)) {
				earliestTime = curReservation.getCheckInDateTime();
				reservation = curReservation;
			}//end if
		}//end for
		return reservation;
	}	
	
	//To be called in make reservation class 
	/**
	 * this method is to be called in the make reservation class upon its instantiation
	 * @param room this is the Room object for which the arraylist of 
	 * reservation can be retrieved from 
	 * @return this is the arraylist that is retrieved
	 */
	public ArrayList<Reservation> getRoomReservations(Room room) {
		//This arraylist stores all reservations of the room
		ArrayList<Reservation> roomReservationList = new ArrayList<Reservation>();
		
		for (int i=0; i<hotel.getReservationList().size(); i++) {
			Reservation reservation = hotel.getReservationList().get(i);
			if (reservation.getRoom() == room) {
				roomReservationList.add(reservation);
			}//end if
		}//end for
		return roomReservationList;
	}
	
}
