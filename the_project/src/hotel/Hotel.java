package hotel;

import guest.*;
import food_related.*;
import reservation.*;
import room.*;
import list_methods.*;
import enumeration.*;
import food_related.CreateMenus;

import java.util.ArrayList;

public class Hotel {

	private ArrayList<Room> roomList;
	private ArrayList<Reservation> reservationList;
	private ArrayList<Guest> guestList; 
	private ArrayList<Menu> menuList; 
	/**
	 * Creates and display menu which allows the selection of RoomType
	 * # RoomType
	 * The menu of RoomType is as follows {(RoomType-Index): Single-0, Double-1, Deluxe-2, VIP-3}
	 * Code also assumes that there are a total of 60 rooms in the Hotel object;
	 * of the 60 rooms - 24 are Single Rooms, 24 are Double Rooms,
	 * 8 are Deluxe Rooms, and 4 are VIP Suite
	 */
	public Hotel() {
//==============================Room Menus==============================
		/**
		 * # Room Menus
		 */
		ArrayList<Menu> allMenus = CreateMenus.createMenus(); // (RoomType-Index): Single-0, Double-1, Deluxe-2, VIP-3
		this.menuList = allMenus;
		
//==============================Rooms==============================
		/**
		 * # Rooms
		 */
		this.roomList = new ArrayList<Room>();
		/**
		 * Each floor from levels 02-05 will have 10 rooms each
		 * Single Rooms (20 rooms - first 5 rooms of levels 02-05)
		 * Double Rooms (20 rooms - last 5 rooms of levels 02-05)
		 */
		for (int i=2; i<=5; i++) {
			for (int y=1; y<=10; y++) {
				if (y<=5){
					SingleRoom room = new SingleRoom(allMenus.get(0),i,y);
					roomList.add(room);							
				}
				else{
					DoubleRoom room = new DoubleRoom(allMenus.get(1),i,y);
					roomList.add(room);	
				}
			} 
		}
			
		/**
		 * Deluxe Rooms (5 rooms)
		 */
		for (int i=1; i<=5; i++) {
			DeluxeRoom room = new DeluxeRoom(allMenus.get(2),6,i);
			roomList.add(room);
		}		
		/**
		 * VIPSuite (3 rooms)
		 */
		for (int i=1; i<=3; i++) {
			VIPSuite room = new VIPSuite(allMenus.get(3),7,i);
			roomList.add(room);		
		}
				
//==============================Guest==============================
		/**
		 * # Guest
		 */
		this.guestList = new ArrayList<Guest>();
//==============================Reservation==============================
		/**
		 * # Reservation
		 */
		this.reservationList = new ArrayList<Reservation>();
	} //end of constructor
	

	/**
	 * # Guest Related 
	 */
	/**
	 * addGuests method allows the guest to be added into the Hotel class
	 * (and hence Room AvailStatus to be marked as OCCUPIED)
	 * An Exception would also be thrown upon an error
	 * @param reservation hold the guests' essential information
	 * (id, credit card information, contact details, gender).
	 * this is needed for the guests to be added into the Hotel class
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void addGuests(Reservation reservation) throws ArrayException {
		GuestListManipulator glm = new GuestListManipulator(this);
		glm.addEntry(reservation);
	}
	/**
	 * removeGuests method allows the guest to be removed from the Hotel class
	 * (and hence Room AvailStatus to be marked as VACANT).
	 * An Exception would also be thrown upon an error
	 * @param reservation hold the guests' essential information
	 * (id, credit card information, contact details, gender)
	 * this is needed for the guests to be removed from the Hotel class
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void removeGuests(Reservation reservation) throws ArrayException {
		GuestListManipulator glm = new GuestListManipulator(this);
		glm.removeEntry(reservation);
	}
	/**
	 * getGuest method allows the guest details to be retrieved from the Hotel class
	 * (and hence no changes to the Room AvailStatus).
	 * An Exception would also be thrown upon an error
	 * @return Guest with the details (id, credit card information, contact details, gender)
	 */
	public Guest getGuest() {
		GuestListManipulator glm = new GuestListManipulator(this);
		return glm.getEntry();
	}
	/**
	 * getGuestList method returns the Guest with its details stored in the array
	 * (id, credit card information, contact details, gender).
	 * @return this is the array of Guest and their details
	 * (id, credit card information, contact details, gender)
	 */
	protected ArrayList<Guest> getGuestList() {return this.guestList;}
	
	
	
