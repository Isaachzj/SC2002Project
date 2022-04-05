package guest;
import java.util.Scanner;

public class CreditCardInfoManipulator {
	//CreditCardInfo CCinfo = new CreditCardInfo(CCNum, CCBank, ExpiryDate, BillName, BillAddress);
	public static void updateinfo(Guest guest) {
		// Updating CreditCardInfo Object
			Scanner sc = new Scanner(System.in);
			System.out.println("--------- Enter Credit Card details --------");
			System.out.print("Enter your new creditcard Number: ");
			String CCNum = sc.nextLine();
			System.out.print("Enter your new creditcard Bank: ");
			String CCBank = sc.nextLine();
			System.out.print("Enter your new creditcard Expiry Date: ");
			String ExpiryDate = sc.nextLine();
			System.out.print("Enter your new Billing Name: ");
			String BillName = sc.nextLine();
			System.out.print("Enter your new Billing Address: ");
			String BillAddress = sc.nextLine();
			guest.getcreditCardDetails().setcreditCardNum(CCNum);
			guest.getcreditCardDetails().setcreditCardBank(CCBank);
			guest.getcreditCardDetails().setcreditCardExpiry(ExpiryDate);
			guest.getcreditCardDetails().setbillingName(BillName);
			guest.getcreditCardDetails().setbillingAddress(BillAddress);
	}
}
