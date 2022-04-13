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

public abstract class Room 
{
	protected TypeOfRoom roomType;
	protected AvailStatus availability;
	protected RoomFeatures feature;
	protected String roomNumber;
	protected int maxOccupancy;
	protected RoomRate rate;
	protected Menu menu;
	protected Reservation reservation;
	protected RoomService roomService;
	
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
	public TypeOfRoom getRoomType() {return roomType;}
	public AvailStatus getAvail() {return availability;}
	public RoomFeatures getRoomFeatures() {return feature;}
	public String getRoomNum() {return this.roomNumber;}	
	public int getMaxOccupancy() {return this.maxOccupancy;}
	public RoomRate getRate() {return rate;}
	public Menu getMenu() {return menu;}
	public Reservation getReservation() {return reservation;}
	public RoomService getRoomService() {return roomService;}
	
	
	//set methods
	public void setAvail(AvailStatus availability) {this.availability = availability;}
	public void setReservation(Reservation reservation) {this.reservation = reservation;}
	
	
	//resets room upon check out (to be used by Check out function)
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