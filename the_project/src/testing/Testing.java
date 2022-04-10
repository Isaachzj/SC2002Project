package testing;

import java.time.LocalDateTime;
import java.util.*;

public class Testing {
	public static void main(String[] args) {
		LocalDateTime cur = LocalDateTime.now();
		System.out.println(cur);
		Scanner sc = new Scanner(System.in);
		while (true) {
			try{int choice = sc.nextInt(); sc.nextLine();}
			catch(Exception e) {System.out.println("Terminated"); sc.nextLine(); continue;}
		}
		
	}
}
