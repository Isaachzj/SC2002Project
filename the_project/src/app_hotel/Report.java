package app_hotel;

import hotel.*;
import java.util.*;

public class Report {
	
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
			if (choice==1) {
				rsr.printOccupancyReport();
				return;
			}
			else if (choice==2){
				rsr.printStatusReport();
				return;
			}
			
			else {System.out.println("Enter a valid option!"); continue;}
		}
	}//end method
}
