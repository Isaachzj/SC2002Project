package app_room;

import enumeration.AvailStatus;
import room.Room;
import hotel.Hotel;
import java.util.Scanner;

/**
 * This is a Boundary Class; as it is used as a user interface;
 * 
 * Interface which allows the user to access functions related
 * to the availability status of a room. 
 * If the room does not exist, an error message is displayed;
 * user is allowed to update the room availability to either
 * UNDER_MAINTENANCE (option 1) or VACANT (option 2), 
 * depending on the current room availability status;
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class UpdateRoomStatus {
	/**
	 * Ths allows the update of room availability to either
	 * UNDER_MAINTENANCE (option 1) or VACANT (option 2)
	 * @param this is the Hotel object required for the update of the room availability
	 * the room availability can be updated to UNDER_MAINTENANCE or VACANT
	 */
	public static void updateRoomStatus(Hotel hotel) {
		Scanner sc = new Scanner(System.in);
		Room room1 = hotel.getRoom();
		if (room1==null) {System.out.println("No such room exists!!"); return;}
		
		System.out.println("Choose New Status (Select option):\n-Enter an alphabet to terminate-\n1. UNDER_MAINTENANCE\n2. VACANT");

		while(true) {
			int statusChoice = sc.nextInt(); sc.nextLine();			
			if (statusChoice==1) {
				if (room1.getAvail() == AvailStatus.VACANT) {room1.setAvail(AvailStatus.UNDER_MAINTENANCE); System.out.println("Status has been updated!"); break; }
				else if (room1.getAvail() == AvailStatus.UNDER_MAINTENANCE) {System.out.println("Room status already set to Under Maintenance!");break;}
				else {System.out.println("Cannot set as Room is being reserved/occupied!");break;}
				}
			
			else if (statusChoice==2) {
				if (room1.getAvail()!= AvailStatus.OCCUPIED && room1.getAvail()!=AvailStatus.RESERVED) {room1.setAvail(AvailStatus.VACANT);System.out.println("Status has been updated!");break;}
				else {System.out.println("You cannot set a room to vacant if it is occupied/reserved!"); break;}
			}
			
			else {System.out.println("Enter valid option!");}
		}	
	}
}
