package Set01;
import java.util.Scanner;

public class minutes {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Plese enter the number of minutes: ");
		int time = input.nextInt();
		
		int hours = time / 60;
		int minutes = time % 60;
		
		System.out.println("That is "+ hours+" hours and "+minutes+" minutes");
		
		
		
		input.close();
	}
}
