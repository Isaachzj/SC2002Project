package hotel;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		RoomStatusReport rs = new RoomStatusReport(hotel);
		rs.printStatusReport();
		System.out.println("\n\n");
		rs.printOccupancyReport();
	}

}
