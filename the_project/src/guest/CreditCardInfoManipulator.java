package guest;
import java.util.Scanner;

public class CreditCardInfoManipulator {
	//CreditCardInfo CCinfo = new CreditCardInfo(CCNum, CCBank, ExpiryDate, BillName, BillAddress);
	/**
	 * Updates the credit card information of the guest; with the input of the credit card number, bank, expiry datem billing name and billing address
	 * If parameter for Guest object is null; to return. Else, if Guest object found will update accordingly
	 * @param guest this is the guest that needs to update credit card information
	 */
	public static void updateCreditCardInfo(Guest guest) {
		// Check if guest==null
		if (guest==null) {
			System.out.println("Guest does not exist! (GHOSTTTTT)");
			return;
		}
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
			guest.getCreditCardDetails().setCreditCardNum(CCNum);
			guest.getCreditCardDetails().setCreditCardBank(CCBank);
			guest.getCreditCardDetails().setCreditCardExpiry(ExpiryDate);
			guest.getCreditCardDetails().setBillingName(BillName);
			guest.getCreditCardDetails().setBillingAddress(BillAddress);
			System.out.println("Credit Card Info updated successfully!");
			return;
	}
}
