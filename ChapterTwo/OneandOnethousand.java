import java.util.Scanner;
 
public class OneandOnethousand{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter integer: ");
	int number = input.nextInt();

	int remainder = 0;
	
	if(number > 0){
	if(number < 1000){
	
	remainder = number % 10;

	number = number / 10;

	remainder = remainder + (number % 10);

	number = number / 10;
	
	remainder = remainder + (number % 10);

	System.out.printf("Sum of digits is %d%n", remainder);}}


	

	

	}

}