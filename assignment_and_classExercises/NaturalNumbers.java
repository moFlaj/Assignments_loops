import java.util.Scanner;
public class NaturalNumbers{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		int counter = 0;
		
		while(counter < 10 && number >= 0){
		number = number + 1;
		sum= sum + number;
		counter++;
		}
		System.out.printf("Sum of first ten natural numbers is %d.%n", sum);

	}
}