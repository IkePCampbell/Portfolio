package Set02;
import java.util.Scanner;
public class height {
	
	/*
	 * Normal height for US females is 64 inches plus/minus 2.5 inches and for US males it is 69.5 inches plus/minus 3 inches.
	 * Make sure they enter only M or F
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What gender should we test? ");		
		
		while (!input.hasNext("[MF]")) {
			System.out.print("Please enter only M or F");
			input.next();
		}
		String gender = input.next();
		System.out.print("What is the height we should test in inches? ");
		float height = input.nextFloat();
		input.close();
		
		if (gender.equals("M")) {
			if (height >=66.5 && height <= 72.5) {
				System.out.println("Within average.");
			}
			else {
				System.out.println("Not within average.");
			}
		}
		else { //female case
			if (height >= 61.5 && height <= 66.5) {
				System.out.println("Within average.");	
			}
			else {
				System.out.println("Not within average.");
			}
		}
	}

}
