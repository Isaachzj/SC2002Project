package reservation;
import java.time.Duration;
import java.time.LocalDateTime;
import room.*;
import list_methods.*;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTime.getLocalDateTime("YOOOOO");
		Room room = new SingleRoom(1,1);
		try {
			CreateReservation.createReservation(room);
		}
		catch (ArrayException e) {;}
	}

}
