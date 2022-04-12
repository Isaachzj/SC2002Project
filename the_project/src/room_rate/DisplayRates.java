package room_rate;

public class DisplayRates {
	private RoomRate rr;
	
	public DisplayRates(RoomRate rr) {
		this.rr = rr;
	}
	
	protected void printRates() {
		System.out.println("===========================Room Rates===========================");
		System.out.printf("Weekday: $%.2f/day\n", rr.getWeekday());
		System.out.printf("Weekend: $%.2f/day\n", rr.getWeekend());
	}
}
