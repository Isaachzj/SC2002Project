package reservation;

import room.*;
import room_rate.*;

public class GrandTotalTabulator {
	/**
	 * grandTotal method calculates the total bill incurred under the Reservation object.
	 * The total bill incurred includes the roomBill and roomServiceBill
	 * roomBill consist of the bills incurred during the guest's stay; such as Food items ordered from the Menu
	 * roomServiceBill consist of the bill incurred given the room booked and number of weekdays and weekends stayed
	 * @param reservation this is the Reservation object for the tabulation of the total bill incurred
	 * @return this is the total bill incurred through the stay in the Hotel
	 */
	public static double grandTotal(Reservation reservation) {
		Room room = reservation.getRoom();
		
		/**
		 * # Getting Room Bill based on length of stay
		 */
		long numOfWeekdays = reservation.getNumOfWeekday();
		long numOfWeekends = reservation.getNumOfWeekend();
		double roomBill = RoomBillTabulator.calculateRoomBill(room, numOfWeekdays, numOfWeekends);
		
		/**
		 * # Getting total bill for orders
		 */
		double roomServiceBill = room.getRoomService().getRoomServiceBill();
		
		return roomBill + roomServiceBill;
	}
}
