package guest;

import reservation.*;
import enumeration.TypeOfGender;
import java.util.*;

public class CreateGuest {
	/**
	 * instantiation of Guest Object for reservation; from the details of id, credit card information, contact details and gender
	 * @param reservationDetails this is the reservation details of the guest to be created
	 * @return this is the guest details instantiated
	 */
	public static Guest createReserver(Reservation reservationDetails) {
		Scanner sc = new Scanner(System.in);
		
		// Creating Identity Object
		Identity id = CreateIdentity.createIdentity();
		
		// Creating CreditCardInfo Object
		CreditCardInfo CCinfo = CreateCreditCardInfo.createCCI();
		
		//Creating ContactDetails Object
		ContactDetails CDetails = CreateContactDetails.createContactDetails();
		
		//Gender Type
		TypeOfGender gender = CreateGender.createGender();
				
		
		//Creating Guest Object
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
	 * instantiation of Guest Object for reservation; from the details of id, contact details and gender
	 * case where credit card details not available; i.e. null
	 * @param reservationDetails this is the reservation details of the guest to be created
	 * @return this is the guest details instantiated
	 */
	public static Guest createGuest(Reservation reservationDetails) {
		Scanner sc = new Scanner(System.in);
		// Creating Identity Object
		Identity id = CreateIdentity.createIdentity();
		
		//Creating ContactDetails Object
		ContactDetails CDetails = CreateContactDetails.createContactDetails();
		
		//Gender type
		TypeOfGender gender = CreateGender.createGender();
		
		//Creating Guest Object
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
