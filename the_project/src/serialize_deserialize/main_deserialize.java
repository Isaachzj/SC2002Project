package serialize_deserialize;

import java.util.ArrayList;

import app_hotel.MakeReservation;
import enumeration.AvailStatus;
import guest.*;
import hotel.Hotel;
import room.*;
import list_methods.ArrayException;
import reservation.*;

/**
 * Deserialization is the reverse process of serialization, where it
 * reverse process where the byte stream is used to recreate the actual Java object in memory.
 * In this case, we are using the deserialization after serialization for the .txt file input 
 * into the byte stream, so that user input would not have to be keyed in multiple time upon 
 * the exploration of our test cases.
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public class main_deserialize {
	public static void deserialization(Hotel hotel, String path)  {
		
			try {
				/**
				 * Getting all room objects and adding them to an array
				 */
				Room s1 = hotel.getSpecificRoom("0201");
				Room s2 = hotel.getSpecificRoom("0202");
				Room s3 = hotel.getSpecificRoom("0203");
				
				Room d1 = hotel.getSpecificRoom("0206");
				Room d2 = hotel.getSpecificRoom("0207");
				
				Room de1 = hotel.getSpecificRoom("0601");
				Room de2 = hotel.getSpecificRoom("0602");
				
				Room v1 = hotel.getSpecificRoom("0701");
				
				/**
				 * Adding the rooms to this array in sequential order of reserving them (index should match their reservation index)
				 */
				ArrayList<Room> roomListy = new ArrayList<Room>();
				roomListy.add(v1);
				roomListy.add(s1);
				roomListy.add(s2);
				roomListy.add(d1);
				roomListy.add(de1);
				roomListy.add(s3);
				roomListy.add(d2);
				roomListy.add(de2);				
				
				
				/**
				 * Getting all rooms to be set to UNDER_MAINTENANCE 
				 */
				Room s4 = hotel.getSpecificRoom("0501");
				Room s5 = hotel.getSpecificRoom("0502");
				
				Room d3 = hotel.getSpecificRoom("0506");
				Room d4 = hotel.getSpecificRoom("0507");
				
				Room de3 = hotel.getSpecificRoom("0604");
				Room de4 = hotel.getSpecificRoom("0605");
				
				Room v2 = hotel.getSpecificRoom("0702");
				Room v3 = hotel.getSpecificRoom("0703");
				
				//Setting the above room to under_maintenance
				s4.setAvail(AvailStatus.UNDER_MAINTENANCE);
				s5.setAvail(AvailStatus.UNDER_MAINTENANCE);
				
				d3.setAvail(AvailStatus.UNDER_MAINTENANCE);
				d4.setAvail(AvailStatus.UNDER_MAINTENANCE);
				
				de3.setAvail(AvailStatus.UNDER_MAINTENANCE);
				de4.setAvail(AvailStatus.UNDER_MAINTENANCE);
				
				v2.setAvail(AvailStatus.UNDER_MAINTENANCE);
				v3.setAvail(AvailStatus.UNDER_MAINTENANCE);
				
				

				/**
				 * Creating a list of guests for each of the reservations
				 */
				ArrayList<Identity> idList1 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id1.txt");
				ArrayList<CreditCardInfo> cciList1 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci1.txt");
				ArrayList<ContactDetails> cdList1 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd1.txt");
				ArrayList<Guest> gList1 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests1.txt", idList1, cciList1, cdList1);
				
				ArrayList<Identity> idList2 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id2.txt");
				ArrayList<CreditCardInfo> cciList2 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci2.txt");
				ArrayList<ContactDetails> cdList2 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd2.txt");
				ArrayList<Guest> gList2 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests2.txt", idList2, cciList2, cdList2);
				
				ArrayList<Identity> idList3 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id3.txt");
				ArrayList<CreditCardInfo> cciList3 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci3.txt");
				ArrayList<ContactDetails> cdList3 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd3.txt");
				ArrayList<Guest> gList3 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests3.txt", idList3, cciList3, cdList3);
				
				ArrayList<Identity> idList4 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id4.txt");
				ArrayList<CreditCardInfo> cciList4 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci4.txt");
				ArrayList<ContactDetails> cdList4 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd4.txt");
				ArrayList<Guest> gList4 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests4.txt", idList4, cciList4, cdList4);
				
				ArrayList<Identity> idList5 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id5.txt");
				ArrayList<CreditCardInfo> cciList5 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci5.txt");
				ArrayList<ContactDetails> cdList5 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd5.txt");
				ArrayList<Guest> gList5 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests5.txt", idList5, cciList5, cdList5);
				
				ArrayList<Identity> idList6 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id6.txt");
				ArrayList<CreditCardInfo> cciList6 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci6.txt");
				ArrayList<ContactDetails> cdList6 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd6.txt");
				ArrayList<Guest> gList6 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests6.txt", idList6, cciList6, cdList6);
				
				ArrayList<Identity> idList7 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id7.txt");
				ArrayList<CreditCardInfo> cciList7 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci7.txt");
				ArrayList<ContactDetails> cdList7 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd7.txt");
				ArrayList<Guest> gList7 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests7.txt", idList7, cciList7, cdList7);
				
				ArrayList<Identity> idList8 = (ArrayList<Identity>)TextIdentity.readIDs(path+"id8.txt");
				ArrayList<CreditCardInfo> cciList8 = (ArrayList<CreditCardInfo>)TextCreditCardInfo.readCCIs(path+"cci8.txt");
				ArrayList<ContactDetails> cdList8 = (ArrayList<ContactDetails>)TextContactDetails.readCDs(path+"cd8.txt");
				ArrayList<Guest> gList8 = (ArrayList<Guest>)TextGuest.readGuests(path+"guests8.txt", idList8, cciList8, cdList8);
				
				
				
				/**
				 * Creating an array of guest lists
				 */
				ArrayList<ArrayList<Guest>> guestListy = new ArrayList<ArrayList<Guest>>();
				guestListy.add(gList1);
				guestListy.add(gList2);
				guestListy.add(gList3);
				guestListy.add(gList4);
				guestListy.add(gList5);
				guestListy.add(gList6);
				guestListy.add(gList7);
				guestListy.add(gList8);
				
				/**
				 * Creating an array of reservations
				 */
				ArrayList<Reservation> reservationList = TextReservation.readReservations(path+"reservations.txt", roomListy, guestListy);
				
				System.out.println("==================================================DESERIALIZATION==================================================");

				/**
				 * Assigning reservation and guest List to the hotel (Completing check in process)
				 */
				for (int i=0; i<reservationList.size(); i++) {
					hotel.addReservation(reservationList.get(i)); //add reservation
					System.out.println("Initializing " + reservationList.get(i).getGuest().getName() + " details");
				
					/**
					 * Adding the guest of the first 5 reservations as they are the ones who have already checked in
					 */
					if (i<5) { //only first 5 reservations have checked in
						hotel.addGuests(reservationList.get(i)); //add guests in each reservation
					}
				}
				System.out.println("===================================================================================================================");
	
			}
			catch (ArrayException e) {System.out.println(e.getMessage());}
			catch (Exception ee) {
				ee.printStackTrace(); 
				}	
	}
}
