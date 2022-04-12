package hotel;

import guest.*;
import reservation.*;
import list_methods.*;
import java.util.*;

public class GuestListManipulator implements AddGivenObject, RemoveGivenObject {
	/**
	 * this is the Hotel object (private attribute)
	 */
	private Hotel hotel;
	
	public GuestListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	/**
	 * Adds the specified entry from the parameter into the Reservation
	 */
	public void addEntry(Object daReservation) throws ArrayException{
		Reservation reservation;
		
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		/**
		 * Traversing array of guest in reservation and adding them to Hotel Guest List
		 */
		for (int i=0; i<reservation.getGuestList().size(); i++) {
			Guest guest = reservation.getGuestList().get(i);
			hotel.getGuestList().add(guest);	
		}
	}
	
	/**
	 * Checkout function will pass all guest object stored in reservation to this to remove
	 */
	public void removeEntry(Object daReservation) throws ArrayException{
		Reservation reservation;
		
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		/**
		 * Traversing array of guest in reservation and adding them to Hotel Guest List
		 */
		for (int i=0; i<reservation.getGuestList().size(); i++) {
			Guest guest = reservation.getGuestList().get(i);
			hotel.getGuestList().remove(guest);	
		}
	}


	/**
	 * Retrieves Guest object using mobile number and name
	 * Asks for guest name and mobile number and retrieves Guest object accordingly
	 * @return the Guest object would be returned using the getEntry() method - if it is found in the guest list;
	 * else, null would be returned if the Guest object is not found in the guest list
	 */
	public Guest getEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Guest name:");
		String guestName = sc.nextLine().toLowerCase();
		System.out.println("Enter the Guest mobile number:");
		String mobileNumber = sc.nextLine();
		
		/**
		 * # Compare with guest
		 */
		for (int i=0; i<hotel.getGuestList().size(); i++) {
			Guest curGuest = hotel.getGuestList().get(i);
			if (guestName.compareTo(curGuest.getName().toLowerCase())==0 && mobileNumber.compareTo(curGuest.getContacts().getMobileNumber())==0) {
				return curGuest;
			}
		}
		
		return null;
	}
	
}
