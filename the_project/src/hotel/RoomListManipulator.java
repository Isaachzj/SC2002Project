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
		System.out.println("Enter the room floor:");
		int roomFloor = sc.nextInt(); sc.nextLine();
		System.out.println("Enter the room number");
		int roomNumber = sc.nextInt(); sc.nextLine();
		
		for (int i=0; i<hotel.getRoomList().size(); i++) {
			Room room = hotel.getRoomList().get(i);
			if (room.getRoomFloor()==roomFloor) {
				if (room.getRoomNum()==roomNumber) {
					return room;
				}//continues
			}//continues
		}//end for
		return null;
	}
	
	public Room getVacantRoom(TypeOfRoom roomType) {
		for (int i=0; i<hotel.getRoomList().size(); i++) {
			Room room = hotel.getRoomList().get(i);
			if (room.getRoomType() == roomType && room.getAvail() == AvailStatus.VACANT) {
				return room;
			}//end if
		}//end for
		
		//if no rooms are vacant
		return null;
	}
	
	/*//used in the RoomRelated class to change menu items of a certain type of room (DUNNID ANYMORE!!)
	public ArrayList<Room> getSameTypeRooms(TypeOfRoom roomType){
		ArrayList<Room> rooms = new ArrayList<Room>();
		
		for (int i=0; i<hotel.getRoomList().size(); i++) {
			Room room = hotel.getRoomList().get(i);
			if (room.getRoomType() == roomType) {
				rooms.add(room);
			}
		}
		return rooms;
	}*/
}
