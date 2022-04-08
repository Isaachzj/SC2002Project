package hotel_app;
import java.util.Scanner;
import hotel.*;
import list_methods.*;

public class HotelMainApp {//randomcomment
	
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		System.out.println("Welcome to the Hotel App System!");
		System.out.println("1: Make a reservation");
		System.out.println("2: Check in");
		System.out.println("3: Check out");
		System.out.println("4: Room Service");
		int choice = 0;
		do {
			try {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				switch (choice) {
					case 1: {
						MakeReservation.makeReservation(hotel);
						break;
					}
					case 2: {
						CheckIn.checkIn(hotel);
						break;
					}
					case 3: {
						CheckOut.checkOut(hotel);
						break;
					}
					case 4: {
						// HELPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
						break;
					}
					default:
						System.out.println("Enter a valid choice");
						break;
				}
			}
			catch (ArrayException e) {continue;}
			
		} while (choice!=4);
	}
	//lol
	//Hi Tomoki
}

//some random comment