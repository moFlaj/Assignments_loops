import java.util.Scanner;

public class BinaryIntegers{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter binary integer. Start with a number greater than 1: ");
		int number = input.nextInt();

		int digit = 0;
		int sum = 0;
		int powerValue = 0;
		int raise = 0;
		String num = Integer.toString(number);

		for(int counter = 0; counter <= num.length();){
		digit = number%10;
		number = number/10;

		if(digit > 1){
		System.out.printf("Invalid input.%nNumber should only contain 1's and 0's.%n"); 
		break;}

		counter++;
	
		for(raise = raise; raise < counter; raise++){
		
		powerValue = digit * (int)Math.pow(2, raise);
		sum = sum + powerValue;
		
		
}		
		
}

		if(digit==1 || digit == 0){
		System.out.printf("Decimal equivalent of binary integer is: %d.%n", sum);}

	}
}
		
		
		
		