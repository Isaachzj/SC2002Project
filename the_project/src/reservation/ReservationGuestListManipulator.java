package reservation;

import guest.CreateGuest;
import guest.Guest;
import list_methods.*;
import java.util.Scanner;

public class ReservationGuestListManipulator implements AddStandard{
	private Reservation reservation;
	
	public ReservationGuestListManipulator(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public void addEntry() {
		//Create reserver
		System.out.println("\n------------ Reserver's details ------------");
		Guest reserver = CreateGuest.createReserver(reservation);
		reservation.getGuestList().add(reserver);
		
		for (int i=1;i<reservation.getNumOfGuest();i++) {
			System.out.printf("\n------------ Guest %d details------------\n",i);
			Guest guest = CreateGuest.createGuest(reservation);
			reservation.getGuestList().add(guest);
		}//end for
		
		return;
	}//end method	
}//end class