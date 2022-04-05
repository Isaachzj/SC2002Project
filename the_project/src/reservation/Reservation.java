package reservation;

import java.util.ArrayList;
import Room.Room;

public class Reservation {
	private Room room;
	private ArrayList<Guest> guestlist;
	private String reserve_time;
	private String checkIn;
	private String checkOut;
	
	public Reservation(Room room) {
		this.room = room;		
	}
}
