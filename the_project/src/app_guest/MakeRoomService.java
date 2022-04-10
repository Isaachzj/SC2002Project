package app_guest;

import hotel.Hotel;
import guest.Guest;
import room.*;
import food_related.*;
import list_methods.*;

public class MakeRoomService {
	public static void makeRoomService(Guest guest) throws ArrayException {
		
		if (guest==null) {
			System.out.println("Guest does not exist! (GHOSTTTTT)");
			return;
		}
		
		//Getting the room service object of the guest's room
		Room room = guest.getReservation().getRoom();
		RoomService roomService = room.getRoomService();
		
		//Creating and making the order
		Order order = new Order();
		order.makeOrder(room.getMenu());
		
		//Record history of order in Room Service object
		roomService.addOrder(order);
		
		//Print the order out
		System.out.println("Order Successfully Created! \nHere are the details:");
		order.info();
	}
}
