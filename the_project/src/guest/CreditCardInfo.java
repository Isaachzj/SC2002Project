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
	protected String getcreditCardNum(){return this.creditCardNum;}
	protected String getcreditCardBank(){return this.creditCardBank;}
	protected String creditCardExpiry(){return this.creditCardExpiry;}
	protected String billingAddress(){return this.billingAddress;}
	protected String billingName(){return this.billingName;}
	
	//set methods
	protected void setcreditCardNum(String CCN) {this.creditCardNum = CCN;}
	protected void setcreditCardBank(String CCB) {this.creditCardBank = CCB;}
	protected void setcreditCardExpiry(String CCE) {this.creditCardExpiry = CCE;}
	protected void setbillingAddress(String BA) {this.billingAddress = BA;}
	protected void setbillingName(String BN) {this.billingAddress = BN;}
}
