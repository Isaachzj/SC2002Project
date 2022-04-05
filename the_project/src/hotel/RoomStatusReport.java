package hotel;

import enumeration.*;
import Room.*;
import java.util.*;

public class RoomStatusReport {
private Hotel hotel;
	
	public RoomStatusReport(Hotel htl) {
		this.hotel = htl;
	}
	
	public void printStatusReport() {
		int enum_index=0;
		int rF=0, rN=0; //Room Number (rn) = <Floor Number (rF)><Second Number (rN)>
		String rn; 
		String array[] = new String[TypeOfRoom.values().length]; //Holds the list of vacant rooms for each Room Type
		Integer count[] = new Integer[TypeOfRoom.values().length]; //Counts the number of room added to each array element (for adding newline)
		ArrayList<Room> roomList = hotel.getRoomList();
		
		//Initialise array and count
		for (int i=0; i<array.length; i++) {
			array[i] = "\tRoom Number: ";
			count[i] = 0;
		}
		
		//Checking every room individually regardless of their Room Type (#Inheritance)
		for (int i=0; i<roomList.size(); i++) {
			Room room = roomList.get(i);
			enum_index = room.getRoomType().ordinal();
			
			rF = room.getRoomFloor();
			rN = room.getRoomNum();
			
			//Getting the correct form for room number
			if (rN<10)
				rn = '0'+String.valueOf(rF)+'0'+String.valueOf(rN);
			else
				rn = '0'+String.valueOf(rF)+String.valueOf(rN);
			
			//Appending room number to correct string in Array
			if (array[enum_index].compareTo("\tRoom Number: ")==0) { //if you are adding the first room number
				array[enum_index] = array[enum_index] + rn; //string concatenation
				count[enum_index]++;
			}
			else if (count[enum_index]%6==0) { //add newline every 6 rooms 
				array[enum_index] = array[enum_index] + ",\n\t             " + rn;
				count[enum_index]++;
			}
			else {
				array[enum_index] = array[enum_index] + ", " + rn;
				count[enum_index]++;
			}
		}
		
		//Printing report
		for (int i=0; i<TypeOfRoom.values().length; i++) {
			System.out.printf("%s : \n", TypeOfRoom.values()[i]);
			System.out.println(array[i]);
			System.out.println();
		}
	}
	
	public void printOccupancyReport() {
		int enum_index=0;
		int rF=0, rN=0; //Room Number (rn) = <Floor Number (rF)><Second Number (rN)>
		String rn; 
		String array[] = new String[AvailStatus.values().length]; //Holds the list of rooms of each availability type
		Integer count[] = new Integer[TypeOfRoom.values().length]; //Counts the number of room added to each array element (for adding newline)
		ArrayList<Room> roomList = hotel.getRoomList();
		
		//Initialise Array
		for (int i=0; i<array.length; i++) {
			array[i] = "\tRoom Number: ";
			count[i] = 0;
		}
		
		//Checking every room individually regardless of their Room Type (#Inheritance)
		for (int i=0; i<roomList.size(); i++) {
			Room room = roomList.get(i);
			enum_index = room.getAvail().ordinal();
			
			rF = room.getRoomFloor();
			rN = room.getRoomNum();
			
			//Getting the correct form for room number
			if (rN<10)
				rn = '0'+String.valueOf(rF)+'0'+String.valueOf(rN);
			else
				rn = '0'+String.valueOf(rF)+String.valueOf(rN);
			
			//Appending room number to correct string in Array
			if (array[enum_index].compareTo("\tRoom Number: ")==0) { //if you are adding the first room number
				array[enum_index] = array[enum_index] + rn;
				count[enum_index]++;
			}
			else if (count[enum_index]%6==0) { //add newline every 6 rooms 
				array[enum_index] = array[enum_index] + ",\n\t             " + rn;
				count[enum_index]++;
			}
			else {
				array[enum_index] = array[enum_index] + ", " + rn;
				count[enum_index]++;
			}
		}
		//Printing report
		for (int i=0; i<AvailStatus.values().length; i++) {
			System.out.printf("%s : \n", AvailStatus.values()[i]);
			System.out.println(array[i]);
			System.out.println();
		}
	}
}
