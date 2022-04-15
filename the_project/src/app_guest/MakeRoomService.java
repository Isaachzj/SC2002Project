package app_guest;

import hotel.Hotel;
import guest.Guest;
import room.*;

import java.util.concurrent.TimeUnit;

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
		order.makeOrder(room);
		
		//Record history of order in Room Service object
		roomService.addOrder(order);
		
		//Print the order out
		System.out.println("Order Confirmed! \nHere are the details:");
		order.info();
		
		try {Thread.sleep(1500);}
		catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
		
		System.out.println("Order is being prepared!:");
		
		try {Thread.sleep(1500);}
		catch(InterruptedException e) {System.out.println(e.getLocalizedMessage());}
		
		System.out.println("Order has been completed and delivered to room successfully!");
		
	}
}
