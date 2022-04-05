package hotel;

import Room.*;
import guest.*;
import reservation.*;
import list_methods.*;
import java.util.ArrayList;

public class Hotel {

	private ArrayList<Room> roomList;
	private ArrayList<Reservation> reservationList;
	private ArrayList<Guest> guestList;
	
	public Hotel() {
//==============================Rooms==============================
		this.roomList = new ArrayList<Room>();
		//Single Rooms (18 rooms - first 6 rooms of levels 02-05)
		for (int i=2; i<=5; i++) {
			for (int y=1; y<=12; y++) {
				if (y<=6){
					SingleRoom room = new SingleRoom(i,y);
					roomList.add(room);							
				}
				else{
					DoubleRoom room = new DoubleRoom(i,y);
					roomList.add(room);	
				}
			} 
		}
			
		//Deluxe Rooms (8 rooms)
		for (int i=1; i<=8; i++) {
			DeluxeRoom room = new DeluxeRoom(6,i);
			roomList.add(room);
		}		
		//VIPSuite (4 rooms)
		for (int i=1; i<=4; i++) {
			VIPSuite room = new VIPSuite(7,i);
			roomList.add(room);		
		}
		
		
//==============================Guest==============================
		this.guestList = new ArrayList<Guest>();
//==============================Reservation==============================
		this.reservationList = new ArrayList<Reservation>();
	}
	
	//get methods
	protected ArrayList<Room> getRoomList() {return this.roomList;}	
	protected ArrayList<Guest> getGuestList() {return this.guestList;}
	protected ArrayList<Reservation> getReservationList() {return this.reservationList;}
	
	//Guest Related
	public void addGuests(Reservation reservation) throws ArrayException {
		GuestListManipulator glm = new GuestListManipulator(this);
		glm.addList(reservation);
	}
	
	public void removeGuests(Reservation reservation) throws ArrayException {
		GuestListManipulator glm = new GuestListManipulator(this);
		glm.removeList(reservation);
	}
	
	//Reservation Related
	public void addReservation(Reservation reservation) throws ArrayException {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		rlm.addList(reservation);
	}
	
	public void removeReservation(Reservation reservation) throws ArrayException {
		ReservationListManipulator rlm = new ReservationListManipulator(this);
		rlm.removeList(reservation);
	}
}
