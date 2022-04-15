package app_main;
import java.util.Scanner;

import app_guest.GuestRelated;
import app_hotel.StayRelated;
import app_room.RoomRelated;
import hotel.*;
import list_methods.*;

/**
 * displays menu options that contains sets of functions that each serve a single responsibility;
 * user is able to access guest stay-related, guest related and room-related functions;
 */

public class HotelMainApp {
	
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		int choice = 0;
		
		/**
		 * menu options displayed to allow for user to choose what set of functions to access;
		 */
		
		do {
			System.out.println("\nWelcome to the Hotel App System!");
			System.out.println("(Enter an alphabet to terminate)");
			System.out.println("1: Stay Related Functions");
			System.out.println("2: Guest Related Functions");
			System.out.println("3: Room Related Functions");
			System.out.println("4. Change System DateTime");
			System.out.println("5. Terminate system");
			
			try {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter your choice:");
				choice = sc.nextInt(); sc.nextLine();
				switch (choice) {
					case 1: {
						/**
						 * functions within the StayRelated class allow for reservation of a room, 
						 * checking in and checking out a guest;
						 */
						StayRelated.stayRelated(hotel);
						break;
					}
					case 2: {
						/**
						 * functions within the GuestRelated class allow for manipulating guest personal and room information 
						 * and retrieving guest information;
						 * the functions include updating guest credit card information,
						 * retrieve guest information and access room service;
						 */
						GuestRelated.guestRelated(hotel);
						break;
					}
					case 3: {
						/**
						 * functions within the RoomRelated class allow for manipulating room availability, 
						 * menu and submitting room reports;
						 * the functions include allowing for updating room status,
						 * update room menu, update room features, check room availability, 
						 * write and submit a room report;
						 */
						RoomRelated.roomRelated(hotel);
						break;
					}
					
					case 4: {
						
						break;
					}

					case 5: {
						System.out.println("Don't be late for work tomorrow!");
						break;
					}

					default:
						/**
						 * error message for when user enters input other than int 1 to 5;
						 */
						System.out.println("Enter a valid choice");
						break;
				}
			}
			catch (ArrayException e) {System.out.println(e.getMessage()); continue;}
			/**
			 * Exception ee other than ArrayException occurs when user inputs an alphabet to terminate;
			 */
			catch (Exception ee) {
				System.out.println("Process terminated\n"); 
				/**
				 * # To clear multi line input in buffer
				 */
				sc = new Scanner(System.in); 
				continue;
				}
			
		} while (choice!=4);
	}//end method
}//end class

