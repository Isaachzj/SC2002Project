package hotel;

import list_methods.Print;
import reservation.*;
import reservation.DisplayReservation;
/**
 * Displays the reservation list from Hotel object
 * creates a DisplayReservationList object and add this object
 * The DisplayReservationList class follows the Single Responsibility principle,
 * as has a sole responsibility of displaying the reservation list
 * If the reservation list is empty (i.e. reservation list size==0); prints error and returns
 * Else, if the reservation list is not empty; travserse the array and prints the details. 
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class DisplayReservationList implements Print {
	private Hotel hotel;
	/**
	 * # Displays the reservation list from Hotel object
	 * creates a DisplayReservationList object and add this object
	 * The DisplayReservationList class follows the Single Responsibility principle,
	 * as has a sole responsibility of displaying the reservation list
	 * If the reservation list is empty (i.e. reservation list size==0); prints error and returns
	 * Else, if the reservation list is not empty; travserse the array and prints the details 
	 * @param this is the Hotel object which stores attributes on the reservation list
	 * this is the hotel in which reservation list is to be displayed from
	 */
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
			reservation.info();
			System.out.println("\n\n");
		}
		return;
	}
}
