package app_main;
import java.util.Scanner;

import app_guest.GuestRelated;
import app_hotel.StayRelated;
import app_room.RoomRelated;
import hotel.*;
import list_methods.*;
import serialize_deserialize.main_deserialize;

/**
 * This is a Boundary Class; as it is used as a user interface;
 * Allows the user to access all 
 */
public class HotelMainApp {
	
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		main_deserialize.deserialization(hotel);
		int choice = 0;
		
		do {
			System.out.println("\nWelcome to the Hotel App System!");
			System.out.println("(Enter an alphabet to terminate)");
			System.out.println("1: Stay Related Functions");
			System.out.println("2: Guest Related Functions");
			System.out.println("3: Room Related Functions");
			System.out.println("4. Terminate system");
			
			try {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter your choice:");
				choice = sc.nextInt(); sc.nextLine();
				switch (choice) {
					case 1: {
						StayRelated.stayRelated(hotel);
						break;
					}
					case 2: {
						GuestRelated.guestRelated(hotel);
						break;
					}
					case 3: {
						RoomRelated.roomRelated(hotel);
						break;
					}

					case 4: {
						System.out.println("Don't be late for work tomorrow!");
						break;
					}

					default:
						System.out.println("Enter a valid choice");
						break;
				}
			}
			catch (ArrayException e) {System.out.println(e.getMessage()); continue;}
			catch (Exception ee) {
				System.out.println("Process terminated\n"); 
				sc = new Scanner(System.in); // To clear multi line input in buffer
				continue;
				}
			
		} while (choice!=4);
	}//end method
}//end class

