package checkin_checkout;

import enumeration.TypeOfRoom;

import java.util.*;

public class CheckOut {
	
	public static void checkOut() {
Scanner sc = new Scanner(System.in);
		
		//Ask for room type (Not hardcoded!)
		System.out.println("Choose Room Type (Select Number):");
		for (int i=0; i<TypeOfRoom.values().length; i++) {
			System.out.printf("%d. %s\n", i+1, TypeOfRoom.values()[i]);
		}
		int choice = sc.nextInt(); sc.nextLine();
		while (choice<=0 || choice>TypeOfRoom.values().length) {
			System.out.println("Enter a valid choice or i'll cut your pay!!");
			choice = sc.nextInt(); sc.nextLine();
		}
		TypeOfRoom roomType = TypeOfRoom.values()[choice-1];
		
		
	}
}
