package app_room;

import java.util.ArrayList;

import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
import hotel.Hotel;
import food_related.Menu;
import room.Room;
import list_methods.*;
import java.util.*;

/**
 * This is a Boundary Class; as it is used as a user interface;
 * 
 * Interface which displays a menu that allows the user to access functions
 * related to menus rooms can access;
 * user is able to add a new food item (option 1;
 * addFood() method is called to add a new Food object into the menu),
 * remove a food item (option 2;
 * removeFood() method is called to remove an existing Food object from the menu), 
 * and, update the quantity of a food item(option 3;
 * updateFood() method is called to make changed to an existing Food object
 * from the menu. Notably, this allows the user to make changes to either the name
 * of the food, its prices or both).
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class UpdateRoomMenu {
	/**
	 * Method allows users to be able to user is able to add a new food item (option 1),
	 * remove a food item (option 2), 
	 * and, update the quantity of a food item(option 3)
	 * Notably, this allows the user to make changes to either the name
	 * of the food, its prices or both)
	 * @param this is the Hotel object required for the update of its menu
	 * @throws An exception would be thrown with its message upon any error encountered
	 */
	public static void updateRoomMenu(Hotel hotel) throws ArrayException {
		Scanner sc = new Scanner(System.in);
		/**
		 * # Ask for room type (Not hardcoded!)
		 */
		System.out.println("Choose Room Type (Select option):\n-Enter an alphabet to terminate-");
		for (int i=0; i<TypeOfRoom.values().length; i++) {
			System.out.printf("%d. %s\n", i+1, TypeOfRoom.values()[i]);
		}
		int typeChoice = sc.nextInt(); sc.nextLine();
		while (typeChoice<=0 || typeChoice>TypeOfRoom.values().length) {
			System.out.println("Enter a valid choice or i'll cut your pay!!");
			typeChoice = sc.nextInt(); sc.nextLine();
		}
		
		/**
		 * # Getting the menu
		 */
		Menu menu = hotel.getMenu(typeChoice);
		
		/**
		 * # Select what u wanna do with the menu
		 */
		System.out.println("Choose an option: \nEnter an alphabet to terminate-:");
		System.out.println("1. Add Food\n2. Remove Food\n3. Update Food Price and/or Description");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0|| choice>3) {
			System.out.println("Are you blind? Enter again lah!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		switch(choice) {
		case(1):
			menu.info();
			menu.addFood();
			break;
		case(2):
			menu.info();
			menu.removeFood();
			break;
		case(3):
			menu.info();
			menu.updateFood();
			break;
		}//end switch
		
		System.out.println("Menu has been updated accordingly!\n");
		menu.info();	
		return;
	}
}
