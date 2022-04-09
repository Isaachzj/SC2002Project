package guest;

public class ContactDetails {
	private String mobileNumber;
	private String emailAddress;
	private String homeAddress;
	private String country;
	
	//Constructor
	public ContactDetails(String MN, String EA, String HA, String country ) {
		this.mobileNumber = MN;
		this.emailAddress = EA;
		this.homeAddress = HA;
		this.country = country;
	}
	
	//get methods
	public String getMobileNumber() {return this.mobileNumber;}
	protected String getEmailAddress() {return this.emailAddress;}
	protected String getHomeAddress() {return this.homeAddress;}
	protected String getCountry() {return this.country;}
	
	//set methods
	protected void setMobileNumber(String MN) {this.mobileNumber = MN;}
	protected void setEmailAddress(String EA) {this.emailAddress = EA;}
	protected void setHomeAddress(String HA) {this.homeAddress = HA;}
	protected void setCountry(String country) {this.country = country;}
}
