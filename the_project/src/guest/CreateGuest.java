package guest;

import reservation.*;
import enumeration.TypeOfGender;
import java.util.*;
/**
 * Instantiation of the reserver (Guest object who made reservation).
 * Includes all details required for the reservation.
 * Additionally, use of method to instantiate Guest object who 
 * did not make the reservation but is staying in the room
 * Similarly, this instantiates a regular occupant
 * (Guest object who did not make the reservation but is staying in the room)
 * Unlike before, this guest object does not have any credit card details
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class CreateGuest {
	/**
	 * instantiation of the reserver (Guest object who made reservation)
	 * @param reservationDetails holds the reserver's essential information
	 * (esential information includes: id, credit card information, contact details, gender); 
	 * needed for the instantiation
	 * @return this is the guest details instantiated
	 */
	public static Guest createReserver(Reservation reservationDetails) {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * # Creating Identity Object
		 */
		Identity id = CreateIdentity.createIdentity();
		
		/**
		 * # Creating CreditCardInfo Object
		 */
		CreditCardInfo CCinfo = CreateCreditCardInfo.createCCI();
		
		/**
		 * # Creating ContactDetails Object
		 */
		ContactDetails CDetails = CreateContactDetails.createContactDetails();
		
		/**
		 * # Gender Type
		 */
		TypeOfGender gender = CreateGender.createGender();
				
		
		/**
		 * # Creating Guest Object
		 */
		System.out.println("--------- Enter Name and Nationality --------");
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Nationality: ");
		String nationality = sc.nextLine();
		
		Guest guest = new Guest(name, nationality, gender, id, CCinfo, CDetails, reservationDetails);
		System.out.println();
		return guest;
		//PrintGuestInfo PGI = new PrintGuestInfo();
		//PGI.printInfo(guest);
		//CreditCardInfoUpdater UCI = new CreditCardInfoUpdater();
		//UCI.updateinfo(guest);
		//PGI.printInfo(guest);
		
		// return guest;
	}
	
	/**
	 * Similarly, this instantiates a regular occupant (Guest object who did not make the reservation but is staying in the room)
	 * Unlike before, this guest object does not have any credit card details
	 * @param reservationDetails this is the reservation details of the guest to be created
	 * @return this is the guest details instantiated
	 */
	public static Guest createGuest(Reservation reservationDetails) {
		Scanner sc = new Scanner(System.in);
		
		/**
		 * # Creating Identity Object
		 */
		Identity id = CreateIdentity.createIdentity();
		
		/**
		 * # Creating ContactDetails Object
		 */
		ContactDetails CDetails = CreateContactDetails.createContactDetails();
		
		/**
		 * # Gender type
		 */
		TypeOfGender gender = CreateGender.createGender();
		
		/**
		 * # Creating Guest Object
		 */
		System.out.println("--------- Enter Name and Nationality --------");
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Nationality: ");
		String nationality = sc.nextLine();		
		
		Guest guest = new Guest(name, nationality, gender, id, null, CDetails, reservationDetails);
		System.out.println();
		return guest;
		
	}
}
