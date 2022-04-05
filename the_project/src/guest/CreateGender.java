package guest;
import enumeration.TypeOfGender;
import java.util.Scanner;

public class CreateGender {
	public static TypeOfGender createGender() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- Enter your Gender --------");
		System.out.println("Enter 1 for Male");
		System.out.println("Enter ANY OTHER NUMBER for Female");
		int genderchoice = sc.nextInt();
		TypeOfGender gender;
		switch (genderchoice) {
			case 1: 
				gender = TypeOfGender.MALE;
				break;
			default:
				gender = TypeOfGender.FEMALE;
		}
		return gender;
	}
}
