package hotel;

import guest.*;
import reservation.*;
import list_methods.*;
import java.util.*;

public class GuestListManipulator implements AddGivenObject, RemoveGivenObject {
	private Hotel hotel;
	
	public GuestListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public void addEntry(Object daReservation) throws ArrayException{
		Reservation reservation;
		
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		//Traversing array of guest in reservation and adding them to Hotel Guest List
		for (int i=0; i<reservation.getGuestList().size(); i++) {
			Guest guest = reservation.getGuestList().get(i);
			hotel.getGuestList().add(guest);	
		}
	}
	
	//Checkout function will pass all guest object stored in reservation to this to remove
	public void removeEntry(Object daReservation) throws ArrayException{
		Reservation reservation;
		
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		//Traversing array of guest in reservation and adding them to Hotel Guest List
		for (int i=0; i<reservation.getGuestList().size(); i++) {
			Guest guest = reservation.getGuestList().get(i);
			hotel.getGuestList().remove(guest);	
		}
	}


	//Asks for guest name and mobile number and retrieves the correct Guest object
	public Guest getEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Guest name:");
		String guestName = sc.nextLine().toLowerCase();
		System.out.println("Enter the Guest mobile number:");
		String mobileNumber = sc.nextLine();
		
		//Compare with guest
		for (int i=0; i<hotel.getGuestList().size(); i++) {
			Guest curGuest = hotel.getGuestList().get(i);
			if (guestName.compareTo(curGuest.getName().toLowerCase())==0 && mobileNumber.compareTo(curGuest.getContacts().getMobileNumber())==0) {
				return curGuest;
			}
		}
		
		return null;
	}
	
}
