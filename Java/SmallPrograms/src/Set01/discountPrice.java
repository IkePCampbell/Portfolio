package Set01;
import java.util.Scanner;

public class discountPrice {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the original price: ");
		float originalPrice = input.nextFloat();
		System.out.printf("Please enter the percentage off: ");
		float percentOff = input.nextInt();
		input.close();
		
		float reducePrice = originalPrice * (percentOff / 100);
		reducePrice = Math.round(reducePrice);	
		float newPrice = originalPrice - reducePrice;
		
		System.out.println("The sale price is $"+ newPrice);
	}
	
}
