package guest;

import enumeration.TypeOfGender;
import reservation.*;

public class Guest {
	/**
	 * this is the guest name (private attribute)
	 */
	private String name;
	/**
	 * this is the guest nationality (private attribute)
	 */
	private String nationality;
	/**
	 * this is the guest gender (private attribute)
	 */
	private TypeOfGender gender;
	/**
	 * this is the guest identity (private attribute)
	 */
	private Identity identity;
	/**
	 * this is the guest credit card details (private attribute)
	 */
	private CreditCardInfo creditCardDetails;
	/**
	 * this is the guest contact details (private attribute)
	 */
	private ContactDetails contacts;
	/**
	 * this is the guest reservation details (private attribute)
	 */
	private Reservation reservationDetails;
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of guest details using guest name, nationality, gender, identity, credit card details, contact details and reservation details
	 * @param name this is the name of the guest
	 * @param nationality this is the nationality of the guest
	 * @param gender this is the gender of the guest
	 * @param identity this is the identity of the guest
	 * @param creditCardDetails this is the credit card details of the guest
	 * @param contacts this is the contact details of the guest
	 * @param reservationDetails this is the reservation details of the guest
	 */
	public Guest(String name, String nationality, TypeOfGender gender, Identity identity, CreditCardInfo creditCardDetails, ContactDetails contacts, Reservation reservationDetails) {
		this.name = name;
		this.nationality = nationality;		
		this.gender = gender;
		this.identity = identity;
		this.creditCardDetails = creditCardDetails;
		this.contacts = contacts;
		this.reservationDetails = reservationDetails;
	}	
	
	/**
	 * get methods
	 * We made it such that only methods returning guest's name, contact details and reservation details are public. 
	 * Methods returning guest's mobile number, email address, home address and country of origin are protected
	 * this ensures better encapsulation of information while ensuring that the methods can be accessed by the same package and subclasses
	 */
	/**
	 * We made it such that only methods returning guest's name, contact details and reservation details are public. 
	 * This ensures better encapsulation of information that are more private.
	 * 
	 * Gets the guest's name
	 * @return this is the name of the guest
	 */
	public String getName() {return this.name;}
	/**
	 * Gets the guest's contact details
	 * @return this is the contact details of the guest
	 */
	public ContactDetails getContacts() {return this.contacts;}	
	/**
	 * Gets the guest's reservation details
	 * @return this is the reservation details of the guest
	 */
	public Reservation getReservation() {return this.reservationDetails;}	
	/**
	 * Gets the guest's nationality
	 * @return this is the nationality of the guest
	 */
	protected String getNationality() {return this.nationality;}
	/**
	 * Gets the guest's gender
	 * @return this is the gender of the guest
	 */
	protected TypeOfGender getGender() {return this.gender;}
	/**
	 * Gets the guest's identity details
	 * @return this is the identity details of the guest
	 */
	protected Identity getIdentity() {return this.identity;}
	/**
	 * Gets the guest's credit card details
	 * @return this is the credit card details of the guest
	 */
	protected CreditCardInfo getCreditCardDetails() {return this.creditCardDetails;}

}
