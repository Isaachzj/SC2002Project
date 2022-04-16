package reservation;

import java.util.Scanner;

import days_date_time.LengthOfStay;

import java.time.LocalDateTime;
import java.time.LocalDate;

import hotel.*;
import guest.*;
import list_methods.ArrayException;
import room.*;
import enumeration.AvailStatus;

public class CreateReservation {
	/**
	 * Instantiation of the Reservation object
	 * this includes details such as the room, number of guest,
	 * check-in date-time and also check-out date-time
	 * When reset method in room called; will auto assign upcoming reservation
	 * to reservation attribute in room after guests checkout
	 * 
	 * @param room this is the Room object of the reservation
	 * @param numOfGuest this is the number of guest that would be staying
	 * in the hotel for the reservation
	 * @param checkInDateTime this is the check in date of the reservation.
	 * The check in date will always be before the check out date.
	 * @param checkOutDateTime this is the check out date of the reservation.
	 * The check out date will always be after the check in date.
	 * @return the Reservation object; createReservation would be instatiated and returned.
	 * The returned Reservation object to add to reservation list in Hotel object
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public static Reservation createReservation(Room room, int numOfGuest, LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime) throws ArrayException{
		Scanner sc = new Scanner(System.in);

		long numOfWeekday = LengthOfStay.calcWeekDays(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate());
		long numOfWeekend = LengthOfStay.calcWeekEnds(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate());
		
		/**
		 * # Create Reservation Object
		 */
		Reservation reservation = new Reservation(room, checkInDateTime, checkOutDateTime, numOfWeekday, numOfWeekend, numOfGuest);
		/**
		 * # Add guest to reservation guest list
		 */

		/**
		 * # Creates guests and add guests to reservation guest list
		 */
		reservation.addGuest();
		
		/**
		 * # passes Reservation object to the room if the room was
		 * originally vacant (no existing reservations)
		 */
		if(room.getReservation()==null) {
			room.setReservation(reservation);
			room.setAvail(AvailStatus.RESERVED);
		}
		
		/**
		 * # NOTE: reset method in room will auto assign upcoming reservation
		 * to reservation attribute in room after guests checkout
		 */

		return reservation; //returns Reservation object to add to reservation list in Hotel object
	}
}
