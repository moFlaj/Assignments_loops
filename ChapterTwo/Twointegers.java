import java.util.Scanner;

public class Twointegers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		int square1 = number1 * number1;
		int square2 = number2 * number2;
		int squareSum = square1 + square2;
		int squareMinus = square1 - square2;
		
		System.out.printf("Square of first integer is %d%n", square1);
		System.out.printf("Square of second integer is %d%n", square2);
		System.out.printf("Sum of both squares is %d%n", squareSum);
		System.out.printf("Difference of both squares is %d%n", squareMinus);

	}
}