package reservation;

import guest.CreateGuest;
import guest.Guest;
import list_methods.*;
import java.util.Scanner;

public class ReservationGuestListManipulator implements AddNew{
	private Reservation reservation;
	
	public ReservationGuestListManipulator(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public void addList() {
		//Create reserver
		System.out.println("------------ Reservation Maker ------------");
		Guest reserver = CreateGuest.createReserver(reservation);
		reservation.getArray().add(reserver);
		
		for (int i=1;i<reservation.getNumOfGuest();i++) {
			System.out.printf("----------------- Guest %d -----------------\n",i);
			Guest guest = CreateGuest.createGuest(reservation);
			reservation.getArray().add(guest);
		}//end for
		
		return;
	}//end method
	
}//end class