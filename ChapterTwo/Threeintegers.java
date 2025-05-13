import java.util.Scanner;

public class Threeintegers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer:  ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer:  ");
		int number2 = input.nextInt();
		System.out.print("Enter third integer:  ");
		int number3 = input.nextInt();

		int sum = number1 + number2 + number3;
		System.out.printf("Sum of the three integers is %d%n", sum);
		int average = (number1 + number2 + number3)/3;
		System.out.printf("Average of the three integers is %d%n", average);
		int product = number1 * number2 * number3; 
		System.out.printf("Product of the three integers is %d%n", product);
		
		int smallest = number1;
		int largest = number1;

		if(number2 < smallest) {
		smallest = number2;
		}
		if(number3 < smallest) {
		smallest = number3;
		}
		System.out.printf("Smallest number is %d%n", smallest);

		if(number2 > largest) {
		largest = number2;
		}
		if(number3 > largest) {
		largest = number3;
		}
		System.out.printf("Largest number is %d%n", largest);

		

	}
}