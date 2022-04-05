package hotel;

import guest.Guest;
import reservation.*;
import list_methods.*;

public class ReservationListManipulator implements AddGivenObject, RemoveGivenObject{
	private Hotel hotel;
	
	public ReservationListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	
	//To be called right after creating reservation (pass reservation object in)
	public void addList(Object daReservation) throws ArrayException {
		Reservation reservation;
		if (daReservation==null) {throw new ArrayException("Reservation Terminated!!");} //will be thrown when num of guests exceeds max occupancy when creating reservation
		else if (!(daReservation instanceof Guest)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		hotel.getReservationList().add(reservation);
	}
	
	//To be called in checkout function
	public void removeList(Object daReservation) throws ArrayException {
		Reservation reservation;
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Guest)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		hotel.getReservationList().remove(reservation);
	}
}
