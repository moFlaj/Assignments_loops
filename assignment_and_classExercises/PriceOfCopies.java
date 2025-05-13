import java.util.Scanner;
public class PriceOfCopies{

	public static int numberOfCopies(int noOfCopies){
		int price = 0;
		int[] prices = {2000, 1800, 1600, 1500, 1300, 1200, 1100, 1000};
		if(noOfCopies >= 1 && noOfCopies <= 4)price = prices[0];
		if(noOfCopies >= 5 && noOfCopies <= 9)price = prices[1];
		if(noOfCopies >= 10 && noOfCopies <= 29)price = prices[2];
		if(noOfCopies >= 30 && noOfCopies <= 49)price = prices[3];
		if(noOfCopies >= 50 && noOfCopies <= 99)price = prices[4];
		if(noOfCopies >= 100 && noOfCopies <= 199)price = prices[5];
		if(noOfCopies >= 200 && noOfCopies <= 499)price = prices[6];
		if(noOfCopies > 500)price = prices[7];

		return price;
}
		public static void pricesOfCopies(int noOfCopies, int pricePerCopy){
		if(noOfCopies > 0){
			int priceOfCopies = noOfCopies * pricePerCopy;
			System.out.printf("Price of %d copies is #%d.%n", noOfCopies,priceOfCopies);
}
		else{
			System.out.println("Enter valid input");
}
}

	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number of copies: ");
		int noOfCopies = input.nextInt();

		PriceOfCopies.pricesOfCopies(noOfCopies,PriceOfCopies.numberOfCopies(noOfCopies));
}
}

		

		

		
			