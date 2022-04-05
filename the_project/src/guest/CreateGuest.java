package guest;

import reservation.*;
import enumeration.TypeOfGender;
import java.util.*;

public class CreateGuest {
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
