package reservation;
import java.time.Duration;
import java.time.LocalDateTime;
import room.*;
import list_methods.*;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<10;i++) {
			LocalDateTime dt = LocalDateTime.of(2022,4,1,0, 0);
			LocalDateTime dt2 = LocalDateTime.of(2022,4,i,0, 0);
			System.out.println(LengthOfStay.calcWeekDays(dt.toLocalDate(), dt2.toLocalDate()));
			System.out.println(LengthOfStay.calcWeekEnds(dt.toLocalDate(), dt2.toLocalDate()));
			System.out.println();
		}
	}

}
