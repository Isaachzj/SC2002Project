package hotel_app;

import java.util.Scanner;

import Room.Room;
import enumeration.TypeOfRoom;
import hotel.Hotel;
import reservation.CreateReservation;
import reservation.Reservation;
import list_methods.*;

public class MakeReservation {
	public static void makeReservation(Hotel hotel) throws ArrayException{
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
		
		//Getting available room
		Room room = hotel.getRoom(roomType);
		if (room==null) {
			System.out.println("All %s rooms are not available. Say sorry to the customer:)");
			return;
		}
		
		//Creating the Reservation object.
		Reservation reservation = CreateReservation.createReservation(room);
		
		//Add Reservation object to Hotel
		hotel.addReservation(reservation);
		
		System.out.println("Reserved Room Successfully!!");
	}
}
