package reservation;

import java.util.Scanner;
import java.time.LocalDateTime;
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
		System.out.println("Enter Check In Hour in 24 hours format:");
		int checkInHour = sc.nextInt(); sc.nextLine();
		while (checkInHour<0 || checkInHour>=24) {
			System.out.println("Enter a valid Hour!");
			checkInHour = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Check In Hour in 24 hours format:");
		int checkInMinute = sc.nextInt(); sc.nextLine();
		while (checkInMinute<0 || checkInMinute>=60) {
			System.out.println("Enter a valid Hour!");
			checkInHour = sc.nextInt(); sc.nextLine();
		}
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
		LocalDateTime checkInDateTime;
		while (true) {
			try {
				checkInDateTime = LocalDateTime.of(checkInYear, checkInMonth, checkInDay, checkInHour, checkInMinute);
				break;
			}
			catch (Exception e) {System.out.println("Enter a valid day:");continue;}
		}	

		System.out.println("----------------------------------------------");
		System.out.println("Enter Check out Dates:");
		System.out.println("Enter Check Out Hour in 24 hours format:");
		int checkOutHour = sc.nextInt(); sc.nextLine();
		while (checkOutHour<0 || checkOutHour>=24) {
			System.out.println("Enter a valid Hour!");
			checkOutHour = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Check In Hour in 24 hours format:");
		int checkOutMinute = sc.nextInt(); sc.nextLine();
		while (checkOutMinute<0 || checkOutMinute>=60) {
			System.out.println("Enter a valid Hour!");
			checkOutHour = sc.nextInt(); sc.nextLine();
		}
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
		int checkOutDay = sc.nextInt(); sc.nextLine();
		LocalDateTime checkOutDateTime;
		while (true) {
			try {
				checkOutDateTime = LocalDateTime.of(checkOutYear, checkOutMonth, checkOutDay, checkOutHour, checkOutMinute);
				break;
			}
			catch (Exception e) {System.out.println("Enter a valid day:");continue;}
		}
		//IMPLEMENT ERROR CHECKING HERE
		long numOfWeekday = LengthOfStay.calcWeekDays(LocalDate.of(checkInYear, checkInMonth, checkInDay), LocalDate.of(checkOutYear, checkOutMonth, checkOutDay));
		long numOfWeekend = LengthOfStay.calcWeekDays(LocalDate.of(checkInYear, checkInMonth, checkInDay), LocalDate.of(checkOutYear, checkOutMonth, checkOutDay));
		
		//Create Reservation Object

		Reservation reservation = new Reservation(room, checkInDateTime, checkOutDateTime, numOfWeekday, numOfWeekend, numOfGuest);
		//Add guest to reservation guest list

		//Creates guests and add guests to reservation guest list
		reservation.addGuest();
		
		//passes Reservation object to the room
		room.setReservation(reservation);
		room.setAvail(AvailStatus.RESERVED);
		
		return reservation; //returns Reservation object to add to reservation list in Hotel object
	}
}
