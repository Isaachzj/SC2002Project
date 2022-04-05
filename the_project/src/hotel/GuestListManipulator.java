package hotel;

import guest.*;
import list_methods.*;

public class GuestListManipulator implements AddGivenObject, RemoveGivenObject{
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
	
	//Checkout function will pass all guest object stored in reservation to this to remove
	public void removeList(Object daGuest) throws ArrayException{
		Guest guest;
		
		if (daGuest==null) {throw new ArrayException("Error!!");}
		else if (!(daGuest instanceof Guest)) { throw new ArrayException("Error!!");}
		else {guest = (Guest) daGuest;} 
		
		hotel.getGuestList().remove(guest);
	}
	
}
