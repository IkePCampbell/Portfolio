package Set02;
import java.util.Scanner;

public class overtime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("How many hours did you work? ");
		int hours = input.nextInt();
		System.out.printf("What is your base pay? ");
		float pay = input.nextFloat();
		
		float totalPay;
		
		if (hours > 40) {
			totalPay = 40 * pay;
			int hoursOver = hours - 40;
			float overtimePay = (float) (hoursOver * (pay * 1.5));
			totalPay = totalPay + overtimePay;
		}
		else {
			totalPay = hours * pay;
		}
		
		System.out.println("The total pay is $"+totalPay);
			
		input.close();

	}

}
