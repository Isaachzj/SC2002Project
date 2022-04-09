package hotel;

import guest.*;
import food_related.*;
import reservation.*;
import room.*;
import list_methods.*;
import enumeration.*;
import food_related.CreateMenu;

import java.util.ArrayList;

public class Hotel {

	private ArrayList<Room> roomList;
	private ArrayList<Reservation> reservationList;
	private ArrayList<Guest> guestList;
	private ArrayList<Menu> menuList; 
	
	public Hotel() {
//==============================Room Menus==============================
		ArrayList<Menu> allMenus = CreateMenu.createMenu(); // (RoomType-Index): Single-0, Double-1, Deluxe-2, VIP-3
		this.menuList = allMenus;
//==============================Rooms==============================
		this.roomList = new ArrayList<Room>();
		//Single Rooms (18 rooms - first 6 rooms of levels 02-05)
		for (int i=2; i<=5; i++) {
			for (int y=1; y<=12; y++) {
				if (y<=6){
					SingleRoom room = new SingleRoom(allMenus.get(0),i,y);
					roomList.add(room);							
				}
				else{
					DoubleRoom room = new DoubleRoom(allMenus.get(1),i,y);
					roomList.add(room);	
				}
			} 
		}
			
		//Deluxe Rooms (8 rooms)
		for (int i=1; i<=8; i++) {
			DeluxeRoom room = new DeluxeRoom(allMenus.get(2),6,i);
			roomList.add(room);
		}		
		//VIPSuite (4 rooms)
		for (int i=1; i<=4; i++) {
			VIPSuite room = new VIPSuite(allMenus.get(3),7,i);
			roomList.add(room);		
		}
		
		
//==============================Guest==============================
		this.guestList = new ArrayList<Guest>();
//==============================Reservation==============================
		this.reservationList = new ArrayList<Reservation>();
	}
	

	//Guest Related
	public void addGuests(Reservation reservation) throws ArrayException {
		GuestListManipulator glm = new GuestListManipulator(this);
		glm.addList(reservation);
	}
	
	public void removeGuests(Reservation reservation) throws ArrayException {
		GuestListManipulator glm = new GuestListManipulator(this);
		glm.removeList(reservation);
	}
	
	public Guest getGuest() {
		GuestListManipulator glm = new GuestListManipulator(this);
		return glm.getEntry();
	}

	protected ArrayList<Guest> getGuestList() {return this.guestList;}
	
	
	
	//Reservation Related
	public void addReservation(Reservation reservation) throws ArrayException {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		rlm.addList(reservation);
	}
	
	public void removeReservation(Reservation reservation) throws ArrayException {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		rlm.removeList(reservation);
	}
	
	public Reservation getReservation() {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		return rlm.getEntry();
	}
	
	protected ArrayList<Reservation> getReservationList() {return this.reservationList;}
	
	
	
	
	//Room Related
	public Room getVacantRoom(TypeOfRoom roomType) {
		RoomListManipulator rlm = new RoomListManipulator(this);
		return rlm.getVacantRoom(roomType);	
	}	
	
	public Room getRoom() {
		RoomListManipulator rlm = new RoomListManipulator(this);
		return rlm.getEntry();	
	}
	
	protected ArrayList<Room> getRoomList() {return this.roomList;}	
	
	
	
	//Menu Related
	public Menu getMenu(int choice) {
		return menuList.get(choice-1);
	}

}
