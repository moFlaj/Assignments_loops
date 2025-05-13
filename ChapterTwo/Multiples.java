import java.util.Scanner;

public class Multiples{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		int tripled = number1 * 3;
		int doubled = number2 * 2;
		
		if(doubled == 0) {
		System.out.println("Multiple of 0 is 0 so it cannot be determined if tripled is a multiple");}
		
		
		if(doubled != 0) {

		int remainder = tripled % doubled;

		if(remainder == 0) {
		System.out.printf("%d is a multiple of %d%n", tripled, doubled);}
		
		}

	}
}
		
		