package app_hotel;

import hotel.*;
import reservation.*;
import list_methods.*;
import days_date_time.*;
import java.util.*;
import java.time.*;

public class CheckOut {
	
	public static void checkOut(Hotel hotel) throws ArrayException {
		Scanner sc = new Scanner(System.in);

		Reservation reservation = hotel.getReservation();
		if (reservation==null) {
			System.out.println("Reservation not found! Reserver does not exist! (GHOSTTTTT)");
			return;
		}
		System.out.println("Does the customer have any discount?");
		System.out.println("Enter discount. E.g. Enter 20 for 20% discount");
		double discount = sc.nextDouble();
		while (true) {
			if (discount>=100) {
				System.out.println("100% DISCOUNT? WHO PAY? YOU PAY?");
				System.out.println("Enter discount. E.g. Enter 20 for 20% discount");
				discount = sc.nextDouble();
				continue;
			}
			else if (discount<0) {
				System.out.println("Negative discount? Are you scamming the customer?");
				System.out.println("Enter discount. E.g. Enter 20 for 20% discount");
				discount = sc.nextDouble();
				continue;
			}
			break;
		}
		//set checkOutDateTime to actual current time now and re-update numOfWeekday and numOfWeekend
		LocalDateTime actualCheckOut = LocalDateTime.now();
		if (LocalDateTime.now().isAfter(reservation.getCheckOutDateTime())) {
			reservation.setNumOfWeekday(LengthOfStay.calcWeekDays(reservation.getCheckInDateTime().toLocalDate(), actualCheckOut.toLocalDate()));
			reservation.setNumOfWeekend(LengthOfStay.calcWeekEnds(reservation.getCheckInDateTime().toLocalDate(), actualCheckOut.toLocalDate()));
		}
		
		Receipt.info(reservation, discount, actualCheckOut);
	//remove guests
		hotel.removeGuests(reservation);
	//remove reservation
		hotel.removeReservation(reservation); 
	//resetting room according to whether there are still more reservations
		ArrayList<Reservation> roomReservationList = hotel.getRoomReservationList(reservation.getRoom());
		Reservation earliestReservation = hotel.getEarliestReservation(roomReservationList);
		reservation.getRoom().reset(earliestReservation);
	}
}
