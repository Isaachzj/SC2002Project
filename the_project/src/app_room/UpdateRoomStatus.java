package app_room;

import enumeration.AvailStatus;
import room.Room;
import hotel.Hotel;
import java.util.Scanner;

public class UpdateRoomStatus {
	public static void updateRoomStatus(Hotel hotel) {
		Scanner sc = new Scanner(System.in);
		Room room1 = hotel.getRoom();
		if (room1==null) {System.out.println("No such room exists!!"); return;}
		
		System.out.println("Choose New Status (Select option):\n-Enter an alphabet to terminate-\n1. UNDER_MAINTENANCE\n2. VACANT");

		while(true) {
			int statusChoice = sc.nextInt(); sc.nextLine();			
			if (statusChoice==1) {
				if (room1.getAvail() == AvailStatus.VACANT) {room1.setAvail(AvailStatus.UNDER_MAINTENANCE);break;}
				else if (room1.getAvail() == AvailStatus.UNDER_MAINTENANCE) {System.out.println("Room status already set to Under Maintenance!");break;}
				else {System.out.println("Cannot set as Room is being reserved/occupied!");break;}
				}
			
			else if (statusChoice==2) {
				if (room1.getAvail()!= AvailStatus.OCCUPIED || room1.getAvail()!=AvailStatus.RESERVED) {room1.setAvail(AvailStatus.VACANT);break;}
				else {System.out.println("You cannot set a room to vacant if it is occupied/reserved!"); break;}
			}
			
			else {System.out.println("Enter valid option!");}
		}	
		System.out.println("Status has been updated!");
	}
}
