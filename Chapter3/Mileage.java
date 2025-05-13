import java.util.Scanner;
public class Mileage{
	public static void main(String[] args){

	int total = 0;
	int mileCounter = 0;
	double average = 0;
	int milesPerGallon = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter miles driven or -1 to quit: ");
	int milesDriven = input.nextInt();
	System.out.print("Enter gallons used: ");
	int gallonsUsed = input.nextInt();

	while(milesDriven > 0){
	milesPerGallon = milesDriven/gallonsUsed;
	System.out.printf("Miles per gallon of trip is %d%n", milesPerGallon);
	mileCounter++;
	total += milesPerGallon;
	System.out.print("Enter miles driven or -1 to quit: ");
	milesDriven = input.nextInt();
	System.out.print("Enter gallons used: ");
	gallonsUsed = input.nextInt();

	
	}
	System.out.printf("Total miles per gallon is %d%n", total);
	System.out.printf("Total number of trips is %d%n", mileCounter);

	if(mileCounter != 0){
	average = (double)total/mileCounter;
	System.out.printf("Average miles per gallon is %f.", average);}

	}
}
	
	
	
	

