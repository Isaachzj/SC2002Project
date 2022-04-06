package reservation;
import guest.*;
import room.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	protected Room room;
	

	protected LocalDateTime checkInDateTime; //@YanKai note the changes
	protected LocalDateTime checkOutDateTime; //@YanKai note the changes
	protected long numOfWeekday;
	protected long numOfWeekend;
	protected int numOfGuest;
	protected ArrayList<Guest> guestList = new ArrayList<Guest>();
	
	public Room getRoom() {return this.room;}
	public LocalDateTime getCheckInDateTime() {return this.checkInDateTime;}
	public LocalDateTime getCheckOutDateTime() {return this.checkOutDateTime;}
	public long getNumOfWeekday() {return this.numOfWeekday;}
	public long getNumOfWeekend() {return this.numOfWeekend;}
	public ArrayList<Guest> getArray() {return this.guestList;}
	public int getNumOfGuest() {return this.numOfGuest;}

	public void setCheckInDateTime(LocalDateTime checkInDateTime) {this.checkInDateTime = checkInDateTime;} //@YanKai note the changes
	public void setCheckOutDateTime(LocalDateTime checkOutDateTime) {this.checkOutDateTime = checkOutDateTime;} //@YanKai note the changes
	public void setNumOfWeekday(long numOfWeekday) {this.numOfWeekday = numOfWeekday;}
	public void setNumOfWeekend(long numOfWeekend) {this.numOfWeekend = numOfWeekend;}
	
	public Guest getGuest() {return this.guestList.get(0);}
	
	public Reservation(Room room) { 
		this.room = room;
		this.numOfWeekday = 0;
		this.numOfWeekend = 0;
		this.numOfGuest = 0;
		this.guestList = new ArrayList<Guest>();
	}
	
	public Reservation(Room room, LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime, long numOfWeekday, long numOfWeekend, int numOfGuest) {
		this.room = room;
		this.numOfWeekday = numOfWeekday;
		this.numOfWeekend = numOfWeekend;
		this.numOfGuest = numOfGuest;
		this.checkInDateTime = checkInDateTime;//@YanKai note the changes
		this.checkOutDateTime = checkOutDateTime;//@YanKai note the changes
	}
	
	public void addGuest() {
		ReservationGuestListManipulator rglm = new ReservationGuestListManipulator(this);
		rglm.addList();
	}
}
