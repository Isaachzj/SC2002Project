package room;

import enumeration.AvailStatus;

import enumeration.TypeOfBed;
import enumeration.TypeOfRoom;
import enumeration.ViewType;
import food_related.*;
import room_features.*;
import room_rate.*;
import list_methods.*;
import reservation.*;
/**
 * 
 * Follows the Liskov Substitution principle as this superclass is replaceable with all its subclasses;
 * and the programme would still has its functionality 
>>>>>>> Stashed changes
 */

public abstract class Room 
{
	/**
	 * this is the type of room of this room (enumerations);
	 * consists of SINGLE, DOUBLE, DELUXE, VIPSUITE (protected attribute)
	 */
	protected TypeOfRoom roomType;
	/**
	 * this is the availability status of this room (enumerations);
	 * VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE (protected attribute)
	 */
	protected AvailStatus availability;
	/**
	 * this contain details of features of this room (protected attribute)
	 */
	protected RoomFeatures feature;
	/**
	 * this is the room number (protected attribute)
	 */
	protected String roomNumber;
	/**
	 * this is the maximum number of guests allowed to stay in given room (protected attribute)
	 */
	protected int maxOccupancy;
	/**
	 * this is the room rate for the given room (protected attribute)
	 */
	protected RoomRate rate;
	/**
	 * this is the Menu object containing details of food items available to this room (protected attribute)
	 */
	protected Menu menu;
	/**
	 * this contains  the reservation details of this room by a guest (protected attribute)
	 */
	protected Reservation reservation;
	
	/**
	 * RoomService object;
	 * contains room service order details of this room;
	 */
	protected RoomService roomService;
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of the Room object
	 * This includes details such as the menu type of bed, view type, number of bed, whether if there are wifi, whether if smoking is allowed,
	 * the price of room for each weekday booked and the price of room for each weekend booked
	 * Room's availability status is set as VACANT upon instantiation
	 * a newly created RoomService object as this room's room service order, Feature object as this room's features,
	 * Rate object as this room's charged rate and initializes these objects to null/zero by default;
	 * Instantiates RoomFeatures object and RoomRate object;
	 * Follows the Single Responsibility principle as sole responsibility to instantiate a Room object;
	 * 
	 * @param menu this contains the food items available to this room
	 * @param this is the type of bed in this room.
	 * The enumeration for the bedType are SINGLE, QUEEN and KING
	 * @param this is the type of view that a Room object has, that the guest is able to view from his room
	 * The enumeration for the viewType are STANDARD, OCEAN, CITY
	 * @param this is the number of beds in this room, used to initialize RoomFeatures;
	 * @param this is the availability of wifi in this room.
	 * wiFi; if indicated as 'true' means that there is wifi services in the room.
	 * else if there is no wifi services in the room, it would be indicated as 'false'
	 * @param this is the ability to smoke in this room.
	 * smokeOut; if indicated as 'true' means that smoking is allowed.
	 * else if there is smoking is not allowed, it would be indicated as 'false'
	 * @param weekDayPrice this is the bill incurred for the booking for each weekday under the instantiated room
	 * @param weekEndPrice this is the bill incurred for the booking for each weekend under the instantiated room
	 */
	public Room(Menu menu, TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wiFi, boolean smokeOut, double weekDayPrice, double weekEndPrice) {
		/**
		 * # instantiating RoomFeatures object
		 */
		RoomFeatures feature = new RoomFeatures(bedType, viewType, numOfBed, wiFi, smokeOut);
		/**
		 * # instantiating RoomRate object
		 */
		RoomRate rate = new RoomRate(weekDayPrice, weekEndPrice);
		this.availability = AvailStatus.VACANT;
		this.roomService = new RoomService();
		this.menu = menu;
		this.feature = feature;
		this.rate = rate;
		/**
		 * # Rest of objects are initialized to null/zero by default
		 */
	}
	
	
	
	//get methods
	/**
	 * gets type of room of this room;
	 * @return type of this room: SINGLE, DOUBLE, DELUXE or VIPSUITE;
	 */
	public TypeOfRoom getRoomType() {return roomType;}
	
	/**
	 * gets availability status of this room;
	 * @return availability status of this room: VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE;
	 */
	public AvailStatus getAvail() {return availability;}
	
	/**
	 * gets RoomFeature object of this room containing features of this room (bedType, viewType, numOfBed, wifi, smokeOut);
	 * @return RoomFeature object of this room;
	 */
	public RoomFeatures getRoomFeatures() {return feature;}
	/**
	 * gets room number of this room;
	 * @return this.roomNumber: room number of this room;
	 */
	public String getRoomNum() {return this.roomNumber;}
	
	/**
	 * gets maximum number of guests allowed to stay in this room;
	 * @return this.maxOccupancy: maximum number of occupants in this room;
	 */
	public int getMaxOccupancy() {return this.maxOccupancy;}

	/**
	 * gets price per day of stay of this room;
	 * @return charged rate of this room;
	 */
	public RoomRate getRate() {return rate;}
	/**
	 * gets Menu object containing food list available for room service of this room;
	 * @return Menu object containing menu items for this room;
	 */
	public Menu getMenu() {return menu;}
	/**
	 * gets Reservation object of this room containing reservation details of this room;
	 * @return if reservation has been made for this room, returns Reservation object that has reservation details of this room; if not, returns null;
	 */
	public Reservation getReservation() {return reservation;}
	
	/**
	 * gets RoomService object of this room containing room service order details of this room;
	 * @return RoomService object of this room containing room service order details of this room;
	 */
	public RoomService getRoomService() {return roomService;}
		
	/**
	 * sets availability status of this room;
	 * @param availability availability status of this room: VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE;
	 */
	public void setAvail(AvailStatus availability) {this.availability = availability;}
	/**
	 * sets reservation of this room using Reservation object;
	 * @param reservation Reservation object containing reservation details of this room;
	 */

	public void setReservation(Reservation reservation) {this.reservation = reservation;}
		
	/**
	 * resets room upon check out (to be used by Check out function)
	 */
	/**
	 * Resets this room upon check out by guest(s) previously staying in this room by 
	 * resetting roomService object (essentially the array of orders and total bill of orders) 
	 * and roomFeature object of this room;
	 * Availability status of this room is set to VACANT if no more existing reservations after current
	 * and set to RESERVED if there are still more reservations;
	 * Used by Check out function; 
	 * Follows the Single Responsibility principle as sole responsibility to reset this Room object;
	 * 
	 * @param reservation Reservation object of this room
	 */
	public void reset(Reservation reservation) {
		
		System.out.println("\n----RESETING ROOM----");
		/**
		 * # Reset roomService object (essentially the array of orders and total bill of orders)
		 */
		RoomServiceManipulator rsm = new RoomServiceManipulator(this.roomService);
		rsm.resetArray();
		
		/**
		 * # Reset roomFeature object
		 */
		FeatureManipulator fm = new FeatureManipulator(this.feature);
		fm.resetArray();
		
		/**
		 * # if no more existing reservations
		 */
		if (reservation==null) {
			this.availability = AvailStatus.VACANT;
			this.reservation = null;
			System.out.println("- No further reservations,\n  Room status set to VACANT!");
		}
		/**
		 * # if there are still existing reservations
		 */
		else {
			this.availability = AvailStatus.RESERVED;
			/**
			 * # updates reservation object with upcoming reservation
			 */
			this.reservation = reservation;
			System.out.println("- Still have reservations,  Room status set to RESERVED!");
		}
		return;
	}
}