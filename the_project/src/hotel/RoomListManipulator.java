package hotel;

import enumeration.*;
import room.*;
import list_methods.*;
import java.util.*;

public class RoomListManipulator implements Get{
	/**
	 * this is a Hotel object (private attribute)
	 */
	private Hotel hotel;
	
	public RoomListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	/**
	 * this methods retrieves the Room object and its details for the room number keyed into the system
	 * room details includes the TypeOfRoom, AvailStatus, maxOccupancy and RoomRate
	 */
	public Room getEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the room number");
		String roomNumber = sc.nextLine();
		
		for (int i=0; i<hotel.getRoomList().size(); i++) {
			Room room = hotel.getRoomList().get(i);
			if (room.getRoomNum().compareTo(roomNumber)==0)
				{return room;}		
		}//end for
		return null;
	}
	
	//OVERLOADED
	/**
	 * this method retrieves the first Room object and its details for the given roomType indicated, that is vacant (i.e. AvailStatus = VACANT)
	 * room details includes the TypeOfRoom, AvailStatus, maxOccupancy and RoomRate
	 * @param roomType this is the roomType (SINGLE, DOUBLE, DELUXE, VIP SUITE) for retrieval of first Room object
	 * @return this is the first Room object for the indicated roomType that is VACANT
	 */
	public Room getEntry(TypeOfRoom roomType) {
		for (int i=0; i<hotel.getRoomList().size(); i++) {
			Room room = hotel.getRoomList().get(i);
			if (room.getRoomType() == roomType && room.getAvail() == AvailStatus.VACANT) {
				return room;
			}//end if
		}//end for
		
		//if no rooms are vacant
		return null;
	}
	
	/**
	 * this method returns an array list containing all Room object for the roomType indicated in the parameter
	 * @param roomType this is the roomType (SINGLE, DOUBLE, DELUXE, VIP SUITE) for retrieval of arraylist of Room object
	 * @return this is an arraylist of Room object 
	 */
	public ArrayList<Room> getSameTypeRooms(TypeOfRoom roomType){
		ArrayList<Room> rooms = new ArrayList<Room>();
		
		for (int i=0; i<hotel.getRoomList().size(); i++) {
			Room room = hotel.getRoomList().get(i);
			if (room.getRoomType() == roomType) {
				rooms.add(room);
			}
		}
		return rooms;
	}
}
