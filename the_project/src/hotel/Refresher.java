package hotel;

import reservation.*;
import food_related.*;
import list_methods.ArrayException;
import java.time.*;

import enumeration.AvailStatus;

/**
 * Updates availability status and room service order status 
 * of reserved or occupied rooms automatically;
 * 
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class Refresher {

	/**
	 * Updates availability status and room service order status 
	 * of reserved or occupied rooms automatically;
	 * @param hotel is the Hotel object containing information about all reservations, guests and rooms;
	 * @throws ArrayException this throws a custom Exception called ArrayException
	 */
	public static void refresh(Hotel hotel) throws ArrayException {
		
		/**
		 * # Getting local date time
		 */
		LocalDateTime currentDateTime = LocalDateTime.now();
		/**
		 * # Updating reservation list
		 */
		for (int i=0; i<hotel.getReservationList().size(); i++) {
			/**
			 * # Get reservation object
			 */
			Reservation reservation = hotel.getReservationList().get(i);
			
			/**
			 * # Removing reservation if guests did not check in within 1 hour of stipulated time
			 */
			if (reservation.getRoom().getAvail() == AvailStatus.RESERVED) {
				LocalDateTime checkInDateTime = reservation.getCheckInDateTime();
				//Remove 
				if (currentDateTime.isAfter(checkInDateTime.plusHours(1))){
					hotel.removeReservation(reservation);
					continue;
				}	
			}
			
			/**
			 * # Updating order status of occupants if they have orders
			 */
			else if (reservation.getRoom().getAvail() == AvailStatus.OCCUPIED) {
				RoomService roomService = reservation.getRoom().getRoomService();
				/**
				 * # Refreshing roomService object (update orders to completed if really so)
				 */
				roomService.refreshOrderStatuses();
			}
		
		}//end for
		
		return;
	}
}
