package reservation;
import guest.DisplayGuestInfo;

public class DisplayReservation {
	public static void info(Reservation reservation) {
		System.out.println("Room " + reservation.getRoom().getRoomNum());
		System.out.println("Check In: " + reservation.getCheckInDate() + " | " + reservation.getCheckInTime());
		System.out.println("Number of people staying: " + reservation.getNumOfGuest());
		System.out.println();
		System.out.println("Reservation made under:");
		System.out.println("--------------------------");
		DisplayGuestInfo.printInfo(reservation.getArray().get(0));
	}
}
