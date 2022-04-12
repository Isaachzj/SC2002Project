package guest;
import java.util.Scanner;

public class CreateContactDetails {
	/**
	 * instantiation of guest contact details; using their user input mobile number, email address, home address and country of origin
	 * once the contact details of guest has been instantiated, it would be returned
	 * @return this is the contact details of the guest instantiated
	 */
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
