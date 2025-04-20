import java.util.Scanner;
public class RaiseNumberToPower{

		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to be raised: ");
		int number = input.nextInt();

		System.out.print("Enter power: ");
		int raise = input.nextInt();

		double powerValue = 1;

		int counter = 0;

		while(counter != raise){
		if(raise > 0){
		powerValue = powerValue * number;
		counter++;}
		else if(raise < 0){
		powerValue = powerValue * number;
		counter--;}}
		

		
		double negPower = 1.0 / powerValue;

		if(raise == 0){
		System.out.printf("%d raised to power 0 is 1.%n", number);}

		if(raise > 0){
		System.out.printf("%d raised to power of %d is %d.%n", number, raise, (int)powerValue);}

		else if(raise < 0){
		System.out.printf("%d raised to power %d is %f.%n", number, raise, negPower);}

	}
}
