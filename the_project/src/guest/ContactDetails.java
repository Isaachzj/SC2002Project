package guest;

public class ContactDetails {
	/**
	 * #
	 * this is the guest's mobile number
	 * private method is used to ensure that it is only accessible inside ContactDetails class
	 * this ensures encapsulation of sensitive information; in this case the guest's mobile number
	 */
	private String mobileNumber;
	/**
	 * this is the guest's email address
	 * private method is used to ensure that it is only accessible inside ContactDetails class
	 * this ensures encapsulation of sensitive information; in this case the guest's email address
	 */
	private String emailAddress;
	/**
	 * this is the guest's home address
	 * private method is used to ensure that it is only accessible inside ContactDetails class
	 * this ensures encapsulation of sensitive information; in this case the guest's home address
	 */
	private String homeAddress;
	/**
	 * this is the guest's country of origin
	 * private method is used to ensure that it is only accessible inside ContactDetails class
	 * this ensures encapsulation of sensitive information; in this case the guest's country of origin
	 */
	private String country;
	
	//Constructor
	/**
	 * # Constructor
	 */
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
	 * # get methods
	 */
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
	
}
