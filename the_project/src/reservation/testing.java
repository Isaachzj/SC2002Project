package reservation;
import java.time.Duration;
import java.time.LocalDateTime;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime from = LocalDateTime.of(2021, 10, 4,
                10, 20, 55);
        LocalDateTime to = LocalDateTime.of(2020, 10, 10,
                10, 21, 1);

        Duration duration = Duration.between(from, to);

        // days between from and to
        System.out.println(duration.toDays() + " days");

        // hours between from and to
        System.out.println(duration.toHours() + " hours");

        // minutes between from and to
        System.out.println(duration.toMinutes() + " minutes");

        // seconds between from and to
        System.out.println(duration.toSeconds() + " seconds");
        System.out.println(duration.getSeconds() + " seconds");
	}

}
