package Set02;
import java.util.Scanner;

public class weather {
	/*
	 * Percentage    Description
	 *  30 or less		Clear
	 *  31-70			Party Cloudy
	 *  71-99			Cloudy
	 *  100				Overcast
	 */
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("What percentage of the sky has clouds? ");
		int weather = input.nextInt();
		
		if (weather <= 30){
			System.out.println("Clear"); }
		if (weather >= 31 && weather <= 70){
			System.out.println("Partly Cloudy");
			
		}
		if (weather >= 71 && weather <= 99){
			System.out.println("Cloudy");
			
		}
		if (weather == 100){
			System.out.println("Overcast");
			
		}
		if (weather < 30){
			System.out.println("");
			
		}
		if (weather < 30){
			System.out.println("");
			
		}
		

	
		input.close(); 
	}

}
