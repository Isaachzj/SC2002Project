package guest;
import java.util.Scanner;

public class CreditCardInfoManipulator {
	//CreditCardInfo CCinfo = new CreditCardInfo(CCNum, CCBank, ExpiryDate, BillName, BillAddress);
	/**
	 * Updates the credit card information of the guest; with the input of the guest's credit details (card number, bank, expiry datem billing name and billing address)
	 * If parameter for Guest object is null; the method would be returned.
	 * Else, if Guest object found; its credit card information (CreditCardInfo Object) would be updated accordingly
	 * @param guest this is the guest that needs to update credit card information
	 */
	public static void updateCreditCardInfo(Guest guest) {
		/**
		 * Check if guest==null
		 */
		if (guest==null) {
			System.out.println("Guest does not exist! (GHOSTTTTT)");
			return;
		}
		/**
		 * Updates CreditCardInfo Object
		 */
			Scanner sc = new Scanner(System.in);
			System.out.println("--------- Enter Credit Card details --------");
			System.out.print("Enter your new creditcard Number: ");
			String CCNum = sc.nextLine();
			System.out.print("Enter your new creditcard Bank: ");
			String CCBank = sc.nextLine();
			System.out.print("Enter your new creditcard Expiry Date: ");
			String ExpiryDate = sc.nextLine();
			guest.getCreditCardDetails().setCreditCardNum(CCNum);
			guest.getCreditCardDetails().setCreditCardBank(CCBank);
			guest.getCreditCardDetails().setCreditCardExpiry(ExpiryDate);
			System.out.println("Credit Card Info updated successfully!");
			return;
	}
}
