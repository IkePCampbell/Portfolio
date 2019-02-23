package Set01;
import java.util.Scanner;

public class fuelSavings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter the miles you drive per year: ");
		int miles = input.nextInt();
	
		System.out.printf("Please enter your current car's MPG: ");
		int currMPG = input.nextInt();
		
		System.out.printf("Please enter the MPG of the new car: ");
		int newMPG = input.nextInt();
		
		System.out.printf("Please enter the current cost of gas per gallon: ");
		float gasPrice = input.nextFloat();
		
		float oldCarSpending = (miles / currMPG) * gasPrice;
		System.out.println("Fuel cost for your current car is $"+ oldCarSpending);
		
		float newCarSpending = (miles / newMPG) * gasPrice;
		System.out.println("Fuel cost for your new car is $"+ newCarSpending);
		
		float difference = oldCarSpending - newCarSpending;
		
		System.out.println("Savings (or loss) is $"+difference);
		
		input.close();
		

	}

}
