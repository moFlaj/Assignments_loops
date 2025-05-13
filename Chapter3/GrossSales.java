import java.util.Scanner;
public class GrossSales{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Staff++");

		System.out.print("Enter staff wage: ");
		int wages = input.nextInt();

		double grossSales = 0;
		double wagesCommision = 0;
		int itemCounter = 0;
		double valueItem = 0;


		while(valueItem >= 0){
		System.out.print("Enter value of item sold: ");
		valueItem = input.nextDouble();
		itemCounter++;
		grossSales += valueItem;}
		
		if(itemCounter != 0){
		System.out.printf("Total value of all items sold is $%f.%n", grossSales);
		wagesCommision = 0.09 * grossSales + wages;
		System.out.printf("Weekly wage is %f.%n", wagesCommision);}





		}

}	