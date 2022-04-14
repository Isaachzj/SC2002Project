package reservation;
import guest.*;
import room.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	protected Room room;
	
	/**
	 * this is the check-in date and time (protected attributes)
	 */
	protected LocalDateTime checkInDateTime;
	/**
	 * this is the check-out date and time (protected attributes)
	 */
	protected LocalDateTime checkOutDateTime;
	/**
	 * this is the number of weekday for the booking by the guest (protected attributes)
	 */
	protected long numOfWeekday;
	/**
	 * this is the number of weekend for the booking by the guest (protected attributes)
	 */
	protected long numOfWeekend;
	/**
	 * this is the number of guests (protected attributes)
	 */
	protected int numOfGuest;
	
	protected ArrayList<Guest> guestList = new ArrayList<Guest>();
	
	/*public Reservation(Room room) {  (CAN DELETE SINCE NOT USING)
		this.room = room;
		this.numOfWeekday = 0;
		this.numOfWeekend = 0;
		this.numOfGuest = 0;
		this.guestList = new ArrayList<Guest>();
	}	*/
		
		/**
		 * Instantiation of Reservation object
		 * this includes details such as the room, check-in date-time, check-out date-time, number of weekday and weekend of stay, number of guest
		 * @param room room this is the Room object of the reservation
		 * @param checkInDateTime this is the check in date of the reservation.
		 * The check in date will always be before the check out date.
		 * @param checkOutDateTime this is the check out date of the reservation.
		 * The check out date will always be after the check in date.
		 * @param numOfWeekday this is the number of weekdays for the stay
		 * @param numOfWeekend this is the number of weekends for the stay
		 * @param numOfGuest this is the number of guest that would be staying in the hotel for the reservation
		 */
		public Reservation(Room room, LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime, long numOfWeekday, long numOfWeekend, int numOfGuest) {
		this.room = room;
		this.numOfWeekday = numOfWeekday;
		this.numOfWeekend = numOfWeekend;
		this.numOfGuest = numOfGuest;
		this.checkInDateTime = checkInDateTime;
		this.checkOutDateTime = checkOutDateTime;
	}
	
	/**
	 * getRoom() returning the Room object is public
	 * @return this is the room with the details.
	 * Details includes type of room, availability, feature, room number, occupancy and room rate
	 */
	public Room getRoom() {return this.room;}
	/**
	 * method returning the Check-in date and time is public.
	 * @return this is the check in date.
	 * The check in date will always be before the check out date.
	 */
	public LocalDateTime getCheckInDateTime() {return this.checkInDateTime;}
	/**
	 * getCheckInDateTime() returning the Check-out date and time is public
	 * @return this is the check out date
	 * The check in date will always be before the check out date.
	 */
	public LocalDateTime getCheckOutDateTime() {return this.checkOutDateTime;}
	/**
	 * method returning the number of weekday is public
	 * @return this is the number of weekday
	 * weekdays are days falling between monday to friday
	 */
	public long getNumOfWeekday() {return this.numOfWeekday;}
	/**
	 * method returning the number of weekend is public
	 * @return this is the number of weekend
	 * weekdays are days falling on saturday or sunday
	 */
	public long getNumOfWeekend() {return this.numOfWeekend;}
	/**
	 * method returning the arraylist of guests is public
	 * @return this is the arraylist of guests
	 */
	public ArrayList<Guest> getGuestList() {return this.guestList;}
	/**
	 * method returning the number of guests is public
	 * @return this is the number of guests
	 */
	public int getNumOfGuest() {return this.numOfGuest;}
	/**
	 * method returning the first guest in the guestlist arraylist is public
	 * @return this is the first guest in the guest arraylist
	 */
	public Guest getGuest() {return this.guestList.get(0);}	
	
	/**
	 * setCheckInDateTime() sets the checkInDateTime attribute of the reservation object that called it
	 */
	public void setCheckInDateTime(LocalDateTime checkInDateTime) {this.checkInDateTime = checkInDateTime;}
	/**
	 * setCheckOutDateTime sets the checkOutDateTime attribute of the reservation object that called it
	 */
	public void setCheckOutDateTime(LocalDateTime checkOutDateTime) {this.checkOutDateTime = checkOutDateTime;}
	/**
	 * setNumOfWeekday() sets the numOfWeekday attribute of the reservation object that called it
	 */
	public void setNumOfWeekday(long numOfWeekday) {this.numOfWeekday = numOfWeekday;}
	/**
	 * setNumOfWeekend() sets the numOfWeekend attribute of the reservation object that called it
	 */
	public void setNumOfWeekend(long numOfWeekend) {this.numOfWeekend = numOfWeekend;}
	
	/**
	 * addGuest() method allows the Guest object to be added to the entry
	 */
	public void addGuest() {
		ReservationGuestListManipulator rglm = new ReservationGuestListManipulator(this);
		rglm.addEntry();
	}
	
	/**
	 * info() displays the reservation
	 */
	public void info() {
		DisplayReservation.info(this);
	}
	
	/**
	 * calcGrandTotal() calculates and returns the finalized bill for the reservation object that called it. 
	 */
	public double calcGrandTotal() {
		return GrandTotalTabulator.grandTotal(this);
	}
}
