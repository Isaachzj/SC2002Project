package room_rate;

public class RoomRate {
	private double weekday;
	private double weekend;
	private double discount;
	
	public RoomRate(double weekday, double weekend, double discount) {
		this.weekday = weekday;
		this.weekend = weekend;
		this.discount = discount;
	}
	
	//get methods
	protected double getWeekday() {return weekday;}
	protected double getWeekend() {return weekend;}
	protected double getDiscount() {return discount;}
	
	/*set methods (NOT USED)
	protected void setWeekday(double num) {this.weekday = num;}
	protected void setWeekend(double num) {this.weekend = num;}
	*/
	public void setDiscount(double num) {this.discount = num;}  //Do we want to change discount @YanKai?
	
	
	//prints Room Rate info
	public void info() {
		DisplayRates dr = new DisplayRates(this);
		dr.printRates();
	}
}
