package serialize_deserialize;

import java.util.ArrayList;

import app_hotel.MakeReservation;
import guest.*;
import hotel.Hotel;
import room.*;
import list_methods.ArrayException;
import reservation.*;


public class main_deserialize {
	public static void deserialization(Hotel hotel)  {
			
			try {
				Room s1 = hotel.getSpecificRoom("0201");

				
				//You add the rooms to this array in sequential order of reserving them (index should match their reservation index
				ArrayList<Room> roomListy = new ArrayList<Room>();
				roomListy.add(s1);

				
				//the number at the back corresponds to the reservation number
				ArrayList<Identity> idList1 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt");
				ArrayList<CreditCardInfo> cciList1 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt");
				ArrayList<ContactDetails> cdList1 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt");
				ArrayList<Guest> gList1 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", idList1, cciList1, cdList1);
				
				//As you create more guest arrays corresponding to the reservation, you add on to this array.
				ArrayList<ArrayList<Guest>> guestListy = new ArrayList<ArrayList<Guest>>();
				guestListy.add(gList1);
				
				ArrayList<Reservation> reservationList = TextReservation.readReservations("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\reservations.txt", roomListy, guestListy);
				
				//Assigning reservation and guest List to the hotel
				for (int i=0; i<reservationList.size(); i++) {
					hotel.addReservation(reservationList.get(i)); //add reservation
					hotel.addGuests(reservationList.get(i)); //add guests in each reservation
				}
				
	
			}
			catch (ArrayException e) {System.out.println(e.getMessage());}
			catch (Exception ee) {
				ee.printStackTrace(); 
				}	
	}
}