	/**
	 * # Reservation Related 
	 */
	/**
	 * addReservation method allows the reserver to be added
	 * into the Hotel class (and hence Room AvailStatus to be marked as RESERVED)
	 * An Exception would also be thrown upon an error
	 * @param reservation is needed for the reservation to be added to the Hotel class
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void addReservation(Reservation reservation) throws ArrayException {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		rlm.addEntry(reservation);
	}
	/**
	 * removeReservation method allows the reserver to be removed from the Hotel class
	 * (and hence Room AvailStatus to be marked as VACANT).
	 * An Exception would also be thrown upon an error
	 * @param reservation is needed for the reservation to be removed from the Hotel class
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void removeReservation(Reservation reservation) throws ArrayException {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		rlm.removeEntry(reservation);
	}
	/**
	 * getReservation method allows the reservation to be retrieved from the Hotel class
	 * An Exception would also be thrown upon an error
	 * @return reservation hold the reserver's essential information
	 * (id, credit card information, contact details, gender)
	 * this is needed for the reserver details to be retrieved from the Hotel class
	 */
	public Reservation getReservation() {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		return rlm.getEntry();
	}
	/**
	 * getEarliestReservation method allows the earliest reserver details to be retrieved
	 * from the Hotel class (and hence no changes to the Room AvailStatus).
	 * The earliest reservation means the closest reservation in which reserver has
	 * to check in by from the given time
	 * Once the reservation check in has lapsed and reserver has yet to book in;
	 * the reservation would be invalid (Room AvailStatus to be marked as VACANT).
	 * An Exception would also be thrown upon an error
	 * @param reservationList this is the array which contains the details of the reserver
	 * (id, credit card information, contact details, gender)
	 * this is required to find the earliest reservation by array traversal
	 * @return returns the reserver and its details that has the earliest reservation
	 * by array traversal
	 */
	public Reservation getEarliestReservation(ArrayList<Reservation> reservationList) {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		return rlm.getEntry(reservationList);
	}
	/**
	 * getRoomReservationList method returns a list of all reservations for
	 * that given room in the Hotel class 
	 * 
	 * @param room this is the room for which the method retrieves the room reservation list
	 * this is required to find room reservation list for the room stated in the parameter
	 * @return this is room reservation list
	 */
	public ArrayList<Reservation> getRoomReservationList(Room room) {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		return rlm.getRoomReservations(room);
	}
	/**
	 * reservationInfo prints all current reservations with the Hotel
	 */
	public void reservationInfo() {
		DisplayReservationList drl = new DisplayReservationList(this);
		drl.printArray();
	}
	/**
	 * this method retrieves the reservation list in the Hotel class
	 * @return this is the reservation list
	 */
	public ArrayList<Reservation> getReservationList() {return this.reservationList;}
	
	
	
	
	/**
	 * # Room Related
	 */
	/**
	 * getVacantRoom returns the first Room that is vacant
	 * (i.e. has an AvailStatus of VACANT) for the specified roomType
	 * when the Room is returned (i.e. VACANT room), it can be reserved
	 * @param roomType this is the type of room under which to check the first Room that is vacant
	 * this is required so as to specify which type of room is vacancy being checked for
	 * @return this is the Room which is VACANT for the given room type in the parameter
	 */
	public Room getVacantRoom(TypeOfRoom roomType) {
		RoomListManipulator rlm = new RoomListManipulator(this);
		return rlm.getEntry(roomType);	
	}	

	/**
	 * getRoom returns the Room under the Hotel object
	 * @return this returns the Room object
	 */
	public Room getRoom() {
		RoomListManipulator rlm = new RoomListManipulator(this);
		return rlm.getEntry();	
	}
	/**
	 * this returns the array of Room object and its details under
	 * the given roomType (SINGLE, DOUBLE, DELUXE, VIPSUITE)
	 * @param roomType this is the room type of the array of room object to be retrieved (SINGLE, DOUBLE, DELUXE, VIPSUITE)
	 * @return this is the array of room object retrieved
	 */
	public ArrayList<Room> getSameTypeRooms(TypeOfRoom roomType) {
		RoomListManipulator rlm = new RoomListManipulator(this);
		return rlm.getSameTypeRooms(roomType);	
	}
	
	/**
	 * This method is solely used in the deserialization process
	 * @param roomNum is the required room number
	 * @return returns desired room or null if room don't exist
	 */
	public Room getSpecificRoom(String roomNum) {
		RoomListManipulator rlm = new RoomListManipulator(this);
		return rlm.getEntry(roomNum);	
	}
	
	/**
	 * this method is set to protected for better encapsulation.
	 * this ensures better encapsulation of information while ensuring
	 * that the methods can be accessed by the same package and subclasses
	 * @return this is the retrieved roomList
	 */
	protected ArrayList<Room> getRoomList() {return this.roomList;}	
	
	
	/**
	 * Menu Related
	 */
	/**
	 * getMenu method allows the Menu object for that specified index to be retrieved
	 * @param choice this is the index specified of the Menu object to be returned
	 * @return this is the Menu object that is retrieved
	 */
	public Menu getMenu(int choice) {
		return menuList.get(choice-1);
	}
	
	/** 
	 * Refreshing related
	 */
	
	public void refreshHotel() throws ArrayException{
		Refresher.refresh(this);
	}

}
