package room_rate;

public class RoomRate {
	private double weekday;
	private double weekend;
	
	public RoomRate(double weekday, double weekend) {
		this.weekday = weekday;
		this.weekend = weekend;
	}
	
	//get methods
	protected double getWeekday() {return weekday;}
	protected double getWeekend() {return weekend;}
	
	/*set methods (NOT USED)
	protected void setWeekday(double num) {this.weekday = num;}
	protected void setWeekend(double num) {this.weekend = num;}
	*/
	
	
	//prints Room Rate info
	public void info() {
		DisplayRates dr = new DisplayRates(this);
		dr.printRates();
	}
}
