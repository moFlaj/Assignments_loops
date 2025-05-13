import java.util.Scanner;
 
public class Costoftrip{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter driving distance: ");
	double distance = input.nextDouble();

	System.out.print("Enter fuel efficiency in miles per gallon: ");
	double fuelEff = input.nextDouble();

	System.out.print("Enter price per gallon: ");
	double pricePerG = input.nextDouble();

	
	double costOfTrip = (distance / fuelEff) * pricePerG;
	System.out.printf("Cost of trip is %f%n", costOfTrip);

	}

}








