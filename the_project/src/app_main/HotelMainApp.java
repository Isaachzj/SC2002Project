package app_main;
import java.util.Scanner;

import app_guest.GuestRelated;
import app_hotel.StayRelated;
import app_room.RoomRelated;
import hotel.*;
import list_methods.*;

public class HotelMainApp {
	
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		System.out.println("Welcome to the Hotel App System!");
		System.out.println("1: Stay Related Functions");
		System.out.println("2: Guest Related Functions");
		System.out.println("3: Room Related Functions");
		System.out.println("");
		int choice = 0;
		do {
			try {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
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

					default:
						System.out.println("Enter a valid choice");
						break;
				}
			}
			catch (ArrayException e) {continue;}
			catch (Exception e) {System.out.println("Process terminated"); continue;}
			
		} while (choice!=4);
	}//end method
}//end class

