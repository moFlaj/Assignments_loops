import java.util.Scanner;
public class CitizensTax{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		

		System.out.print("Citizen name: ");
		int citizenName = input.nextInt();

		
		System.out.print("Annual Earnings: $");
		int annualEarnings = input.nextInt();


		double totalTax = 0;
		
		while(annualEarnings > 0){

		if(annualEarnings <= 30000){
		totalTax = 0.15 * annualEarnings;
		System.out.printf("Total tax is $%f.%n", totalTax);
		} 	else if(annualEarnings > 30000) {
				totalTax = 0.20 * annualEarnings;
				System.out.printf("Total tax is $%d.%n", totalTax);
		}
		else { 
			totalTax = totalTax;
			System.out.printf("Unemployed");
		}
		System.out.print("Citizen name: ");
		citizenName = input.nextInt();

		System.out.print("Annual Earnings: $");
		annualEarnings = input.nextInt();

		}
		
}
}
