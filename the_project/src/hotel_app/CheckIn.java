package hotel_app;

import enumeration.TypeOfRoom;
import hotel.*;
import reservation.*;
import room.*;
import list_methods.*;
import java.util.*;
import java.time.LocalDateTime;

public class CheckIn {
	public static void checkIn(Hotel hotel) throws ArrayException{
		
		//Obtain Reservation object
		Reservation reservation = hotel.getReservation();
		if (reservation==null) {
			System.out.println("Reservation not found! Ask if the customer wants to make a reservation!");
			return;
		}
		
		//Compare Date Time differences
		LocalDateTime curDateTime = LocalDateTime.now();
		LocalDateTime checkInDateTime = reservation.getCheckInDateTime();
		
		
		
		//Check if check in is not 1 hour after indicated check in time
		
		//Checking in
		//Update Guest List of Hotel
		
		//adds guests in reservation to the guest list
		hotel.addGuests(reservation);
	}
		
}
