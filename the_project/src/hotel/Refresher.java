package hotel;

import reservation.*;
import food_related.*;
import list_methods.ArrayException;
import java.time.*;

import enumeration.AvailStatus;

public class Refresher {

	public static void refresh(Hotel hotel) throws ArrayException {
		
		//Getting local date time
		LocalDateTime currentDateTime = LocalDateTime.now();
		//Updating reservation list
		for (int i=0; i<hotel.getReservationList().size(); i++) {
			//Get reservation object
			Reservation reservation = hotel.getReservationList().get(i);
			
			//Removing reservation if guests did not check in within 1 hour of stipulated time
			if (reservation.getRoom().getAvail() == AvailStatus.RESERVED) {
				LocalDateTime checkInDateTime = reservation.getCheckInDateTime();
				//Remove 
				if (currentDateTime.isBefore(checkInDateTime.plusHours(1))){
					hotel.removeReservation(reservation);
					continue;
				}	
			}
			
			//Updating order status of occupants if they have orders
			else if (reservation.getRoom().getAvail() == AvailStatus.OCCUPIED) {
				RoomService roomService = reservation.getRoom().getRoomService();
				//Refreshing roomService object (update orders to completed if really so)
				roomService.refreshOrderStatuses();
			}
		
		}//end for
		
		return;
	}
}
