import java.util.Scanner;
 
public class Energycalc{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of water in kilograms: ");
	double weight = input.nextFloat();

	System.out.print("Enter initial temperature of water: ");
	double initialTemp = input.nextFloat();

	System.out.print("Enter final temperature of water: ");
	double finalTemp = input.nextFloat();

	double energy = weight * (finalTemp - initialTemp) * 4184;
	
	System.out.printf("Energy needed is %f%n", energy);

	}

}