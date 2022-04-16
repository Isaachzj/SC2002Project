package reservation;
import java.time.format.DateTimeFormatter;

import guest.DisplayGuestInfo;

public class DisplayReservation {
	/**
	 * info method prints out the details of the Reservation object.
	 * This includes the room number, check-in/out date and time,
	 * number of guests and whose name the reservation was made under
	 * @param reservation this is the reservation object for the Display of its details
	 */
	public static void info(Reservation reservation) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm");
		System.out.println("Room " + reservation.getRoom().getRoomNum());
		System.out.println("Check In: " + reservation.getCheckInDateTime().format(formatter));
		System.out.println("Check Out: " + reservation.getCheckOutDateTime().format(formatter));
		System.out.println("Number of people staying: " + reservation.getNumOfGuest());
		System.out.println();
		System.out.println("RESERVATION MADE UNDER:\n");
		DisplayGuestInfo.printInfo(reservation.getGuestList().get(0));
	}
}
