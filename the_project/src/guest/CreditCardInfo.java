package guest;

public class CreditCardInfo {
	private String creditCardNum;
	private String creditCardBank;
	private String creditCardExpiry;
	private String billingAddress;
	private String billingName;
	
	//Constructor
	public CreditCardInfo(String CCN, String CCB, String CCE, String BA, String BN) {
		this.creditCardNum = CCN;
		this.creditCardBank = CCB;
		this.creditCardExpiry = CCE;
		this.billingAddress = BA;
		this.billingName = BN;
	}
	
	//get methods
	protected String getCreditCardNum(){return this.creditCardNum;}
	protected String getCreditCardBank(){return this.creditCardBank;}
	protected String creditCardExpiry(){return this.creditCardExpiry;}
	protected String billingAddress(){return this.billingAddress;}
	protected String billingName(){return this.billingName;}
	
	//set methods
	protected void setCreditCardNum(String CCN) {this.creditCardNum = CCN;}
	protected void setCreditCardBank(String CCB) {this.creditCardBank = CCB;}
	protected void setCreditCardExpiry(String CCE) {this.creditCardExpiry = CCE;}
	protected void setBillingAddress(String BA) {this.billingAddress = BA;}
	protected void setBillingName(String BN) {this.billingAddress = BN;}
}
