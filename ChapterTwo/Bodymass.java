import java.util.Scanner;
 
public class Bodymass{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight in kg: ");
	int weight = input.nextInt();
	System.out.print("Enter height in meters: ");
	int height = input.nextInt();
	
		int bodyMassIndex = weight/(height * height);
		System.out.printf("Your BMI is %d%n", bodyMassIndex);

	}

}