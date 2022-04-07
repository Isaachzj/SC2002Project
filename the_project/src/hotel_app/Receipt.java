package hotel_app;
import reservation.*;
import room.*;
import guest.*;
import food_related.*;

public class Receipt{
	public static void info(Reservation reservation) {
		System.out.println("========== Receipt ==========");
		System.out.println("Room " + reservation.getRoom().getRoomNum());
		System.out.println("Check In: " + reservation.getCheckInDateTime());
		System.out.println("Number of people staying: " + reservation.getNumOfGuest());
		System.out.println();
		System.out.println("Reservation made under:");
		System.out.println("--------------------------------------");
		DisplayGuestInfo.printInfo(reservation.getArray().get(0));
		System.out.println("==========================");
		DisplayRoomService drm = new DisplayRoomService(reservation.getRoom().getRoomService());
		drm.printArray();
		double grandTotal = GrandTotalTabulator.grandTotal(reservation);
		System.out.println("++++++++++++++++++++++++++");
		System.out.printf("Grand Total: $%.2f\n", grandTotal);
		
	}
	
}
