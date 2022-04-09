package guest;

public class DisplayGuestInfo {
	public static void printInfo(Guest guest) {
		// Check if guest==null
		if (guest==null) {
			System.out.println("Guest does not exist! (GHOSTTTTT)");
			return;
		}
		System.out.println("-------------Guest Details------------");
		System.out.println("Name: "+ guest.getName());
		System.out.println("Nationality: " + guest.getNationality());
		System.out.println("Gender: " + guest.getGender());
		System.out.println("IdentityType: " + guest.getIdentity().getIdType());
		System.out.println("Identity Number: " + guest.getIdentity().getIdNumber());
		System.out.println("Billing Name : " + guest.getCreditCardDetails().billingName());
		System.out.println("Credit Card Number: " + guest.getCreditCardDetails().getCreditCardNum());
		System.out.println("Credit Card Bank: " + guest.getCreditCardDetails().getCreditCardBank());
		System.out.println("Credit Card Expiry: " + guest.getCreditCardDetails().creditCardExpiry());
		System.out.println("Billing Address : " + guest.getCreditCardDetails().billingAddress());
		System.out.println("Mobile Number: " + guest.getContacts().getMobileNumber());
		System.out.println("Country: " + guest.getContacts().getCountry());
		System.out.println("Email Address: " + guest.getContacts().getEmailAddress());
		System.out.println("Home Address: " + guest.getContacts().getHomeAddress());
		System.out.println("-------------------------------------");
		return;
	}
}
