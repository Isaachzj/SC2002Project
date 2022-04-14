package guest;
import java.util.Scanner;

public class CreateCreditCardInfo {
	/**
	 * instantiation of guest credit card details; using their user input credit card number, bank, expiry date, name and billing address
	 * once the credit card details of guest has been instantiated, it would be returned
	 * @return this is the credit card details of the guest
	 */
	public static CreditCardInfo createCCI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- Enter Credit Card details --------");
		System.out.print("Enter your creditcard Number: ");
		String CCNum = sc.nextLine();
		System.out.print("Enter your creditcard Bank: ");
		String CCBank = sc.nextLine();
		System.out.print("Enter your creditcard Expiry Date: ");
		String ExpiryDate = sc.nextLine();
		CreditCardInfo CCinfo = new CreditCardInfo(CCNum, CCBank, ExpiryDate);
		System.out.println();
		return CCinfo;
	}
}
