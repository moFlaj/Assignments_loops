import java.util.Scanner;
 
public class Bodymassindex{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight in pounds: ");
	double weight = input.nextDouble();
	System.out.print("Enter height in inches: ");
	int height = input.nextInt();

	double poundsToKg = 0.45359237 * weight;
	double inchesToM = 0.0254 * height;
	
	double bodyMassIndex = poundsToKg/(inchesToM * inchesToM);
	System.out.printf("Your BMI is %f%n", bodyMassIndex);

	}

}