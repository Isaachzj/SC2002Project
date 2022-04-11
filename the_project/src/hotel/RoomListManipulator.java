package hotel;

import enumeration.*;
import room.*;
import list_methods.*;
import java.util.*;

public class RoomListManipulator implements Get{
	private Hotel hotel;
	
	public RoomListManipulator(Hotel hotel) {
		this.hotel = hotel;
	}
	
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
