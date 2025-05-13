import java.util.Scanner;

public class PalindromesThreeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		int firstDigit = 0;
		int secondDigit = 0;
		int thirdDigit = 0;

		while(true){

		System.out.print("Enter three digit number: ");
		number = input.nextInt();
		if(number < 100 || number > 999){
		System.out.println("Enter valid input.");
		System.out.print("Enter three digit number: ");
		number = input.nextInt();}
		
		if(number >= 100 && number <= 999){
			firstDigit = number/100;
			secondDigit = (number - (firstDigit * 100))/10;
			thirdDigit = (number - (secondDigit * 10 + firstDigit * 100))/1;
		
		
			if(firstDigit != thirdDigit){
			System.out.printf("%d is not a palindrome.%n", number);
			break;}

			else if(firstDigit == thirdDigit){
			System.out.printf("%d is a palindrome.%n", number);
			break;}
		}}

	}
}