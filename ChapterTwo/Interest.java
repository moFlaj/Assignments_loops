import java.util.Scanner;
 
public class Interest{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter interest rate: ");
	double annualInterestRate = input.nextDouble();
	
	double interest = balance * (annualInterestRate/1200);
	System.out.printf("The interest is %f%n", interest);

	}

}






