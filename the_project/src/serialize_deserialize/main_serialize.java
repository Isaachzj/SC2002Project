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
			
			
			
			//Creating 2 of every reservation objects
			Reservation single1 = MakeReservation.makeReservation(hotel, true); //same check-in time 
			Reservation single2 = MakeReservation.makeReservation(hotel, true);
			
			Reservation double1 = MakeReservation.makeReservation(hotel, true);
			Reservation double2 =MakeReservation.makeReservation(hotel, true);
			
			Reservation deluxe1 = MakeReservation.makeReservation(hotel, true);
			Reservation deluxe2 = MakeReservation.makeReservation(hotel, true);
			
			Reservation vip1 = MakeReservation.makeReservation(hotel, true);
			Reservation vip2 = MakeReservation.makeReservation(hotel, true);
			
			
		//Adding reservation objects to array list
			rList.add(single1);
			rList.add(single2);
			rList.add(double1);
			rList.add(double2);
			rList.add(deluxe1);
			rList.add(deluxe2);
			rList.add(vip1);
			rList.add(vip2);
			

			TextReservation.saveReservations("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\reservations.txt", rList);
			
		//Adding guests from each reservation to an arraylist
			ArrayList<Guest> singleList1 = single1.getGuestList();
			ArrayList<Guest> singleList2 = single2.getGuestList();
			ArrayList<Guest> doubleList1 = double1.getGuestList();
			ArrayList<Guest> doubleList2 = double2.getGuestList();
			ArrayList<Guest> deluxeList1 = deluxe1.getGuestList();
			ArrayList<Guest> deluxeList2 = deluxe2.getGuestList();
			ArrayList<Guest> vipList1 = vip1.getGuestList();
			ArrayList<Guest> vipList2 = vip2.getGuestList();
			
			
			//singleList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", singleList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", singleList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", singleList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", singleList1);
		
			//singleList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", singleList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", singleList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", singleList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", singleList2);

			//doubleList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", doubleList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", doubleList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", doubleList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", doubleList1);
			
			//doubleList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", doubleList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", doubleList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", doubleList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", doubleList2);
			
			//deluxeList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", deluxeList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", deluxeList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", deluxeList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", deluxeList1);
			
			//deluxeList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", deluxeList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", deluxeList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", deluxeList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", deluxeList2);
			
			//vipList1
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", vipList1);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", vipList1);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", vipList1);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", vipList1);
			
			//vipList2
			TextGuest.saveGuests("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1.txt", vipList2);		
			//each file correspond to guests of each reservation
			//each index equal each guest
			TextIdentity.saveIDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\identity1.txt", vipList2);
			TextCreditCardInfo.saveCCIs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\creditCardInformation.txt", vipList2);
			TextContactDetails.saveCDs("C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\contactDetails.txt", vipList2);		
		
		
		
		}
		catch (ArrayException e) {System.out.println(e.getMessage());}
		catch (Exception ee) {
			System.out.println("Process terminated\n"); 
			}	
	}
}
