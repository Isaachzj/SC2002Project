package reservation;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTime {
	public static LocalDateTime getLocalDateTime(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter %s Dates:\n",text);
		System.out.printf("Enter %s Hour in 24 hours format:\n",text);
		int hour = sc.nextInt(); sc.nextLine();
		while (hour<0 || hour>=24) {
			System.out.println("Enter a valid Hour!");
			hour = sc.nextInt(); sc.nextLine();
		}
		System.out.printf("Enter %s Minute in 24 hours format:\n",text);
		int minute = sc.nextInt(); sc.nextLine();
		while (minute<0 || minute>=60) {
			System.out.println("Enter a valid Minute!");
			minute= sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Year:");
		int year = sc.nextInt(); sc.nextLine();
		while (year<2022) {
			System.out.println("Enter a valid year!");
			year = sc.nextInt(); sc.nextLine();
		}	
		System.out.println("Enter Month in Number format (E.g. 1 for Jan, 2 for Feb) :");
		int month = sc.nextInt(); sc.nextLine();
		while (month<=0 || month>12) {
			System.out.println("Enter a valid month!");
			month = sc.nextInt(); sc.nextLine();
		}
		System.out.println("Enter Day:");
		int day;
		LocalDateTime datetime;
		while (true) {
			try {
				day = sc.nextInt(); sc.nextLine();
				datetime = LocalDateTime.of(year, month, day, hour, minute);
				break;
			}
			catch (Exception e) {System.out.println("Enter a valid day:");continue;}
		}
		return datetime;
	}
}
