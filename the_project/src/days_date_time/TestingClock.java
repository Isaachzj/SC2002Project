package days_date_time;

import java.time.*;
import java.util.Scanner;

public class TestingClock {
	public static void main (String[] args ) {

		
		
		System.out.println(ZoneId.getAvailableZoneIds());
		Clock hi = Clock.system(ZoneId.of("Asia/Singapore"));
		System.out.println(hi.instant());
		System.out.println(LocalDateTime.now().toInstant(ZoneOffset.UTC));
		
		Clock constantClock = Clock.fixed(LocalDateTime.now().toInstant(ZoneOffset.UTC), ZoneId.of("Singapore"));
		
		Duration interval = Duration.between(constantClock.instant(), DateTime.getLocalDateTime("CheckOut").toInstant(ZoneOffset.UTC));		
		
		Clock artiClock = Clock.offset(constantClock, interval);
		
		System.out.println(constantClock.instant());
		
		System.out.println(artiClock.instant());
		System.out.println(artiClock.instant());
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println(artiClock.instant());
		System.out.println(artiClock.instant());
		
		//System.out.println(LocalDateTime.now().atZone(ZoneId.of("Singapore")).toInstant());

	}
}
//LocalDateTime.now().toInstant(OffsetDateTime.now().getOffset()),,, DateTime.getLocalDateTime("hi")Etc/GMT+8"
//	Clock constantClock = Clock.fixed(LocalDateTime.now().atZone(ZoneId.of("Singapore")).toInstant(), 	ZoneId.of("Singapore"));