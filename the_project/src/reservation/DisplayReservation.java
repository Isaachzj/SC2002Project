package reservation;
import guest.DisplayGuestInfo;

public class DisplayReservation {
	public static void info(Reservation reservation) {
		System.out.println("Room " + reservation.getRoom().getRoomNum());
		System.out.println("Check In: " + reservation.getCheckInDateTime());
		System.out.println("Number of people staying: " + reservation.getNumOfGuest());
		System.out.println();
		System.out.println("RESERVATION MADE UNDER:\n");
		DisplayGuestInfo.printInfo(reservation.getGuestList().get(0));
	}
}
