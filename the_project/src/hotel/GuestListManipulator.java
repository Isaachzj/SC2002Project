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
	
	public void addList(Object daReservation) throws ArrayException{
		Reservation reservation;
		
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		//Traversing array of guest in reservation and adding them to Hotel Guest List
		for (int i=0; i<reservation.getArray().size(); i++) {
			Guest guest = reservation.getArray().get(i);
			hotel.getGuestList().add(guest);	
		}
	}
	
	//Checkout function will pass all guest object stored in reservation to this to remove
	public void removeList(Object daReservation) throws ArrayException{
		Reservation reservation;
		
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		//Traversing array of guest in reservation and adding them to Hotel Guest List
		for (int i=0; i<reservation.getArray().size(); i++) {
			Guest guest = reservation.getArray().get(i);
			hotel.getGuestList().add(guest);	
		}
	}

	/* TO BE DELETED
	//Asks for guest name and ID and retrieves the correct Guest object
	public Guest getEntry() {
		Guest guest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Guest name:");
		String guestName = sc.nextLine();
		
		//Compare with guest
		for (int i=0; i<hotel.getGuestList().size(); i++) {
			Guest curGuest = hotel.getGuestList().get(i);
			
		}
		
		return guest;
	}*/
	
}
