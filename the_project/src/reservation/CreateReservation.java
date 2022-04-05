package reservation;

import java.util.Scanner;
import java.time.LocalDate;
import Room.*;
import hotel.*;
import guest.*;
import list_methods.ArrayException;
import enumeration.AvailStatus;

public class CreateReservation {
	public static Reservation createReservation(Room room) throws ArrayException{
		Scanner sc = new Scanner(System.in);
		
		//Entering number of guests
		System.out.println("Enter number of guests:");
		int numOfGuest = sc.nextInt();
		int maxOccupancy = room.getMaxOccupancy();
		while (numOfGuest<=0) {
			System.out.println("Enter a valid number!");
			numOfGuest = sc.nextInt(); sc.nextLine();
		}
		//Checking if number of guests exceeds room max occupancy limit
		if (numOfGuest>maxOccupancy) {System.out.println("You have exceeded the maximum occupancy for this room!"); return null;}
		
		//Enter check in date
		System.out.println("Enter Check In Dates:");
		System.out.println("Enter Year:");
		int checkInYear = sc.nextInt(); sc.nextLine();
		while (checkInYear<2022) {
			System.out.println("Enter a valid year!");
			checkInYear = sc.nextInt(); sc.nextLine();
		}	
		System.out.println("Enter Month in Number format (E.g. 1 for Jan, 2 for Feb) :");
		int checkInMonth = sc.nextInt(); sc.nextLine();
		while (checkInMonth<=0 || checkInMonth>12) {
			System.out.println("Enter a valid month!");
			checkInMonth = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Day:");
		int checkInDay = sc.nextInt(); sc.nextLine();
		while (checkInDay<=0 || checkInDay>31) {
			System.out.println("Enter a valid day!");
			checkInMonth = sc.nextInt(); sc.nextLine();
		}		
		LocalDate checkInDate = LocalDate.of(checkInYear, checkInMonth, checkInDay);
		//Enter check in time
		System.out.println("Enter Check In Time in 24 hours format:");
		int checkInTime = sc.nextInt(); sc.nextLine();
		//IMPLEMENT ERROR CHECKING HERE
		while (checkInTime<=0 || checkInTime>2359) {
			System.out.println("Enter a valid day!");
			checkInTime = sc.nextInt(); sc.nextLine();
		}
		System.out.println("----------------------------------------------");
		System.out.println("Enter Check out Dates:");
		System.out.println("Enter Year:");
		int checkOutYear = sc.nextInt(); sc.nextLine();
		while (checkInYear<2022) {
			System.out.println("Enter a valid year!");
			checkInYear = sc.nextInt(); sc.nextLine();
		}	
		System.out.println("Enter Month in Number format (E.g. 1 for Jan, 2 for Feb) :");
		int checkOutMonth = sc.nextInt(); sc.nextLine();
		while (checkInMonth<=0 || checkInMonth>12) {
			System.out.println("Enter a valid month!");
			checkInMonth = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Day:");
		int checkOutDay = sc.nextInt();		
		while (checkInDay<=0 || checkInDay>31) {
			System.out.println("Enter a valid day!");
			checkInMonth = sc.nextInt(); sc.nextLine();
		}		
		LocalDate checkOutDate = LocalDate.of(checkOutYear, checkOutMonth, checkOutDay);
		System.out.println("Enter Check In Time in 24 hours format:");
		int checkOutTime = sc.nextInt(); sc.nextLine();
		//IMPLEMENT ERROR CHECKING HERE
		while (checkOutTime<=0 || checkOutTime>2359) {
			System.out.println("Enter a valid day!");
			checkInTime = sc.nextInt(); sc.nextLine();
		}
		long numOfWeekday = LengthOfStay.calcWeekDays(LocalDate.of(checkInYear, checkInMonth, checkInDay), LocalDate.of(checkOutYear, checkOutMonth, checkOutDay));
		long numOfWeekend = LengthOfStay.calcWeekDays(LocalDate.of(checkInYear, checkInMonth, checkInDay), LocalDate.of(checkOutYear, checkOutMonth, checkOutDay));
		
		//Create Reservation Object
		Reservation reservation = new Reservation(room, checkInDate, checkInTime, checkOutDate, checkOutTime, numOfWeekday, numOfWeekend, numOfGuest);
		//Add guest to reservation guest list
		reservation.addGuest();
		
		//passes Reservation object to the room
		room.setReservation(reservation);
		room.setAvail(AvailStatus.RESERVED);
		
		return reservation; //returns Reservation object to add to reservation list in Hotel object
	}
}
