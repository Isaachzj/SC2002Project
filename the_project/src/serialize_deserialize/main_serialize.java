package serialize_deserialize;

import hotel.*;
import reservation.*;
import guest.*;
import list_methods.ArrayException;

import java.util.*;
import app_hotel.MakeReservation;

public class main_serialize {
	public static void main(String[] aArgs)  {
		
		try {
			Hotel hotel = new Hotel();
			ArrayList<Reservation> rList = new ArrayList<Reservation>();
			ArrayList<Identity> idList = new ArrayList<Identity>();
			ArrayList<CreditCardInfo> cciList = new ArrayList<CreditCardInfo>();
			ArrayList<ContactDetails> cdList = new ArrayList<ContactDetails>();
			
			Reservation r1 = MakeReservation.makeReservation(hotel);
			//Reservation r2 = MakeReservation.makeReservation(hotel);
			
			rList.add(r1);
			//rList.add(r2);

			TextReservation.saveReservations("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\reservations.txt", rList);
			
			ArrayList<Guest> gList1 = r1.getGuestList();
			//ArrayList<Guest> gList2 = r2.getGuestList();
			
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", gList1);
			//TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1", gList2);
			
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", gList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", gList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", gList1);
		}
		catch (ArrayException e) {System.out.println(e.getMessage());}
		catch (Exception ee) {
			System.out.println("Process terminated\n"); 
			}	
	}
}
