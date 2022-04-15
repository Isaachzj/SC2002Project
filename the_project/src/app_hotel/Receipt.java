package app_hotel;
import reservation.*;
import room.*;
import room_features.*;
import guest.*;
import food_related.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt{
	public static void info(Reservation reservation, double discount, LocalDateTime actualCheckOut) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm");
		System.out.println("=========================== Receipt ===========================");
		System.out.printf("(%s) Room Number %s\n", reservation.getRoom().getRoomType(), reservation.getRoom().getRoomNum());
		//Room Rates and stay details
		reservation.getRoom().getRate().info();
		System.out.println("Check In:  " + reservation.getCheckInDateTime().format(formatter));
		System.out.println("Intended Check Out: " + reservation.getCheckOutDateTime().format(formatter));
		System.out.println("Actual Check Out: " + actualCheckOut.format(formatter));
		System.out.printf("Number of Weekdays: %d\n", reservation.getNumOfWeekday());
		System.out.printf("Number of Weekends: %d\n", reservation.getNumOfWeekend());
		System.out.println("Number of guests: " + reservation.getNumOfGuest());
		System.out.println();
		
		//Room feature details
		DisplayFeatures df = new DisplayFeatures(reservation.getRoom().getRoomFeatures());
		df.printAll();
		System.out.println();
		
		//Reserver's information
		System.out.println("RESERVATION MADE UNDER:");
		System.out.println("--------------------------------");
		DisplayGuestInfo.printInfo(reservation.getGuestList().get(0));
		
		//Displays all Orders
		DisplayRoomService drm = new DisplayRoomService(reservation.getRoom().getRoomService());
		drm.printArray();
	
		//Grand Total 
		double grandTotal = reservation.calcGrandTotal();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		System.out.printf("Total: $%.2f\n", grandTotal);
		System.out.printf("Discount: %.1f%%\n", discount); //%% to escape % sign
		System.out.println("--------------------------------------------");
		System.out.printf("Grand Total: $%.2f\n\n", grandTotal * (100-discount)/100);
		
	}
	
}
