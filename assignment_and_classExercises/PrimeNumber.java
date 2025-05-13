import java.util.Scanner;
public class PrimeNumber{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();

		int i = number;
		int counter = 0;

		while(i > 0){
			if(number % i != 0){
			counter++;
			}
			--i;
			
			
}
		if(counter == number - 2){
		System.out.printf("%d is a prime number.%n", number);}
		else{System.out.printf("%d is not a prime number.%n", number);}

}
}
		