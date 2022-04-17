package app_guest;

import hotel.Hotel;
import guest.Guest;
import room.*;

import java.util.concurrent.TimeUnit;

import food_related.*;
import list_methods.*;

/**
 * This is a Boundary Class; as it is used as a user interface;
 * Allows the user to request for room service
 * (which would be redirected to from GuestRelated boundary class
 * upon the selection of choice '3')
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 */
public class MakeRoomService {
	/**
	 * orders room service for a guest
	 * @param guest to know which guest is ordering room service so that the order can be added to the correct reservation
	 * @throws ArrayException a custom Exception
	 */
	public static void makeRoomService(Guest guest) throws ArrayException {
		
		if (guest==null) {
			System.out.println("Guest does not exist! (GHOSTTTTT)");
			return;
		}
		
		/**
		 * # Getting the room service object of the guest's room
		 */
		Room room = guest.getReservation().getRoom();
		RoomService roomService = room.getRoomService();
		
		/**
		 * # Creating and making the order
		 */
		Order order = new Order();
		order.makeOrder(room);
		
		/**
		 * # Record history of order in Room Service object
		 */
		roomService.addOrder(order);
		
		/**
		 * # Print the order out
		 */
		System.out.println("Order Confirmed! \nHere are the details:");
		order.info();
	
	}
}
