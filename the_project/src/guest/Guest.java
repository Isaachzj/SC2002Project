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
	public String getname() {return this.name;}
	protected String getnationality() {return this.nationality;}
	protected TypeOfGender getGender() {return this.gender;}
	protected Identity getIdentity() {return this.identity;}
	protected CreditCardInfo getcreditCardDetails() {return this.creditCardDetails;}
	protected ContactDetails getcontacts() {return this.contacts;}
	
	public Reservation getReservation() {return this.reservationDetails;}
	
	//set methods
	protected void setname(String Name) {this.name = Name;}
	protected void setnationality(String Nationality) {this.nationality = Nationality;}
}
