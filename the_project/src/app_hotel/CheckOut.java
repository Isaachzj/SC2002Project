package app_hotel;

import enumeration.TypeOfRoom;
import hotel.*;
import reservation.*;
import room.*;
import list_methods.*;
import java.util.*;
import java.time.LocalDateTime;

public class CheckOut {
	
	public static void checkOut(Hotel hotel) throws ArrayException {

		Reservation reservation = hotel.getReservation();
		if (reservation==null) {
			System.out.println("Reservation not found! Guest does not exist! (GHOSTTTTT)");
			return;
		}
		Receipt.info(reservation);
		//remove guests
		hotel.removeGuests(reservation);
		//remove reservation
		hotel.removeReservation(reservation);
		//resetting room to vacant (if have waitlist, need to search if have somemore reservation first (if true, change status to reserved)
		reservation.getRoom().reset();
		
	}
}
