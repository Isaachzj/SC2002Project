package app_room;

import hotel.Hotel;
import room.Room;
import list_methods.*;
import java.util.Scanner;

public class UpdateRoomFeatures  {
	public static void updateRoomFeatures(Hotel hotel) throws ArrayException {
		Scanner sc = new Scanner(System.in);
		
		//get the room
		Room room = hotel.getRoom();
		if (room==null) {
			System.out.println("No such room exists lah bodoh!");
			return;
		}
		
		//Select what u wanna do with the room
		System.out.println("Choose an option: \nEnter an alphabet to terminate-:");
		System.out.println("1. Add Feature\n2. Remove Feature\n3. Update Feature");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0|| choice>=3) {
			System.out.println("Are you blind? Enter again lah!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		switch(choice) {
		case(1):
			room.getRoomFeatures().addFeatures();
			break;
		case(2):
			room.getRoomFeatures().removeFeatures();
			break;
		case(3):
			room.getRoomFeatures().updateFeatures();
			break;
		}//end switch
		
		System.out.println("Successful!");
		//Displays the room information
		room.getRoomFeatures().info();
		return;
	}
}