package enumeration;

/**
 * enumerations for viewType of a RoomFeatures object;
 * there are 3 types (STANDARD, OCEAN, CITY);
 * * the type of view that a Room object has, that the guest is able to view from his room;
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 */

public enum ViewType {
	/**
	 * viewType of RoomFeatures object is Standard;
	 * type of view for SingleRoom object and DoubleRoom object;
	 */
	STANDARD, 
	/**
	 * viewType of RoomFeatures object is Ocean;
	 * type of view for VIPSuite object;
	 * the guest can view the shallow turquoise ocean that invites the fresh smell of sea salt upon the opening of the window;
	 */
	OCEAN, 
	/**
	 * viewType of RoomFeatures object is City;
	 * type of view for DeluxeRoom object;
	 * the guest can view the city bustling with full of life as there are indistinguishable chatter among the street vendors;
	 */
	CITY
}
