package reservation;

import room.*;
import room_rate.*;

public class GrandTotalTabulator {
	public static double grandTotal(Reservation reservation) {
		Room room = reservation.getRoom();
		
		// Getting Room Bill based on length of stay
		long numOfWeekdays = reservation.getNumOfWeekday();
		long numOfWeekends = reservation.getNumOfWeekend();
		double roomBill = RoomBillTabulator.calculateRoomBill(room, numOfWeekdays, numOfWeekends);
		
		//Getting total bill for orders
		double roomServiceBill = room.getRoomService().getRoomServiceBill();
		
		return roomBill + roomServiceBill;
	}
}
