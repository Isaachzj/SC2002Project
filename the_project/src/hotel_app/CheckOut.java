package hotel_app;

import enumeration.TypeOfRoom;
import hotel.*;
import reservation.*;
import room.*;
import list_methods.*;
import java.util.*;
import java.time.LocalDateTime;

public class CheckOut {
	
	public static void checkOut(Hotel hotel) throws ArrayException {

		Reservation reservation = hotel.getReservation();
		ReservationListManipulator rlm = new ReservationListManipulator(hotel);
		rlm.removeList(reservation);
		hotel.removeGuests(reservation);
		reservation.getRoom().reset();

		Receipt.info(reservation);
	}
}
