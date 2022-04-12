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
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an option\n1. Walk-In\n2. Prior Reservation");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0 || choice>2) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
		//If walking in, make the reservation for the person then proceed as per normal
		if (choice==1) {
			MakeReservation.makeReservation(hotel);
		}
		
		//Obtain Reservation object
		Reservation reservation = hotel.getReservation();
		
		if (reservation==null) {
			System.out.println("Reservation not found! Ask if the customer wants to walk-in!");
			return;
		}
		
		//if the guest already checked in earlier
		else if (reservation.getRoom().getAvail()==AvailStatus.OCCUPIED) {
			System.out.println("Already Checked in");
			return;
		}		
		
		//Compare Date Time differences
		LocalDateTime currentDateTime = DateTime.getLocalDateTime("Current");
		LocalDateTime checkInDateTime = reservation.getCheckInDateTime();
		if (currentDateTime.isBefore(checkInDateTime.plusHours(1))) { //Check if check in is not 1 hour after indicated check in time
			
			reservation.getRoom().setAvail(AvailStatus.OCCUPIED);
			System.out.println("Checked in successfully!");
		}
		else { 
			//Remove reservation if check in is after 1 hour from indicated time
			hotel.removeReservation(reservation);
			System.out.println("Guests are late. Reservation terminated. DEAL WITH IT!!");
			return;
		}
		
		//adds guests in reservation to the guest list
		hotel.addGuests(reservation);
	}
}
