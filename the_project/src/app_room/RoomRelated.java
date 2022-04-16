package app_room;

import hotel.*;
import room.*;
import list_methods.*;
import java.util.*;

/**
 * This is a Boundary Class; as it is used as a user interface;
 * 
 * Allows the update of room status (choice 1;
 * status can be VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE;
 * however, the room availability status mainly updates using UpdateRoomStatus to
 * UNDER_MAINTENANCE or VACANT),
 * Update room menu (choice 2; id est adding, removing or updating the food object in the menu),
 * update room features (choice 3; calls the FeatureManipulator object),
 * Check room availability (choice 4; will indicate if room does not exists, else gets the room details),
 * or write and submit report (choice 5; report consist of either a Occupancy or Status report);
 * do-while loop is used to ensure that the guest enters a valid choice (1 - 5)
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 */

public class RoomRelated {
	public static void roomRelated(Hotel hotel) throws ArrayException {
		/**
		 * # Contains switch statement that:
			1. Updates room status
			2. Updates menu
			3. Updates room features
			4. Check room status (availability)
			5. Room reports
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("\n========== ROOM RELATED ==========");
		System.out.println("Choose an option (Select option)\n- Enter an alphabet to terminate -:"
				+ "\n1. Update Room Status\n2. Update Menu\n3. Update Room Features\n4. Check Room Availability\n5. Room reports");
		int choice = sc.nextInt(); sc.nextLine();	
		while (choice<=0 || choice>5) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		do {
			switch(choice) {
			case(1):
				/**
				 * # Updates room availability status using a UpdateRoomStatus object to UNDER_MAINTENANCE or VACANT;
				 */
				UpdateRoomStatus.updateRoomStatus(hotel);
				break;

			case(2):
				/**
				 * # Updates room menu by adding, removing or updating food items on it;
				 */
				UpdateRoomMenu.updateRoomMenu(hotel);
				break;
				
			case(3):
				/**
				 * # Updates room features using a FeatureManipulator object;
				 */
				UpdateRoomFeatures.updateRoomFeatures(hotel);
				break;
				
			case(4):
				/**
				 * # If room exists, gets and prints room availability;
				 */
				Room room = hotel.getRoom();
				if (room==null) {System.out.println("No such room exists!!"); break;}
				System.out.printf("Room is %s\n", room.getAvail());
				break;
				
			case(5):
				/**
				 * # Allows user to write and submit either a Occupancy or Status report of a room;
				 */
				Report.info(hotel);
				break;
				
			default:
				System.out.println("Enter a valid option!");
			}
		} while (choice<=0||choice>5);
	}//end method
}
