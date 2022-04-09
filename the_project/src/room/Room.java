package room;

import enumeration.AvailStatus;
import enumeration.TypeOfRoom;
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
	protected int roomFloor;
	protected int roomNumber;
	protected int maxOccupancy;
	protected RoomRate rate;
	protected Menu menu;
	protected Reservation reservation;
	protected RoomService roomService;
	
	//default constructor (creates the reservation and roomService object, also sets availability to VACANT by default)
	public Room(Menu menu) {
		this.availability = AvailStatus.VACANT;
		this.roomService = new RoomService();
		this.menu = menu;
		//Rest of objects are initialized to null/zero by default
	}
	
	//get methods
	public TypeOfRoom getRoomType() {return roomType;}
	public AvailStatus getAvail() {return availability;}
	public RoomFeatures getRoomFeatures() {return feature;}
	public int getRoomFloor() {return this.roomFloor;}
	public int getRoomNum() {return this.roomNumber;}	
	public int getMaxOccupancy() {return this.maxOccupancy;}
	public RoomRate getRate() {return rate;}
	public Menu getMenu() {return menu;}
	public Reservation getReservation() {return reservation;}
	public RoomService getRoomService() {return roomService;}
	
	
	//set methods
	public void setAvail(AvailStatus availability) {this.availability = availability;}
	public void setReservation(Reservation reservation) {this.reservation = reservation;}
	
	
	//resets room upon check out (to be used by Check out function)
	public void reset() throws ArrayException{
		//Reset roomService object (essentially the array of orders and total bill of orders)
		RoomServiceManipulator rsm = new RoomServiceManipulator(this.roomService);
		rsm.resetList();
		//Reset availability to AVAILABLE
		this.availability = AvailStatus.VACANT;
		//Reset Reservation object to NULL
		this.reservation = null;
	}
}

//need to do SRP for creating/updating room details (DONE)