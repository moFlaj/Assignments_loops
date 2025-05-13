import java.util.Scanner;
 
public class Poundstokg{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight in pounds: ");
	double weight = input.nextDouble();

	double poundsToKg = 0.454 * weight;
	
	System.out.printf("Your weight in kilogram is %f%n", poundsToKg);

	}

}