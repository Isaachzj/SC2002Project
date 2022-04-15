package guest;
import enumeration.TypeOfGender;
import java.util.Scanner;

public class CreateGender {
	/**
	 * instantiation of guest's gender;
	 * If user input is '1', guest's gender instantiated as 'MALE'; else, 'FEMALE'
	 * once the gender of guest has been instantiated, it would be returned
	 * @return this is the gender of the guest
	 */
	public static TypeOfGender createGender() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- Enter your Gender --------");
		System.out.println("Enter 1 for Male");
		System.out.println("Enter ANY OTHER NUMBER for Female");
		int genderchoice = sc.nextInt(); sc.nextLine();
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
