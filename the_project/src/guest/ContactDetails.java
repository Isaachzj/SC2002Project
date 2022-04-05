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
	protected String getmobileNumber() {return this.mobileNumber;}
	protected String getemailAddress() {return this.emailAddress;}
	protected String gethomeAddress() {return this.homeAddress;}
	protected String getcountry() {return this.country;}
	
	//set methods
	protected void setmobileNumber(String MN) {this.mobileNumber = MN;}
	protected void setemailAddress(String EA) {this.emailAddress = EA;}
	protected void sethomeAddress(String HA) {this.homeAddress = HA;}
	protected void setcountry(String country) {this.country = country;}
}
