package app_guest;

import hotel.Hotel;
import list_methods.*;
import java.util.Scanner;

import guest.CreditCardInfoManipulator;
import guest.DisplayGuestInfo;

public class GuestRelated {
		/* Contains switch statement that
		 	1. Updates credit card info of guest
		 	2. Retrieve (print) specified guest info
		 	3. Room service on behalf of guest 
		 */
	public static void guestRelated(Hotel hotel) throws ArrayException {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		System.out.println("========== GUEST RELATED ==========");
		System.out.println("Choose an option (Select option)\n-Enter an alphabet to terminate-:"
				+ "\n1. Update Credit Card Information\n2. Retrieve Guest Information\n3.Room Service");
		
		try{choice = sc.nextInt(); sc.nextLine();}
		catch(Exception e) {System.out.println("Process Terminated"); sc.nextLine(); return;}
		
		while (choice<=0 || choice>3) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
		
		do {
			switch(choice) {
			case(1):
				CreditCardInfoManipulator.updateCreditCardInfo(hotel.getGuest());
				break;
	
			case(2):
				DisplayGuestInfo.printInfo(hotel.getGuest());
				break;
				
			case(3):
				MakeRoomService.makeRoomService(hotel.getGuest());
				break;
								
			default:
				System.out.println("Enter a valid option!");
			}
		} while (choice<=0||choice>3);
	}//end method
}
