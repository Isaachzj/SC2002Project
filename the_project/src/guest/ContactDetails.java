package guest;

public class ContactDetails {
	/**
	 * #
	 * this is the guest's mobile number (private attribute)
	 */
	private String mobileNumber;
	/**
	 * this is the guest's email address (private attribute)
	 */
	private String emailAddress;
	/**
	 * this is the guest's home address (private attribute)
	 */
	private String homeAddress;
	/**
	 * this is the guest's country of origin (private attribute)
	 */
	private String country;
	
	//Constructor
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of contact details object from the parameter; their mobile number, email address, 
	 * home address and country of origin
	 * @param MN this is the guest's mobile number
	 * @param EA this is the guest's email address
	 * @param HA this is the guest's home address
	 * @param country this is the guest's country of origin
	 */
	public ContactDetails(String MN, String EA, String HA, String country) {
		this.mobileNumber = MN;
		this.emailAddress = EA;
		this.homeAddress = HA;
		this.country = country;
	}
	
	//get methods
	/**
	 * # get methods
	 * We made it such that only methods returning guest's mobile number is public. 
	 * Methods returning guest's email address, home address and country of origin are protected
	 * this ensures better encapsulation of information while ensuring that the methods can be accessed by the
	 * same package and subclasses
	 */
	/**
	 * gets the guest's mobile number
	 * @return this is the guest's mobile number
	 */
	public String getMobileNumber() {return this.mobileNumber;}
	/**
	 * gets the guest's email address
	 * @return  this is the guest's email address
	*/
	protected String getEmailAddress() {return this.emailAddress;}
	/**
	 * gets the guest's home address
	 * @return  this is the guest's home address
	*/
	protected String getHomeAddress() {return this.homeAddress;}
	/**
	 * gets the guest's country of origin
	 * @return  this is the guest's country of origin
	*/
	protected String getCountry() {return this.country;}
	
}
