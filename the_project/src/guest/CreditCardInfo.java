package guest;
/**
 * Instantiation of credit card information using the
 * credit card number, bank, card expiry, billing address and billing name. 
 * Method encapsulation is also used here;
 * Methods returning guest's credit card number, bank,
 * expiry, address and billing name is protected
 * this ensures better encapsulation of information while ensuring
 * that the methods can be accessed by the same package and subclasses
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
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
	
	//Constructor
	/**
	 * # Constructor
	 */
	/**
	 * Instantiation of credit card information using the
	 * credit card number, bank, card expiry, billing address and billing name
	 * @param CCN this is the guest's credit card number
	 * @param CCB this is the guest's credit card bank
	 * @param CCE this is the guest's credit card expiry
	 */
	public CreditCardInfo(String CCN, String CCB, String CCE) {
		this.creditCardNum = CCN;
		this.creditCardBank = CCB;
		this.creditCardExpiry = CCE;
	}
	
	//get methods
	/**
	 * # get methods
	 * Methods returning guest's credit card number, bank,
	 * expiry, address and billing name is protected
	 * this ensures better encapsulation of information while ensuring
	 * that the methods can be accessed by the same package and subclasses
	 */
	/**
	 * All methods here are set to protected for better encapsulation.
	 * Credit Card Info is only being retrieved and printed in the
	 * DisplayGuestInfo class within the same class.
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
}
