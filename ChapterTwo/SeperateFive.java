import java.util.Scanner;
 
public class SeperateFive{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter integer: ");
	int number = input.nextInt();

	int firstDigit = 0;
	int secondDigit = 0;
	int thirdDigit = 0;
	int fourthDigit = 0;
	int fifthDigit = 0;
	
	if(number >= 10000)
	if(number < 100000)
	
	firstDigit = number / 10000;
	
	number = number - 10000 * (number / 10000);

	secondDigit = number / 1000;

	number = number - 1000 * (number / 1000);
	
	thirdDigit = number / 100;

	number = number - 100 * (number / 100);
	
	fourthDigit = number / 10;

	number = number - 10 * (number / 10);
	
	fifthDigit = number / 1;
	

	System.out.printf("%d   ", firstDigit);
	System.out.printf("%d   ", secondDigit);
	System.out.printf("%d   ", thirdDigit);
	System.out.printf("%d   ", fourthDigit);
	System.out.printf("%d   %n", fifthDigit);

	}

}