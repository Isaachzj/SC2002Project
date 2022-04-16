package app_room;

import hotel.*;
import java.util.*;
/**
 * This is a Boundary Class; as it is used as a user interface;
 * 
 * Allows the Occuapncy report and the Status report to be displayed
 * Given an option to: print occupancy report (option 1) or print status report (option 2)
 * 
 * printOccupancyReport (option 1) displays a summary of the occupancy details of the rooms - 
 * holds the list of vacant rooms for each Room Type
 * and counts the number of room added to each array element and
 * total number of each type of room available
 * printStatusReport (option 2) displays a summary of the status of rooms -
 * holds the list of rooms of each availability type
 * and counts the number of room added to each array element
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 */
public class Report {
	/**
	 * this method allows the printing of occupancy report (option 1) or the printing of
	 * status report (option 2)
	 */
	public static void info(Hotel hotel) {
		Scanner sc = new Scanner(System.in);
		RoomStatusReport rsr = new RoomStatusReport(hotel);
		System.out.println("========== HOTEL REPORT ==========");
		
		System.out.println("Choose an option (Enter an alphabet to terminate):\n1. Print Occupancy Report\n2. Print Status Report");
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0 || choice>2) {
			System.out.println("Enter a valid choice!");
			choice = sc.nextInt(); sc.nextLine();
		}
		while (true) {
			/**
		     * printOccupancyReport displays a summary
		     * of the occupancy details of the rooms;
		     */
			if (choice==1) {
				rsr.printOccupancyReport();
				return;
			}
			/**
		     * printStatusReport displays a summary
		     * of the status of rooms;
		     */
			else if (choice==2){
				rsr.printStatusReport();
				return;
			}
			
			else {System.out.println("Enter a valid option!"); continue;}
		}
	}//end method
}
