package guest;
import enumeration.TypeOfGender;

public class Guest {
	private String name;
	private String nationality;
	private TypeOfGender gender;
	private Identity identity;
	private CreditCardInfo creditCardDetails;
	private ContactDetails contacts;
	
	// Constructor 1
	public Guest(String name, String nationality, TypeOfGender gender, Identity identity, CreditCardInfo creditCardDetails, ContactDetails contacts) {
		this.name = name;
		this.nationality = nationality;		
		this.gender = gender;
		this.identity = identity;
		this.creditCardDetails = creditCardDetails;
		this.contacts = contacts;
	}	
	
	// get methods
	protected String getname() {return this.name;}
	protected String getnationality() {return this.nationality;}
	protected TypeOfGender getGender() {return this.gender;}
	protected Identity getIdentity() {return this.identity;}
	protected CreditCardInfo getcreditCardDetails() {return this.creditCardDetails;}
	protected ContactDetails getcontacts() {return this.contacts;}
	
	//set methods
	protected void setname(String Name) {this.name = Name;}
	protected void setnationality(String Nationality) {this.nationality = Nationality;}
}
