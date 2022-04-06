package reservation;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTime {
	public static LocalDateTime getLocalDateTime(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter %s Dates:\n",text);
		System.out.printf("Enter %s Hour in 24 hours format:\n",text);
		int checkInHour = sc.nextInt(); sc.nextLine();
		while (checkInHour<0 || checkInHour>=24) {
			System.out.println("Enter a valid Hour!");
			checkInHour = sc.nextInt(); sc.nextLine();
		}
		System.out.printf("Enter %s Minute in 24 hours format:\n",text);
		int checkInMinute = sc.nextInt(); sc.nextLine();
		while (checkInMinute<0 || checkInMinute>=60) {
			System.out.println("Enter a valid Minute!");
			checkInHour = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Year:");
		int checkInYear = sc.nextInt(); sc.nextLine();
		while (checkInYear<2022) {
			System.out.println("Enter a valid year!");
			checkInYear = sc.nextInt(); sc.nextLine();
		}	
		System.out.println("Enter Month in Number format (E.g. 1 for Jan, 2 for Feb) :");
		int checkInMonth = sc.nextInt(); sc.nextLine();
		while (checkInMonth<=0 || checkInMonth>12) {
			System.out.println("Enter a valid month!");
			checkInMonth = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Day:");
		int checkInDay;
		LocalDateTime datetime;
		while (true) {
			try {
				checkInDay = sc.nextInt(); sc.nextLine();
				datetime = LocalDateTime.of(checkInYear, checkInMonth, checkInDay, checkInHour, checkInMinute);
				break;
			}
			catch (Exception e) {System.out.println("Enter a valid day:");continue;}
		}
		return datetime;
	}
}
