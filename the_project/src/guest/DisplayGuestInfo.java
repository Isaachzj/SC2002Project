package guest;

public class DisplayGuestInfo {
	public static void printInfo(Guest guest) {
		System.out.println("-------------Guest Details------------");
		System.out.println("Name: "+ guest.getname());
		System.out.println("Nationality: " + guest.getnationality());
		System.out.println("Gender: " + guest.getGender());
		System.out.println("IdentityType: " + guest.getIdentity().getidentityType());
		System.out.println("Identity: " + guest.getIdentity().getidentity());
		System.out.println("Billing Name : " + guest.getcreditCardDetails().billingName());
		System.out.println("Credit Card Number: " + guest.getcreditCardDetails().getcreditCardNum());
		System.out.println("Credit Card Bank: " + guest.getcreditCardDetails().getcreditCardBank());
		System.out.println("Credit Card Expiry: " + guest.getcreditCardDetails().creditCardExpiry());
		System.out.println("Billing Address : " + guest.getcreditCardDetails().billingAddress());
		System.out.println("Mobile Number: " + guest.getcontacts().getmobileNumber());
		System.out.println("Country: " + guest.getcontacts().getcountry());
		System.out.println("Email Address: " + guest.getcontacts().getemailAddress());
		System.out.println("Home Address: " + guest.getcontacts().gethomeAddress());
	}
}
