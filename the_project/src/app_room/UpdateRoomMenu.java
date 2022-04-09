package app_room;

import java.util.ArrayList;

import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
import hotel.Hotel;
import food_related.Menu;
import room.Room;
import java.util.*;

public class UpdateRoomMenu {
	public static void updateRoomMenu(Hotel hotel) {
		Scanner sc = new Scanner(System.in);
		//Ask for room type (Not hardcoded!)
		System.out.println("Choose Room Type (Select option):\n-Enter an alphabet to terminate-");
		for (int i=0; i<TypeOfRoom.values().length; i++) {
			System.out.printf("%d. %s\n", i+1, TypeOfRoom.values()[i]);
		}
		int typeChoice = sc.nextInt(); sc.nextLine();
		while (typeChoice<=0 || typeChoice>TypeOfRoom.values().length) {
			System.out.println("Enter a valid choice or i'll cut your pay!!");
			typeChoice = sc.nextInt(); sc.nextLine();
		}
		TypeOfRoom roomType = TypeOfRoom.values()[typeChoice-1];
		
		//Select what u wanna do with the menu
		System.out.println("Choose an option: \nEnter an alphabet to terminate-:");
		System.out.println("\n1. Add Food\n2. Remove Food\n3. Update Food");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0|| choice>=3) {
			System.out.println("Are you blind? Enter again lah!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		
		
		ArrayList<Room> rooms = hotel.getRooms(roomType);
		for (int i=0; i<rooms.size(); i++) {
			Menu menu = rooms.get(i).getMenuList();
			System.out.println("Choose a")
		}
	}
}
