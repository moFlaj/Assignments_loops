import java.util.Scanner;
 
public class Airplancexlr{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter speed, v: ");
	double takeOffSpeed = input.nextFloat();
	System.out.print("Enter acceleration, ms-2: ");
	double accelerate = input.nextFloat();
	System.out.print("Enter airplance acceleration: ");
	


	double minLength = (takeOffSpeed * takeOffSpeed) / (2 * accelerate);
	
	System.out.printf("The minimum runway length needed for an airplane to take off is needed is %f%n", minLength);

	}

}