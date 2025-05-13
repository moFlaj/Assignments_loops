import java.util.Scanner;
 
public class Numberzero{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter five numbers: ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	int number4 = input.nextInt();
	int number5 = input.nextInt();

	int numberOfZeros = 0;

	if(number1 == 0)
	numberOfZeros = numberOfZeros + 1;

	if(number2 == 0)
	numberOfZeros = numberOfZeros + 1;

	if(number3 == 0)
	numberOfZeros = numberOfZeros + 1;

	if(number4 == 0)
	numberOfZeros = numberOfZeros + 1;

	if(number5 == 0)
	numberOfZeros = numberOfZeros + 1;
	
	System.out.printf("Number of zero values is %d%n", numberOfZeros);

	int noOfNegNumbers = 0;

	if(number1 < 0)
	noOfNegNumbers = noOfNegNumbers + 1;

	if(number2 < 0)
	noOfNegNumbers = noOfNegNumbers + 1;

	if(number3 < 0)
	noOfNegNumbers = noOfNegNumbers + 1;

	if(number4 < 0)
	noOfNegNumbers = noOfNegNumbers + 1;

	if(number5 < 0)
	noOfNegNumbers = noOfNegNumbers + 1;
	
	System.out.printf("Number of negative values is %d%n", noOfNegNumbers);

	int noOfPosNumbers = 0;

	if(number1 >= 0)
	noOfPosNumbers = noOfPosNumbers + 1;

	if(number2 >= 0)
	noOfPosNumbers = noOfPosNumbers + 1;

	if(number3 >= 0)
	noOfPosNumbers = noOfPosNumbers + 1;

	if(number4 >= 0)
	noOfPosNumbers = noOfPosNumbers + 1;

	if(number5 >= 0)
	noOfPosNumbers = noOfPosNumbers + 1;
	
	System.out.printf("Number of positive values is %d%n", noOfPosNumbers);

	
	
			

	}
}

	
	
		
	
