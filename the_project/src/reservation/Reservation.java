package reservation;
import Room.*;
import guest.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	protected Room room;
	

	protected LocalDateTime checkInDateTime;
	protected LocalDateTime checkOutDateTime;
	protected long numOfWeekday;
	protected long numOfWeekend;
	protected int numOfGuest;
	protected ArrayList<Guest> guestList = new ArrayList<Guest>();
	
	public Room getRoom() {return this.room;}
	public LocalDateTime getCheckInDate() {return this.checkInDateTime;}
	public LocalDateTime getCheckOutDate() {return this.checkOutDateTime;}
	public long getNumOfWeekday() {return this.numOfWeekday;}
	public long getNumOfWeekend() {return this.numOfWeekend;}
	public ArrayList<Guest> getArray() {return this.guestList;}
	public int getNumOfGuest() {return this.numOfGuest;}

	public void setCheckInDateTime(int checkInTime) {this.checkInTime = checkInTime;}
	public void setCheckOutTime(int checkOutTime) {this.checkOutTime = checkOutTime;}
	public void setNumOfWeekday(long numOfWeekday) {this.numOfWeekday = numOfWeekday;}
	public void setNumOfWeekend(long numOfWeekend) {this.numOfWeekend = numOfWeekend;}
	
	public Guest getGuest() {return this.guestList.get(0);}
	
	public Reservation(Room room) {
		this.room = room;
		this.checkInDate = null;
		this.checkInTime = 0000;
		this.checkOutDate = null;
		this.checkOutTime = 0000;
		this.numOfWeekday = 0;
		this.numOfWeekend = 0;
		this.numOfGuest = 0;
		this.guestList = new ArrayList<Guest>();
	}
	
	public Reservation(Room room, LocalDate checkInDate, int checkInTime, LocalDate checkOutDate, int checkOutTime, long numOfWeekday, long numOfWeekend, int numOfGuest) {
		this.room = room;
		this.checkInDate = checkInDate;
		this.checkInTime = checkInTime;
		this.checkOutDate = checkOutDate;
		this.checkOutTime = checkOutTime;
		this.numOfWeekday = numOfWeekday;
		this.numOfWeekend = numOfWeekend;
		this.numOfGuest = numOfGuest;
	}
	
	public void addGuest() {
		ReservationGuestListManipulator rglm = new ReservationGuestListManipulator(this);
		rglm.addList();
	}
}
