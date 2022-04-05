package reservation;

import java.util.Scanner;
import java.time.LocalDate;
import Room.*;
import enumeration.AvailStatus;

public class CreateReservation {
	public static Reservation createReservation(Room room) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Check In Dates:");
		System.out.println("Enter Year:");
		int checkInYear = sc.nextInt();
		System.out.println("Enter Month in Number format (E.g. 1 for Jan, 2 for Feb) :");
		int checkInMonth = sc.nextInt();
		System.out.println("Enter Day:");
		int checkInDay = sc.nextInt();
		LocalDate checkInDate = LocalDate.of(checkInYear, checkInMonth, checkInDay);
		System.out.println("Enter Check In Time in 24 hours format:");
		int checkInTime = sc.nextInt();
		System.out.println("----------------------------------------------");
		System.out.println("Enter Check out Dates:");
		System.out.println("Enter Year:");
		int checkOutYear = sc.nextInt();
		System.out.println("Enter Month in Number format (E.g. 1 for Jan, 2 for Feb) :");
		int checkOutMonth = sc.nextInt();
		System.out.println("Enter Day:");
		int checkOutDay = sc.nextInt();
		LocalDate checkOutDate = LocalDate.of(checkOutYear, checkOutMonth, checkOutDay);
		System.out.println("Enter Check In Time in 24 hours format:");
		int checkOutTime = sc.nextInt();
		long numOfWeekday = LengthOfStay.calcWeekDays(LocalDate.of(checkInYear, checkInMonth, checkInDay), LocalDate.of(checkOutYear, checkOutMonth, checkOutDay));
		long numOfWeekend = LengthOfStay.calcWeekDays(LocalDate.of(checkInYear, checkInMonth, checkInDay), LocalDate.of(checkOutYear, checkOutMonth, checkOutDay));
		
		System.out.println("Enter number of guests:");
		int numOfGuest = sc.nextInt();
		Reservation reservation = new Reservation(room, checkInDate, checkInTime, checkOutDate, checkOutTime, numOfWeekday, numOfWeekend, numOfGuest);
		
		/*GuestListManipulator GLM = new GuestListManipulator(reservation);
		GuestTestApp GuestApp = new GuestTestApp();
		Guest guest;
		guest = CreateGuest.createReserver();
		GLM.addList(guest);
		for (int i=1;i<numOfGuest;i++) {
			guest = CreateGuest.createGuest();
			GLM.addList(guest);
		}
		*/
		room.setAvail(AvailStatus.RESERVED);
		
		return reservation;
	}
}
