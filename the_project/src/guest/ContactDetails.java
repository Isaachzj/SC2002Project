package guest;

public class ContactDetails {
	/**
	 * this is the guest's mobile number
	 */
	private String mobileNumber;
	/**
	 * this is the guest's email address
	 */
	private String emailAddress;
	/**
	 * this is the guest's home address
	 */
	private String homeAddress;
	/**
	 * this is the guest's country of origin
	 */
	private String country;
	
	//Constructor
	/**
	 * stores the contact details of the guest from the parameter; their mobile number, email address, home address and country of origin
	 * @param MN this is the guest's mobile number
	 * @param EA this is the guest's email address
	 * @param HA this is the guest's home address
	 * @param country this is the guest's country of origin
	 */
	public ContactDetails(String MN, String EA, String HA, String country ) {
		this.mobileNumber = MN;
		this.emailAddress = EA;
		this.homeAddress = HA;
		this.country = country;
	}
	
	//get methods
	/**
	 * gets the guest's mobile number
	 * @return this is the guest's mobile number
	 */
	public String getMobileNumber() {return this.mobileNumber;}
	/**
	 * Gets the guest's email address
	 * @return  this is the guest's email address
	*/
	protected String getEmailAddress() {return this.emailAddress;}
	/**
	 * Gets the guest's home address
	 * @return  this is the guest's home address
	*/
	protected String getHomeAddress() {return this.homeAddress;}
	/**
	 * Gets the guest's country of origin
	 * @return  this is the guest's country of origin
	*/
	protected String getCountry() {return this.country;}
	
	//set methods
	/**
	 * sets the mobile number of the guest
	 * @param MN this sets the guest's mobile number
	 */
	protected void setMobileNumber(String MN) {this.mobileNumber = MN;}
	/**
	 * sets email address of guest 
	 * @param   EA this sets the guest's email address
	*/
	protected void setEmailAddress(String EA) {this.emailAddress = EA;}
	/**
	 * sets home address of guest 
	 * @param   HA this sets the guest's home address
	*/
	protected void setHomeAddress(String HA) {this.homeAddress = HA;}
	/**
	 * sets country of origin of guest 
	 * @param   country this sets the guest's country of origin
	*/
	protected void setCountry(String country) {this.country = country;}
}
