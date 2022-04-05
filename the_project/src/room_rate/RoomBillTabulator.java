package room_rate;

import Room.*;

public class RoomBillTabulator {
	public static double calculateRoomBill(Room room, long numOfWeekdays, long numOfWeekends) {
		double weekdayPrice = room.getRate().getWeekday() * numOfWeekdays;
		double weekendPrice = room.getRate().getWeekend() * numOfWeekends;
		return (weekdayPrice + weekendPrice) * (100 - room.getRate().getDiscount())/100;
	}
}
