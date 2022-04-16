package room_features;
import list_methods.*;

/**
 * Follows the Single Responsibility Principle as it has the 
 * sole responsibility of displaying features of a room;
 */
public class DisplayFeatures implements Print{
	/**
	 * RoomFeatures object containing details of features in this room;
	 */
	private RoomFeatures rf;
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiates this DisplayFeatures object using argument RoomFeatures object;
	 * @param rf RoomFeatures object;
	 */
	public DisplayFeatures(RoomFeatures rf) {
		this.rf = rf;
	}
	
	/**
	 * Only prints the additional features in this feature list;
	 */
	public void printArray() { //no need to check for empty array here as its checked in printAll()
		int size = rf.getNumFeatures() - 5;
		
		for (int i=1; i<=size; i++) {
			Feature ff = rf.getArray().get(i-1);
			System.out.printf("%-12d%-20s%20s\n", (i+5), ff.getName(), ff.getStatus());
		}
	}
	
	
	/**
	 * Only prints the core features in this feature list;
	 */
	public void printCore() {
		System.out.println("===========================Room Features===========================");
		System.out.println("Index-----------------Feature name-----------------Quantity/Status");
		
		//Standard Features
		System.out.printf("%-12d%-20s%20s\n", 1, "Bed", rf.getBedType()); //enumeration returns as string
		System.out.printf("%-12d%-20s%20s\n", 2, "View", rf.getViewType());
		System.out.printf("%-12d%-20s%20d\n", 3, "Number of Beds", rf.getNumOfBed());
		System.out.printf("%-12d%-20s%20b\n", 4, "Wifi", rf.getWifi());
		System.out.printf("%-12d%-20s%20b\n", 5, "Smoking", rf.getSmokeOut());
	}
	
	/**
	 * Prints all core and additional features of this room;
	 * Exception Propagation here
	 * (calling function handles both ClassException and ArrayException);	
	 */
	public void printAll() {
		if (rf.getNumFeatures()==5) {
			this.printCore();
			return;
		}
		
		else {
			this.printCore();			
			this.printArray();		//handle ArrayException outside	
		}
	}
}
