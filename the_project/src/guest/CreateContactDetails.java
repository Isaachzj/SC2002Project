package guest;
import java.util.Scanner;

public class CreateContactDetails {
	public static ContactDetails createContactDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- Enter Contact Details --------");
		System.out.print("Enter your Mobile Number: ");
		String MNumber = sc.nextLine();
		System.out.print("Enter your Email Address: ");
		String EAddress = sc.nextLine();
		System.out.print("Enter your Home Address: ");
		String HAddress = sc.nextLine();
		System.out.print("Enter your country: ");
		String Country = sc.nextLine();
		ContactDetails CDetails = new ContactDetails(MNumber, EAddress, HAddress, Country);
		System.out.println();
		return CDetails;
	}
}
