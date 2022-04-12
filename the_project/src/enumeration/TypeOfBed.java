package enumeration;

/**
 * enumerations for bedType of a RoomFeatures object;
 * the type of bed that a Room object has;
 * For the enumeration of the TypeOfBed, there are 3 types (SINGLE, QUEEN, KING);
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 *
 */

public enum TypeOfBed {
	/**
	 * bedType of RoomFeatures object is Single; 
	 * type of bed for SingleRoom object and DoubleRoom object;
	 */
	SINGLE, 
	/**
	 * bedType of RoomFeatures object is Queen;
	 * type of bed for DeluxeRoom object;
	 */
	QUEEN, 
	/**
	 * bedType of RoomFeatures object is King;
	 * type of bed for VIPSuite object;
	 */
	KING
}
