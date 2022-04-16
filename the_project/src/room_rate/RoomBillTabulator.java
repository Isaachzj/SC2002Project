package room_rate;

import room.*;

/**
 * Follows the Single Responsibility Principle as it sole responsibility is to calculate the bill 
 * for only the room and not the room service order;
 */

public class RoomBillTabulator {
	/**
	 * # Constructor
	 */
	/**
	 * calculates the total room bill incurred according to the number and
	 * type of days this room is reserved for;
	 * @param room this is the Room object
	 * this is required as the room rate varies depending on the different types of room object
	 * @param numOfWeekdays number of weekdays guest has reserved this room for
	 * this is required as it is used to calculate bills incurred over the total number of weekdays stay
	 * @param numOfWeekends number of weekend days guest has reserved this room for
	 * this is required as it is used to calculate bills incurred over the total number of weekends stay
	 * @return total cost of reserving the room;
	 */
	public static double calculateRoomBill(Room room, long numOfWeekdays, long numOfWeekends) {
		double weekdayPrice = room.getRate().getWeekday() * numOfWeekdays;
		double weekendPrice = room.getRate().getWeekend() * numOfWeekends;
		return (weekdayPrice + weekendPrice);
	}
}
