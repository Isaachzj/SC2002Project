package app_hotel;

import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
import hotel.*;
import reservation.*;
import room.*;
import list_methods.*;
import java.util.*;

import days_date_time.DateTime;

import java.time.LocalDateTime;
import java.time.Duration;
/**
 * This is a Boundary Class; as it is used as a user interface;
 * This interface allows the guests to check in to the hotel
 * This covers both Walk-in (i.e. option '1'; guests with no prior reservations); and
 * covers Prior Reservation (i.e. option '2'; guests with reservations done beforehand)  
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 *
 */
public class CheckIn {
	
	public static void checkIn(Hotel hotel) throws ArrayException{
		Scanner sc = new Scanner(System.in);
		Reservation reservation;
		System.out.println("Choose an option\n1. Walk-In\n2. Prior Reservation");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0 || choice>2) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
	/**
	 * # Walk-In vs normal checking in
	 */
		/**
		 * # If walking in, make the reservation for the person then proceed as per normal
		 */
		if (choice==1) {
			reservation = MakeReservation.makeReservation(hotel, true);
			/**
			 * # Setting room status to OCCUPIED
			 */
			reservation.getRoom().setAvail(AvailStatus.OCCUPIED);
			System.out.println("Checked in successfully!");
		}	
		/**
		 * # For normal check in
		 */
		else {
			/**
			 * # Obtain Reservation object
			 */
			reservation = hotel.getReservation();
			
			/**
			 * # If no such reservation exists beforehand
			 */
			if (reservation==null) {
				System.out.println("Reservation not found! Ask if the customer wants to walk-in!");
				return;
			}
			
			/**
			 * # if the guest already checked in earlier
			 */
			if (reservation.getRoom().getAvail()==AvailStatus.OCCUPIED) {
				System.out.println("Already Checked in");
				return;
			}		
		
			/**
			 * # Compare Date Time differences to see if reservation is valid
			 */
			LocalDateTime currentDateTime = LocalDateTime.now();
			LocalDateTime checkInDateTime = reservation.getCheckInDateTime();
			/**
			 * # Check if check in is not 1 hour after indicated check in time
			 */
			if (currentDateTime.isBefore(checkInDateTime.plusHours(1))) { 
				/**
				 * # Setting room status to OCCUPIED
				 */
				reservation.getRoom().setAvail(AvailStatus.OCCUPIED);
				System.out.println("Checked in successfully!");
			}
			else { 
				/**
				 * # Remove reservation if check in is after 1 hour from indicated time
				 */
				hotel.removeReservation(reservation);
				System.out.println("Guests are late. Reservation terminated. DEAL WITH IT!!");
				return;
			}						
		}

		/**
		 * # adds guests in reservation to the guest list
		 */
		hotel.addGuests(reservation);
	}
}
