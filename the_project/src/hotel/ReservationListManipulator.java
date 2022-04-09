package hotel;

import guest.*;
import reservation.*;
import list_methods.*;
import java.util.*;

public class ReservationListManipulator implements AddGivenObject, RemoveGivenObject, Get{
	private Hotel hotel;
	
	public ReservationListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	
	//To be called right after creating reservation (pass reservation object in)
	public void addList(Object daReservation) throws ArrayException {
		Reservation reservation;
		if (daReservation==null) {throw new ArrayException("Reservation Terminated!!");} //will be thrown when num of guests exceeds max occupancy when creating reservation
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		hotel.getReservationList().add(reservation);
	}
	
	//To be called in checkout function
	public void removeList(Object daReservation) throws ArrayException {
		Reservation reservation;
		if (daReservation==null) {throw new ArrayException("Error!!");}
		else if (!(daReservation instanceof Reservation)) { throw new ArrayException("Error!!");}
		else {reservation = (Reservation) daReservation;} 
		
		hotel.getReservationList().remove(reservation);
	}
	
	//To be called in checkin function
	public Reservation getEntry() {
		Reservation reservation;
		boolean found=false;
		int index = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Reserver's name:");
		String reserverName = sc.nextLine();
		System.out.println("Enter the Reserver's mobile number");
		String mobileNumber = sc.nextLine();
		
		//Compare with guest
		for (int i=0; i<hotel.getReservationList().size(); i++) {
			Reservation curReservation = hotel.getReservationList().get(i);
			Guest reserver = curReservation.getArray().get(0); //gets the first reserver
			//if inputed name matches reserver's name in reservation
			if (reserverName.compareTo(reserver.getName())==0 && mobileNumber.compareTo(reserver.getContacts().getMobileNumber())==0) {
				index = i; found = true;
			}
		}
		
		//if not found return null
		if (!found) return null;
		
		//get reservation and return it
		reservation = hotel.getReservationList().get(index);
		return reservation;
	}	
}
