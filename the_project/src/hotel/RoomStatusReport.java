package hotel;

import enumeration.*;
import room.*;

import java.util.*;

/**
 * printOccupancyReport displays a summary of the occupancy details of the rooms
 * method holds the list of vacant rooms for each Room Type
 * method also counts the number of room added to each array element
 * and total number of each type of room available.
 * 
 * printStatusReport displays a summary of the status of rooms
 * method holds the list of rooms of each availability type
 * method also counts the number of room added to each array element
 * Checking every room individually regardless of their Room Type (#Inheritance).
 * 
 * Besides, this function works regardless of any changes to room types
 * (#Open-Closed Principle - CLosed for Modification)
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public class RoomStatusReport {
/**
 * this is a Hotel object (private attribute)
 */
private Hotel hotel;
	
	public RoomStatusReport(Hotel hotel) {
		this.hotel = hotel;
	}
	/**
	 * printOccupancyReport displays a summary of the occupancy details of the rooms
	 * method holds the list of vacant rooms for each Room Type
	 * method also counts the number of room added to each array element
	 * and total number of each type of room available
	 */
	public void printOccupancyReport() {
		int enum_index=0;
		int rF=0, rN=0; //Room Number (rn) = <Floor Number (rF)><Second Number (rN)>
		String rn; 
		String array[] = new String[TypeOfRoom.values().length]; //Holds the list of vacant rooms for each Room Type
		Integer count[] = new Integer[TypeOfRoom.values().length]; //Counts the number of room added to each array element 
		Integer totalCount[] = new Integer[TypeOfRoom.values().length]; //Counts the total number of each type of room there are
		ArrayList<Room> roomList = hotel.getRoomList();
		
		/**
		 * # Initialise array and count and totalCount arrays
		 */
		for (int i=0; i<array.length; i++) {
			array[i] = "\tRoom Number: ";
			count[i] = 0;
			totalCount[i] = 0;
		}
		
		/**
		 * # Checking every room individually regardless of their Room Type (#Inheritance)
		 * # Besides, this function works regardless of any changes to room types
		 * (#Open-Closed Principle - CLosed for Modification)
		 */
		for (int i=0; i<roomList.size(); i++) {
			Room room = roomList.get(i);
			enum_index = room.getRoomType().ordinal(); //Getting the correct roomType in enumeration index form
			
			/**
			 * # Updating totalCount
			 */
			totalCount[enum_index]++;
			
			/**
			 * # Do not add non-vacant rooms to the array 
			 */
			if (room.getAvail() != AvailStatus.VACANT) {continue;}
			
			/**
			 * # getting room number
			 */
			rn = room.getRoomNum();
	
			/**
			 * # Appending room number to correct string in Array
			 */
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
		
		/**
		 * # Printing report
		 */
		for (int i=0; i<TypeOfRoom.values().length; i++) {
			System.out.printf("%s : Number : %d out of %d\n", TypeOfRoom.values()[i], count[i], totalCount[i]);
			System.out.println(array[i]);
			System.out.println();
		}
	}
	
	/**
	 * printStatusReport displays a summary of the status of rooms
	 * method holds the list of rooms of each availability type
	 * method also counts the number of room added to each array element
	 */
	public void printStatusReport() {
		int enum_index=0;
		int rF=0, rN=0; //Room Number (rn) = <Floor Number (rF)><Second Number (rN)>
		String rn; 
		String array[] = new String[AvailStatus.values().length]; //Holds the list of rooms of each availability type
		Integer count[] = new Integer[TypeOfRoom.values().length]; //Counts the number of room added to each array element (for adding newline)
		ArrayList<Room> roomList = hotel.getRoomList();
		
		/**
		 * # Initialise array and count arrays
		 */
		for (int i=0; i<array.length; i++) {
			array[i] = "\tRoom Number: ";
			count[i] = 0;
		}
		
		/**
		 * # Checking every room individually regardless of their Room Type (#Inheritance)
		 * # Besides, this function works regardless of any changes to room types
		 * (#Open-Closed Principle - CLosed for Modification)
		 */
		for (int i=0; i<roomList.size(); i++) {
			Room room = roomList.get(i);
			enum_index = room.getAvail().ordinal();
			
			/**
			 * # getting room number
			 */
			rn = room.getRoomNum();
			
			/**
			 * # Appending room number to correct string in Array
			 */
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
		/**
		 * # Printing report
		 */
		for (int i=0; i<AvailStatus.values().length; i++) {
			System.out.printf("%s : \n", AvailStatus.values()[i]);
			System.out.println(array[i]);
			System.out.println();
		}
	}
}
