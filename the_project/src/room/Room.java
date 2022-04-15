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
 * Follows the Lisker Substitution Principle as every function created for Room can work for all its subclasses;
 * Follows the Open-Closed Principle as Room class is open for extension but closed for modification;
 */

public abstract class Room 
{
	/**
	 * type of room of this room (enumerations; SINGLE, DOUBLE, DELUXE, VIPSUITE);
	 */
	protected TypeOfRoom roomType;
	/**
	 * availability status of this room (enumerations; VACANT, OCCUPIED, RESERVED, UNDER_MAINTENANCE);
	 */
	protected AvailStatus availability;
	/**
	 * RoomFeatures object containing details of features of this room;
	 */
	protected RoomFeatures feature;
	/**
	 * room number of this room;
	 */
	protected String roomNumber;
	/**
	 * maximum number of guests allowed to stay in this room;
	 */
	protected int maxOccupancy;
	/**
	 * RoomRate object containing details of charged price per day of this room;
	 */
	protected RoomRate rate;
	/**
	 * Menu object containing details of food items available to this room;
	 */
	protected Menu menu;
	/**
	 * Reservation object containing details of reservation of this room by a guest;
	 */
	protected Reservation reservation;
	/**
	 * RoomService object containing details of food items ordered by guest(s) occupying this room;
	 */
	protected RoomService roomService;
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiates Room object by setting Menu object as this room's menu, VACANT as this room's availability status,
	 * a newly created RoomService object as this room's room service order, Feature object as this room's features,
	 * Rate object as this room's charged rate and initializes these objects to null/zero by default;
	 * Instantiates RoomFeatures object and RoomRate object;
	 * Follows the Single Responsibility principle as sole responsibility to instantiate a Room object;
	 * 
	 * @param menu Menu object containing food items available to this room for room service;
	 * @param bedType type of bed in this room, used to initialize RoomFeatures;
	 * @param viewType type of view of this room, used to initialize RoomFeatures;
	 * @param numOfBed number of beds in this room, used to initialize RoomFeatures;
	 * @param wiFi availability of wifi in this room, used to initialize RoomFeatures;
	 * @param smokeOut presence of a smokeout in this room, used to initialize RoomFeatures;
	 * @param weekDayPrice charged price of staying in this room on a weekday for guest(s), used to initialize RoomRate;
	 * @param weekEndPrice charged price of staying in this room on a weekend for guest(s), used to initialize RoomRate;
	 */
	public Room(Menu menu, TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wiFi, boolean smokeOut, double weekDayPrice, double weekEndPrice) {
		//instantiating RoomFeatures object
		RoomFeatures feature = new RoomFeatures(bedType, viewType, numOfBed, wiFi, smokeOut);
		//instantiating RoomRate object
		RoomRate rate = new RoomRate(weekDayPrice, weekEndPrice);
		this.availability = AvailStatus.VACANT;
		this.roomService = new RoomService();
		this.menu = menu;
		this.feature = feature;
		this.rate = rate;
		//Rest of objects are initialized to null/zero by default
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
	 * gets RoomFeatures object containing details of features of this room;
	 * @return RoomFeatures object of this room;
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
	 * gets Rate object containing charged price per day of this room;
	 * @return Rate object of this room;
	 */
	public RoomRate getRate() {return rate;}
	/**
	 * gets Menu object containing food items available to this room for room service;
	 * @return Menu object of this room;
	 */
	public Menu getMenu() {return menu;}
	/**
	 * Reservation object containing details of reservation of this room by a guest;
	 * @return Reservation object of this room;
	 */
	public Reservation getReservation() {return reservation;}
	/**
	 * RoomService object containing details of food items ordered by guest(s) occupying this room;
	 * @return RoomService object of this room;
	 */
	public RoomService getRoomService() {return roomService;}
	
	
	//set methods
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
	
	
	//resets room upon check out (to be used by Check out function)
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
		//Reset roomService object (essentially the array of orders and total bill of orders)
		RoomServiceManipulator rsm = new RoomServiceManipulator(this.roomService);
		rsm.resetArray();
		
		//Reset roomFeature object
		FeatureManipulator fm = new FeatureManipulator(this.feature);
		fm.resetArray();
		
		//if no more existing reservations
		if (reservation==null) {
			this.availability = AvailStatus.VACANT;
			this.reservation = null;
			System.out.println("- No further reservations,\n  Room status set to VACANT!");
		}
		//if there are still existing reservations
		else {
			this.availability = AvailStatus.RESERVED;
			//updates reservation object with upcoming reservation
			this.reservation = reservation;
			System.out.println("- Still have reservations,  Room status set to RESERVED!");
		}
		return;
	}
}