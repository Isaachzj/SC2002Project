package enumeration;
/**
 * For the enum of AvailStatus; there are 4 types available (VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE)
 * VACANT is used to indicate where the room is open for reservation; where room is unoccupied and not reserved
 * OCCUPIED is used to indicate where guest has already checked into the room; where room is occupied
 * RESERVED is used to indicate where the room has been reserved for check in at the given time
 * if however, guest do not check in by the stipulated time, AvailStatus of room will be changed to VACANT to allow for other reservations
 * UNDER_MAINTENANCE is used to indicate when a room is held either for renovation or room cleaning and hence would not be open for reservation
 * however, once the maintenance for the room is completed, room status can be changed back to VACANT
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public enum AvailStatus {
	VACANT, OCCUPIED, RESERVED, 
	UNDER_MAINTENANCE
}
