package hotel;

import guest.*;
import list_methods.*;

public class GuestListManipulator implements AddGivenObject{
	private Hotel hotel;
	
	public GuestListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public void addList(Object daGuest) throws ArrayException{
		Guest guest;
		
		if (daGuest==null) {throw new ArrayException("Error!!");}
		else if (!(daGuest instanceof Guest)) { throw new ArrayException("Error!!");}
		else {guest = (Guest) daGuest;} 
		
		hotel.getGuestList().add(guest);
	}
	
	public void removeList(Object daGuest) {
		
	}
	
}
