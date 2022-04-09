package guest;

import enumeration.TypeOfGender;
import reservation.*;

public class Guest {
	private String name;
	private String nationality;
	private TypeOfGender gender;
	private Identity identity;
	private CreditCardInfo creditCardDetails;
	private ContactDetails contacts;
	private Reservation reservationDetails;
	
	// Constructor 1
	public Guest(String name, String nationality, TypeOfGender gender, Identity identity, CreditCardInfo creditCardDetails, ContactDetails contacts, Reservation reservationDetails) {
		this.name = name;
		this.nationality = nationality;		
		this.gender = gender;
		this.identity = identity;
		this.creditCardDetails = creditCardDetails;
		this.contacts = contacts;
		this.reservationDetails = reservationDetails;
	}	
	
	// get methods
	public String getName() {return this.name;}
	public ContactDetails getContacts() {return this.contacts;}	
	protected String getNationality() {return this.nationality;}
	protected TypeOfGender getGender() {return this.gender;}
	protected Identity getIdentity() {return this.identity;}
	protected CreditCardInfo getCreditCardDetails() {return this.creditCardDetails;}

	
	public Reservation getReservation() {return this.reservationDetails;}
	
	//set methods
	protected void setName(String Name) {this.name = Name;}
	protected void setNationality(String Nationality) {this.nationality = Nationality;}
}
