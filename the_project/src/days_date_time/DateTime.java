package days_date_time;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 * This is a Boundary Class; as it is used as a user interface;
 * 
 * Interface which allows the user to user input to record
 * date and time of either guest check-in or check-out. 
 * 
 * While loop used to ensure that the input entered is correct
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class DateTime {
	 /**
	  * Accepts user input to record date and time of either guest check-in or check-out;
	  * @param text user inputs either "check-in" or "check-out" 
	  * to indicate type of datetime recorded;
	  * @return one summarised line of check-in/check-out date and time
	  */
	public static LocalDateTime getLocalDateTime(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("=====Enter %s Date Details=====\n",text);
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
			catch (java.time.DateTimeException e) {System.out.println("Enter a valid day:");continue;}
		}
		return datetime;
	}
}
