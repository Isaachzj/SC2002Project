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
				//Getting all room objects and adding them to arraylist
				Room s1 = hotel.getSpecificRoom("0201");
				Room s2 = hotel.getSpecificRoom("0202");
				
				Room d1 = hotel.getSpecificRoom("0206");
				Room d2 = hotel.getSpecificRoom("0207");
				
				Room de1 = hotel.getSpecificRoom("0601");
				Room de2 = hotel.getSpecificRoom("0602");
				
				Room v1 = hotel.getSpecificRoom("0701");
				Room v2 = hotel.getSpecificRoom("0702");

				
				//You add the rooms to this array in sequential order of reserving them (index should match their reservation index
				ArrayList<Room> roomListy = new ArrayList<Room>();
				roomListy.add(s1);
				roomListy.add(s2);
				roomListy.add(d1);
				roomListy.add(d2);
				roomListy.add(de1);
				roomListy.add(de2);
				roomListy.add(v1);
				roomListy.add(v2);
				
				

				//the number at the back corresponds to the reservation number
				ArrayList<Identity> idList1 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id1.txt");
				ArrayList<CreditCardInfo> cciList1 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci1.txt");
				ArrayList<ContactDetails> cdList1 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd1.txt");
				ArrayList<Guest> gList1 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", idList1, cciList1, cdList1);
				
				ArrayList<Identity> idList2 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id2.txt");
				ArrayList<CreditCardInfo> cciList2 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci2.txt");
				ArrayList<ContactDetails> cdList2 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd2.txt");
				ArrayList<Guest> gList2 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests2.txt", idList2, cciList2, cdList2);
				
				ArrayList<Identity> idList3 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id3.txt");
				ArrayList<CreditCardInfo> cciList3 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci3.txt");
				ArrayList<ContactDetails> cdList3 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd3.txt");
				ArrayList<Guest> gList3 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests3.txt", idList3, cciList3, cdList3);
				
				ArrayList<Identity> idList4 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id4.txt");
				ArrayList<CreditCardInfo> cciList4 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci4.txt");
				ArrayList<ContactDetails> cdList4 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd4.txt");
				ArrayList<Guest> gList4 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests4.txt", idList4, cciList4, cdList4);
				
				ArrayList<Identity> idList5 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id5.txt");
				ArrayList<CreditCardInfo> cciList5 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci5.txt");
				ArrayList<ContactDetails> cdList5 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd5.txt");
				ArrayList<Guest> gList5 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests5.txt", idList5, cciList5, cdList5);
				
				ArrayList<Identity> idList6 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id6.txt");
				ArrayList<CreditCardInfo> cciList6 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci6.txt");
				ArrayList<ContactDetails> cdList6 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd6.txt");
				ArrayList<Guest> gList6 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests6.txt", idList6, cciList6, cdList6);
				
				ArrayList<Identity> idList7 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id7.txt");
				ArrayList<CreditCardInfo> cciList7 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci7.txt");
				ArrayList<ContactDetails> cdList7 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd7.txt");
				ArrayList<Guest> gList7 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests7.txt", idList7, cciList7, cdList7);
				
				ArrayList<Identity> idList8 = (ArrayList<Identity>)TextIdentity.readIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id8.txt");
				ArrayList<CreditCardInfo> cciList8 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci8.txt");
				ArrayList<ContactDetails> cdList8 = (ArrayList<ContactDetails>)TextContactDetails.readCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd8.txt");
				ArrayList<Guest> gList8 = (ArrayList<Guest>)TextGuest.readGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests8.txt", idList8, cciList8, cdList8);
				
				
				
				//As you create more guest arrays corresponding to the reservation, you add on to this array.
				ArrayList<ArrayList<Guest>> guestListy = new ArrayList<ArrayList<Guest>>();
				guestListy.add(gList1);
				guestListy.add(gList2);
				guestListy.add(gList3);
				guestListy.add(gList4);
				guestListy.add(gList5);
				guestListy.add(gList6);
				guestListy.add(gList7);
				guestListy.add(gList8);
				
				ArrayList<Reservation> reservationList = TextReservation.readReservations("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\reservations.txt", roomListy, guestListy);
				
				
				//Assigning reservation and guest List to the hotel (Completing check in process)
				for (int i=0; i<reservationList.size(); i++) {
					hotel.addReservation(reservationList.get(i)); //add reservation
					
					if (i<5) { //only first 5 reservations have checked in
						hotel.addGuests(reservationList.get(i)); //add guests in each reservation
					}
				}
				
	
			}
			catch (ArrayException e) {System.out.println(e.getMessage());}
			catch (Exception ee) {
				ee.printStackTrace(); 
				}	
	}
}
