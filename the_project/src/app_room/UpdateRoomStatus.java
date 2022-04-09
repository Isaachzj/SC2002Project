package app_room;

import enumeration.AvailStatus;
import room.Room;
import hotel.Hotel;
import java.util.Scanner;

public class UpdateRoomStatus {
	public static void updateRoomStatus(Hotel hotel) {
		Scanner sc = new Scanner(System.in);
		Room room1 = hotel.getRoom();
		System.out.println("Choose New Status (Select option):\n-Enter an alphabet to terminate-\n1. UNDER_MAINTENANCE\n2. VACANT");
		int statusChoice = sc.nextInt(); sc.nextLine();
		while(true) {
			if (statusChoice==1) {room1.setAvail(AvailStatus.UNDER_MAINTENANCE);break;}
			else if (statusChoice==2) {room1.setAvail(AvailStatus.VACANT);break;}
			else {System.out.println("Enter valid option!");}
		}	
	}
}
