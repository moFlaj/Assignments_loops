import java.util.Scanner;
 
public class Averageacceleration{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter starting velocity, v0 in m/s: ");
	double velocity0 = input.nextDouble();

	System.out.print("Enter ending velocity, v1 in m/s: ");
	double velocity1 = input.nextDouble();

	System.out.print("Enter time span, t in seconds: ");
	double time = input.nextDouble();

	double averageAcce = (velocity1 - velocity0)/time;
	System.out.printf("Average acceleration is %f%n", averageAcce);

	}
}
	
	
