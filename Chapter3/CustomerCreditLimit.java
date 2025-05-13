import java.util.Scanner;
public class CustomerCreditLimit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber = input.nextInt();
		System.out.print("Enter balance at beginning of the month: ");
		int accountBalance = input.nextInt();
		System.out.print("Enter total of all items charged by the customer this month: ");
		int totalMonth = input.nextInt();
		System.out.print("Enter total of all credits applied to the customer’s account this month : ");
		int totalCreditsMonth = input.nextInt();
		System.out.print("Enter allowed credit limit: ");
		int creditLimit = input.nextInt();

		int newBalance =  accountBalance + totalMonth - totalCreditsMonth;
		System.out.printf("New balance is %d%n", newBalance);

		while(creditLimit >= 0){
		if(newBalance == creditLimit){
			System.out.println("Credit limit reached");
		}	else if(newBalance > creditLimit){
				System.out.println("Credit limit exceeded");
		} 	else if(newBalance < creditLimit){
				System.out.println("Continue");
		}
			System.out.print("Enter account number: ");
			accountNumber = input.nextInt();
			System.out.print("Enter balance at beginning of the month: ");
			accountBalance = input.nextInt();
			System.out.print("Enter total of all items charged by the customer this month: ");
			totalMonth = input.nextInt();
			System.out.print("Enter total of all credits applied to the customer’s account this month : ");
			totalCreditsMonth = input.nextInt();
			System.out.print("Enter allowed credit limit: ");
			creditLimit = input.nextInt();
			newBalance =  accountBalance + totalMonth - totalCreditsMonth;
			System.out.printf("New balance is %d%n", newBalance);}



	}
}