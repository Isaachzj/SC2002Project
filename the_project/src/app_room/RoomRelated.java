package app_room;

import hotel.*;
import room.*;
import list_methods.*;
import java.util.*;

public class RoomRelated {
	public static void roomRelated(Hotel hotel) throws ArrayException {
		/*Contains switch statement that:
			1. Updates room status
			2. Updates menu
			3. Updates room features
			4. Check room status (availability)
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("========== ROOM RELATED ==========");
		System.out.println("Choose an option (Select option)\n-Enter an alphabet to terminate-:"
				+ "\n1. Update Room Status\n2. Update Menu\n3.Update Room Features\n4. Check Room Availability");
		int choice = sc.nextInt(); sc.nextLine();	
		while (choice<=0 || choice>3) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		do {
			switch(choice) {
			case(1):
				UpdateRoomStatus.updateRoomStatus(hotel);
				break;

			case(2):
				UpdateRoomMenu.updateRoomMenu(hotel);
				break;
				
			case(3):
				UpdateRoomFeatures.updateRoomFeatures(hotel);
				break;
				
			case(4):
				System.out.printf("Room is %s", hotel.getRoom().getAvail());
				break;
				
			default:
				System.out.println("Enter a valid option!");
			}
		} while (choice<=0||choice>3);
	}//end method
}
