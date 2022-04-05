package guest;
import java.util.Scanner;

public class CreateCreditCardInfo {
	public static CreditCardInfo createCCI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- Enter Credit Card details --------");
		System.out.print("Enter your creditcard Number: ");
		String CCNum = sc.nextLine();
		System.out.print("Enter your creditcard Bank: ");
		String CCBank = sc.nextLine();
		System.out.print("Enter your creditcard Expiry Date: ");
		String ExpiryDate = sc.nextLine();
		System.out.print("Enter your Billing Name: ");
		String BillName = sc.nextLine();
		System.out.print("Enter your Billing Address: ");
		String BillAddress = sc.nextLine();
		CreditCardInfo CCinfo = new CreditCardInfo(CCNum, CCBank, ExpiryDate, BillName, BillAddress);
		System.out.println();
		return CCinfo;
	}
}
