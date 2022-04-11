package reservation;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;

import hotel.*;
import guest.*;
import list_methods.ArrayException;
import room.*;
import enumeration.AvailStatus;

public class CreateReservation {
	public static Reservation createReservation(Room room, int numOfGuest, LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime) throws ArrayException{
		Scanner sc = new Scanner(System.in);

		long numOfWeekday = LengthOfStay.calcWeekDays(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate());
		long numOfWeekend = LengthOfStay.calcWeekEnds(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate());
		
		//Create Reservation Object
		Reservation reservation = new Reservation(room, checkInDateTime, checkOutDateTime, numOfWeekday, numOfWeekend, numOfGuest);
		//Add guest to reservation guest list

		//Creates guests and add guests to reservation guest list
		reservation.addGuest();
		
		//passes Reservation object to the room if the room was originally vacant (no existing reservations)
		if(room.getReservation()==null) {
			room.setReservation(reservation);
			room.setAvail(AvailStatus.RESERVED);
		}
		
		//NOTE: reset method in room will auto assign upcoming reservation to reservation attribute in room after guests checkout

		return reservation; //returns Reservation object to add to reservation list in Hotel object
	}
}
