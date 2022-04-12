package guest;

public class CreditCardInfo {
	/**
	 * this is the guest's credit card number (private attribute)
	 */
	private String creditCardNum;
	/**
	 * this is the guest's credit card bank (private attribute)
	 */
	private String creditCardBank;
	/**
	 * this is the guest's credit card expiry (private attribute)
	 */
	private String creditCardExpiry;
	/**
	 * this is the guest's billing address (private attribute)
	 */
	private String billingAddress;
	/**
	 * this is the guest's billing name (private attribute)
	 */
	private String billingName;
	
	//Constructor
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of credit card information using the credit card number, bank, card expiry, billing address and billing name
	 * @param CCN this is the guest's credit card number
	 * @param CCB this is the guest's credit card bank
	 * @param CCE this is the guest's credit card expiry
	 * @param BA this is the guest's billing address
	 * @param BN this is the guest's billing name
	 */
	public CreditCardInfo(String CCN, String CCB, String CCE, String BA, String BN) {
		this.creditCardNum = CCN;
		this.creditCardBank = CCB;
		this.creditCardExpiry = CCE;
		this.billingAddress = BA;
		this.billingName = BN;
	}
	
	//get methods
	/**
	 * # get methods
	 * Methods returning guest's credit card number, bank, expiry, address and billing name is protected
	 * this ensures better encapsulation of information while ensuring that the methods can be accessed by the same package and subclasses
	 */
	/**
	 * All methods here are set to protected for better encapsulation.
	 * Credit Card Info is only being retrieved and printed in the DisplayGuestInfo class within the same class.
	 * 
	 * gets the guest's credit card number
	 * @return this is the guest's credit card number
	 */
	protected String getCreditCardNum(){return this.creditCardNum;}
	/**
	 * gets the guest's credit card bank
	 * @return this is the guest's credit card bank
	 */
	protected String getCreditCardBank(){return this.creditCardBank;}
	/**
	 * gets the guest's credit card expiry
	 * @return this is the guest's credit card expiry
	 */
	protected String getCreditCardExpiry(){return this.creditCardExpiry;}
	/**
	 * gets the guest's credit card billing address
	 * @return this is the guest's credit card billing address
	 */
	protected String getBillingAddress(){return this.billingAddress;}
	/**
	 * gets the guest's credit card billing name
	 * @return this is the guest's credit card billing name
	 */
	protected String getBillingName(){return this.billingName;}
	
	//set methods
	/**
	 * # set methods
	 */
	/**
	 * sets the credit card number of the guest
	 * @param CCN this is the guest credit card number
	 */
	protected void setCreditCardNum(String CCN) {this.creditCardNum = CCN;}
	/**
	 * sets the credit card bank of the guest
	 * @param CCN this is the guest credit card bank
	 */
	protected void setCreditCardBank(String CCB) {this.creditCardBank = CCB;}
	/**
	 * sets the credit card expiry of the guest
	 * @param CCN this is the guest credit card expiry
	 */
	protected void setCreditCardExpiry(String CCE) {this.creditCardExpiry = CCE;}
	/**
	 * sets the credit card billing address of the guest
	 * @param CCN this is the guest credit card billing address
	 */
	protected void setBillingAddress(String BA) {this.billingAddress = BA;}
	/**
	 * sets the credit card billing name of the guest
	 * @param CCN this is the guest credit card billing name
	 */
	protected void setBillingName(String BN) {this.billingName = BN;}
}
