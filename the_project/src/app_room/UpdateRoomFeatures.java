package app_room;
/**
 * This is a Boundary Class; as it is used as a user interface;
 * 
 * Interface which allows the user to access functions related to room's additional features;
 * user is able to add a new additional feature of a room (option 1;
 * this gives user the access to add a non-existing additional feature into a room. 
 * This function creates a new feature manipulator object and uses it to add 
 * an additional feature into a room),
 * 
 * remove an existing feature of a room (option 2;
 * this gives user the access to remove an existing additional feature into a room.),
 * 
 * and, update the status/quantity of a room (option 3;
 * this gives user the access to edit an existing additional feature into a room. 
 * This function uses it to add an additional feature into a room)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
import hotel.Hotel;
import room.Room;
import list_methods.*;
import java.util.Scanner;
/**
 * Gives user 2 options for functions to access. 
 * the functions include add feature (choice 1),
 * remove feature (choice 2) and update feature (choice 3), or
 * terminate this process (choice 4)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class UpdateRoomFeatures  {
	public static void updateRoomFeatures(Hotel hotel) throws ArrayException {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * # get the room
		 * If room does not exist, error message displayed
		 */
		Room room = hotel.getRoom();
		if (room==null) {
			System.out.println("No such room exists lah bodoh!");
			return;
		}
		
		/**
		 * # Select what u wanna do with the room
		 */
		/**
		 * # menu displayed
		 * Gives user 2 options for functions to access. 
		 * the functions include add feature (choice 1),
		 * remove feature (choice 2) and update feature (choice 3), or
		 * terminate this process (choice 4)
		 */
		System.out.println("Choose an option: \nEnter an alphabet to terminate-:");
		System.out.println("1. Add Feature\n2. Remove Feature\n3. Update Feature");
		int choice = sc.nextInt(); sc.nextLine();
		/**
		 * # When user enters an invalid integer, error message is displayed;
		 */
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
		/**
		 * # Displays the room information
		 */
		room.getRoomFeatures().info();		
		System.out.println();
		return;
	}
}