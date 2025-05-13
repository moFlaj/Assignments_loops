import java.util.Scanner;
 
public class EstimatedPopulation{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("World population is: ");
	int worldPopulation = input.nextInt();
	System.out.print("Annual population growth rate is: ");
	double growthRate = input.nextFloat();

	int estimatedPop1 = (int)(growthRate * worldPopulation  + worldPopulation);
	int estimatedPop2 = (int)(growthRate * estimatedPop1  + estimatedPop1);
	int estimatedPop3 = (int)(growthRate * estimatedPop2  + estimatedPop2);
	int estimatedPop4 = (int)(growthRate * estimatedPop3  + estimatedPop3);
	int estimatedPop5 = (int)(growthRate * estimatedPop4  + estimatedPop4);

	System.out.printf("World population currently is %d%n", worldPopulation);
	System.out.printf("World population after one year is %d%n", estimatedPop1);
	System.out.printf("World population after two years is %d%n", estimatedPop2);
	System.out.printf("World population after three years is %d%n", estimatedPop3);
	System.out.printf("World population after four years is %d%n", estimatedPop4);
	System.out.printf("World population after five years is %d%n", estimatedPop5);
	
	
	

	}

}
		