import java.util.Scanner;
 
public class MinutestoYearsandDays{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of minutes: ");
	int noOfMinutes = input.nextInt();

	int minutesWithoutLeap = noOfMinutes % (365 * 24 * 60);

	int noOfDays = minutesWithoutLeap / 1440;
	int noOfyears = noOfMinutes / 525600;
	
	System.out.printf("%d minutes is approximately %d years and %d days%n", noOfMinutes, noOfyears, noOfDays);

	}

}