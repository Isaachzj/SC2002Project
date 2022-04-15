package app_hotel;

import java.util.Scanner;

import app_room.UpdateRoomFeatures;
import app_room.UpdateRoomMenu;
import app_room.UpdateRoomStatus;
import hotel.Hotel;
import list_methods.ArrayException;

/**
 * This class allows the user to make access functions which are related to guests staying in a hotel room 
 * through a switch statement and input choice;
 * A do-while loop is used to ensure that the guest enters a valid choice (1 - 3)
 * Functions include making a reservation (option 1), checking in a guest (option 2) and checking out a guest (option 3);
 */
public class StayRelated { 
	
	/**
	 * Allows user to access functions which are related to guests staying in a hotel room;
	 * @param hotel Hotel object containing all room, guests, room service orders and reservations details;
	 * @throws ArrayException
	 */
	public static void stayRelated(Hotel hotel) throws ArrayException {
		/**
		 * # Contains switch statement that:
			1. Make a Reservation
			2. Check-In a guest
			3. Check-Out a guest
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("\n========== STAY RELATED ==========");
		System.out.println("Choose an option (Select option)\n-Enter an alphabet to terminate-:"
				+ "\n1. Make a Reservation\n2. Check-In\n3. Check-Out\n4. View all reservations");
		int choice = sc.nextInt(); sc.nextLine();	
		while (choice<=0 || choice>5) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		do {
			switch(choice) {
			case(1):
				MakeReservation.makeReservation(hotel);
				break;

			case(2):
				CheckIn.checkIn(hotel);
				break;
				
			case(3):
				CheckOut.checkOut(hotel);
				break;
				
			case(4):
				hotel.reservationInfo();
				break;
				
			default:
				System.out.println("Enter a valid option!");
			}
		} while (choice<=0||choice>4);
	}//end method
}
