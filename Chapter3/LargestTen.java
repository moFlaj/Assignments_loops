import java.util.Scanner;
public class LargestTen{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		int counter = 1;

		int largest = number;
		int smallest = number;

		while(counter < 10){
		System.out.print("Enter number: ");
		number = input.nextInt();
		counter++;
		if(number > largest){
		largest = number;
		} 
		}
		System.out.printf("Largest number is %d.%n", largest);

	}
}
		