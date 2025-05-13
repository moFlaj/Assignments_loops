import java.util.Scanner;
 
public class EvenAndOdd{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter set of integers: ");
	int integer1 = input.nextInt();
	int integer2 = input.nextInt();
	int integer3 = input.nextInt();
	int integer4 = input.nextInt();
	

	int evenNos = 0;
	int oddNos = 0;
	int even1 = 0;
	int even2 = 0;
	int even3 = 0;
	int even4 = 0;
	int odd1 = 0;
	int odd2 = 0;
	int odd3 = 0;
	int odd4 = 0;

	if(integer1 % 2 == 0) {
	even1 = integer1;
	System.out.printf("First even number is %d%n", even1);
	evenNos = evenNos + integer1;}

	if(integer2 % 2 == 0) {
	even2 = integer2;
	System.out.printf("Second even number is %d%n", even2);
	evenNos = evenNos + integer2;}

	if(integer3 % 2 == 0) {
	even3 = integer3;
	System.out.printf("Third even number is %d%n", even3);
	evenNos = evenNos + integer3;}

	if(integer4 % 2 == 0) {
	even4 = integer4;
	System.out.printf("Fourth even number is %d%n", even4);
	evenNos = evenNos + integer4;}

	System.out.printf("The even numbers are %d, %d, %d, %d%n", evenNos);

	System.out.printf("Sum of even numbers is %d%n", evenNos);


	if(integer1 % 2 != 0) 
	oddNos = oddNos + integer1;

	if(integer2 % 2 != 0) 
	oddNos = oddNos + integer2;

	if(integer3 % 2 != 0) 
	oddNos = oddNos + integer3;

	if(integer4 % 2 != 0) 
	oddNos = oddNos + integer4;

	

	System.out.printf("Sum of odd numbers is %d%n", oddNos);


	
	
	}

}