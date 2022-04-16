package enumeration;
/**
 * Created enumeration for the room availability status. 
 * Enumerations for availability status (AvailStatus) of a Room object;
 * there are 4 types available (VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public enum AvailStatus {
	/**
	 * Room object availability status is Vacant; Available for reservation;
	 * Room is not currently occupied by any guests and available for reservation
	 */
	VACANT, 
	/**
	 * Room object availability status is Occupied; Not Available for reservation;
	 * Room is currently occupied by guest(s) that previously reserved this Room;
	 */
	OCCUPIED, 
	/**
	 * Room object availability status is Reserved; Not Available for further reservation;
	 * Room is currently booked under guest(s) name(s) but not occupied by guest(s) yet
	 */
	RESERVED, 
	/**
	 * Room object availability status is Under Maintenance; Not Available for reservation;
	 * Room is currently undergoing maintenance;
	 */
	UNDER_MAINTENANCE
}
