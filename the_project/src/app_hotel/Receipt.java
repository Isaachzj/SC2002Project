package app_hotel;
import reservation.*;
import room.*;
import guest.*;
import food_related.*;
import java.time.format.DateTimeFormatter;

public class Receipt{
	public static void info(Reservation reservation) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm");
		System.out.println("========== Receipt ==========");
		System.out.printf("(%s) Room Number %s\n", reservation.getRoom().getRoomType(), reservation.getRoom().getRoomNum());
		System.out.println("Room Rates:\n");
		reservation.getRoom().getRate().info();
		System.out.println("Check In:  " + reservation.getCheckInDateTime().format(formatter));
		System.out.println("Check Out: " + reservation.getCheckOutDateTime().format(formatter));
		System.out.println("Number of guests: " + reservation.getNumOfGuest());
		System.out.println();
		System.out.println("Reservation Made Under:");
		System.out.println("--------------------------------------");
		DisplayGuestInfo.printInfo(reservation.getGuestList().get(0));
		System.out.println("==========================");
		DisplayRoomService drm = new DisplayRoomService(reservation.getRoom().getRoomService());
		drm.printArray();
		double grandTotal = GrandTotalTabulator.grandTotal(reservation);
		System.out.println("++++++++++++++++++++++++++");
		System.out.printf("Grand Total: $%.2f\n\n", grandTotal);
		
	}
	
}
