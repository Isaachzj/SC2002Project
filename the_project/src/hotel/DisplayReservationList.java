package hotel;

import list_methods.Print;
import reservation.*;
import reservation.DisplayReservation;

public class DisplayReservationList implements Print {
	private Hotel hotel;
	
	public DisplayReservationList(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public void printArray() {
		System.out.println("========== RESERVATION LIST ==========");
		
		if (hotel.getReservationList().size()==0) {
			System.out.println("No Reservations at the present moment.");
			return;
		}
		
		for (int i=0; i<hotel.getReservationList().size(); i++) {
			System.out.printf("--Reservation %d --\n", i+1);
			Reservation reservation = hotel.getReservationList().get(i);
			DisplayReservation.info(reservation);
			System.out.println("\n\n");
		}
		return;
	}
	
}
