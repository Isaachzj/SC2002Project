package app_hotel;

import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
import hotel.*;
import reservation.*;
import room.*;
import list_methods.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.Duration;

public class CheckIn {
	public static void checkIn(Hotel hotel) throws ArrayException{
		
		//Obtain Reservation object
		Reservation reservation = hotel.getReservation();
		if (reservation==null) {
			System.out.println("Reservation not found! Ask if the customer wants to make a reservation!");
			return;
		}
		
		//Compare Date Time differences
		LocalDateTime currentDateTime = DateTime.getLocalDateTime("Current");
		LocalDateTime checkInDateTime = reservation.getCheckInDateTime();
		if (currentDateTime.isBefore(checkInDateTime.plusHours(1))) { //Check if check in is not 1 hour after indicated check in time
			if (reservation.getRoom().getAvail()==AvailStatus.OCCUPIED) {
				System.out.println("Already Checked in");
			}
			else {
				reservation.getRoom().setAvail(AvailStatus.OCCUPIED);
				System.out.println("Checked in!");
			}
		}
		else { //Remove reservation and guests from lists if check in is after 1 hour from indicated time
			hotel.removeGuests(reservation);
			hotel.removeReservation(reservation);
			System.out.println("Guests are late. Reservation terminated. DEAL WITH IT!!");
			return;
		}
		
		//adds guests in reservation to the guest list
		hotel.addGuests(reservation);
	}
}
