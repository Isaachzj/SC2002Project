package app_room;

import java.util.ArrayList;

import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
import hotel.Hotel;
import food_related.Menu;
import room.Room;
import list_methods.*;
import java.util.*;

public class UpdateRoomMenu {
	public static void updateRoomMenu(Hotel hotel) throws ArrayException {
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
		
		//Getting the menu
		Menu menu = hotel.getMenu(typeChoice);
		
		//Select what u wanna do with the menu
		System.out.println("Choose an option: \nEnter an alphabet to terminate-:");
		System.out.println("1. Add Food\n2. Remove Food\n3. Update Food");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0|| choice>=3) {
			System.out.println("Are you blind? Enter again lah!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		switch(choice) {
		case(1):
			menu.addFood();
			break;
		case(2):
			menu.removeFood();
			break;
		case(3):
			menu.updateFood();
			break;
		}//end switch
		
		System.out.println("Menu has been updated accordingly!\n");
		menu.info();	
		return;
	}
}
