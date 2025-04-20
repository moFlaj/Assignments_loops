import java.util.Scanner;
public class DoWhileLoop{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int number = 0;
		int number2 = 0;
		int sum = 0;
		System.out.println("Enter first number: ");
		number = input.nextInt();
		System.out.println("Enter second number: ");
		number2 = input.nextInt();

		do{
			sum = number + number2;
			System.out.printf("Sum of %d and %d is %d.%n", number, number2, sum);
			System.out.println("If you wish to stop, enter 0 twice.");
			System.out.println("If you wish to continue, enter two numbers.");
			System.out.println("Enter first number: ");
			number = input.nextInt();
			System.out.println("Enter second number: ");
			number2 = input.nextInt();
		
			
			
} 		while(number != 0 && number2 != 0); 

	}
}
