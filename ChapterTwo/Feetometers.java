import java.util.Scanner;
 
public class Feetometers{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter value in feet: ");
	double feet = input.nextDouble();

	double meters = 0.305 * feet;
	
	System.out.printf("%f feet converted to meters in  is %f%n", feet, meters);

	}

}