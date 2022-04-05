package checkin_checkout;

import enumeration.AvailStatus;
import java.util.*;

public class CheckIn {
	public static void checkIn() {
		Scanner sc = new Scanner(System.in);
		
		//Ask for room type (Not hardcoded!)
		System.out.println("Choose Room Type (Select Number):");
		for (int i=0; i<AvailStatus.values().length; i++) {
			System.out.printf("%d. %s\n", i+1, AvailStatus.values()[i]);
		}
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0 || choice>AvailStatus.values().length) {
			System.out.println("Enter a valid choice or i'll cut your pay!!");
			choice = sc.nextInt(); sc.nextLine();
		}
		AvailStatus roomType = AvailStatus.values()[choice-1];
		
		//Getting available room
		
	}
}
