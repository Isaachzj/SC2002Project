package hotel;

import guest.*;
import reservation.*;
import list_methods.*;

public class GuestListManipulator implements AddGivenObject, RemoveGivenObject{
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
	
}
