import java.util.Scanner;
public class MortgageCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Enter the principal amount: ");
			int principal = input.nextInt();
			System.out.print("Enter the annual interest rate: ");
			double interestRate = input.nextInt();
			System.out.print("Enter the duration in years: ");
			int duration = input.nextInt();

			double monthly_rate = (interestRate/100)/12;
			
			int duration_months = duration * 12;
			double monthly_payment = principal * ((monthly_rate * Math.pow(1 + monthly_rate, duration_months))/(Math.pow(1 + monthly_rate, duration_months)-1));
			
			System.out.printf("Your monthly payment is %.2f.%n", monthly_payment);

}
}

			