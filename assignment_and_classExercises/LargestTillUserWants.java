import java.util.Scanner;
public class LargestTillUserWants{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		double number = input.nextDouble();


		double largest = number;
		double smallest = number;

		while(number != -1){
		System.out.print("Enter number: ");
		number = input.nextDouble();

		if(number > largest){
		largest = number;
		} 

		if(number < smallest){
		smallest = number;
		} 
		}

		System.out.printf("Largest number is %.2f.%n", largest);
		System.out.printf("Smallest number is %.2f.%n", smallest);	
}
}
		