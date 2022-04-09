package app_main;
import java.util.Scanner;

import app_hotel.CheckIn;
import app_hotel.CheckOut;
import app_hotel.Report;
import app_hotel.MakeReservation;
import hotel.*;
import list_methods.*;

public class HotelMainApp {
	
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		System.out.println("Welcome to the Hotel App System!");
		System.out.println("1: Make a reservation");
		System.out.println("2: Check in");
		System.out.println("3: Check out");
		System.out.println("4: Room Service");
		System.out.println("5: Room Reports");
		System.out.println("");
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
						// HELPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP (Tmr I do :)
						break;
					}
					case 5: {
						Report.info(hotel);
						break;
					}
					default:
						System.out.println("Enter a valid choice");
						break;
				}
			}
			catch (ArrayException e) {continue;}
			catch (Exception e) {System.out.println("Process terminated"); continue;}
			
		} while (choice!=4);
	}

}

