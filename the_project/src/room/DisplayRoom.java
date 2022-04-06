package room;
import list_methods.*;

public class DisplayRoom {

	public static void info(Room room) {
		System.out.printf("===========================%s Room===========================\n", room.getRoomType());
		if (room.getRoomNum()<10) {
			System.out.printf("Room Number: 0%d0%d\n", room.getRoomFloor(), room.getRoomNum());
		}
		else {System.out.printf("Room Number: 0%d%d\n", room.getRoomFloor(), room.getRoomNum());}
		
		System.out.printf("Availability Status: %s\n", room.availability);
		//Room rate
		room.getRate().info();
		//Display features
		room.getRoomFeatures().info(); 
		//Display menu
		System.out.println("Room Menu: ");	
		room.getMenuList().info(); //handle exception outside
		//Prints RoomService orders
		room.getRoomService().info();	
	}
}
