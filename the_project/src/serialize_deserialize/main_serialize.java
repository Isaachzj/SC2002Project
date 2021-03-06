package serialize_deserialize;

import hotel.*;
import reservation.*;
import guest.*;
import list_methods.ArrayException;

import java.util.*;
import app_hotel.MakeReservation;

/**
 * Serialization is a mechanism of converting the state of an object into a byte stream.
 * In this case, we are using the serialization for the .txt file input into the byte stream, 
 * so that user input would not have to be keyed in multiple time upon the exploration of our
 * test cases.
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class main_serialize {
	
	/**
	 * PLEASE DO NOT RUN THIS! 
	 * This is main the method to serialise the relevant objects to the text files in serialize_deserialize package
	 * @param aArgs an array of command line arguments
	 */
	public static void main(String[] aArgs)  {

		try {
			/**
			 * Initializing the various arrays needed
			 */
			Hotel hotel = new Hotel();
			ArrayList<Reservation> rList = new ArrayList<Reservation>();
			ArrayList<Identity> idList = new ArrayList<Identity>();
			ArrayList<CreditCardInfo> cciList = new ArrayList<CreditCardInfo>();
			ArrayList<ContactDetails> cdList = new ArrayList<ContactDetails>();
			
			/**
			 * Instantiating each of the 8 reservation objects followed by
			 * serializing every Guest object(s) and Guest associated object(s) for each of the 8 reservations,
			 * one at a time
			 */
			Reservation single1 = MakeReservation.makeReservation(hotel, true); //same check-in time 
			ArrayList<Guest> singleList1 = single1.getGuestList();
			//singleList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", singleList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id1.txt", singleList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci1.txt", singleList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd1.txt", singleList1);
			

			Reservation single2 = MakeReservation.makeReservation(hotel, true);
			ArrayList<Guest> singleList2 = single2.getGuestList();			
			//singleList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests2.txt", singleList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id2.txt", singleList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci2.txt", singleList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd2.txt", singleList2);
			

			Reservation double1 = MakeReservation.makeReservation(hotel, true);
			ArrayList<Guest> doubleList1 = double1.getGuestList();
			//doubleList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests3.txt", doubleList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id3.txt", doubleList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci3.txt", doubleList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd3.txt", doubleList1);
			

			Reservation double2 =MakeReservation.makeReservation(hotel, true);
			ArrayList<Guest> doubleList2 = double2.getGuestList();
			//doubleList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests4.txt", doubleList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id4.txt", doubleList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci4.txt", doubleList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd4.txt", doubleList2);
			

			Reservation deluxe1 = MakeReservation.makeReservation(hotel, true);
			ArrayList<Guest> deluxeList1 = deluxe1.getGuestList();
			//deluxeList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests5.txt", deluxeList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id5.txt", deluxeList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci5.txt", deluxeList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd5.txt", deluxeList1);			
			

			Reservation deluxe2 = MakeReservation.makeReservation(hotel, true);
			ArrayList<Guest> deluxeList2 = deluxe2.getGuestList();
			//deluxeList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests6.txt", deluxeList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id6.txt", deluxeList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci6.txt", deluxeList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd6.txt", deluxeList2);
			
			
			Reservation vip1 = MakeReservation.makeReservation(hotel, true);
			ArrayList<Guest> vipList1 = vip1.getGuestList();			
			//vipList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests7.txt", vipList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id7.txt", vipList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci7.txt", vipList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd7.txt", vipList1);			
			

			Reservation vip2 = MakeReservation.makeReservation(hotel, true); 
			ArrayList<Guest> vipList2 = vip2.getGuestList();
			//vipList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests8.txt", vipList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\id8.txt", vipList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cci8.txt", vipList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\cd8.txt", vipList2);		
			
			
			/**
			 * Adding reservation objects to an array list
			 */
			rList.add(single1);
			rList.add(single2);
			rList.add(double1);
			rList.add(double2);
			rList.add(deluxe1);
			rList.add(deluxe2);
			rList.add(vip1);
			rList.add(vip2);
			
			/**
			 * Serializing the reservation objects
			 */
			TextReservation.saveReservations("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\reservations.txt", rList);
		}
		catch (ArrayException e) {System.out.println(e.getMessage());}
		catch (Exception ee) {
			ee.printStackTrace(); 
			}	
	}
}
