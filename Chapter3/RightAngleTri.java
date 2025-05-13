import java.util.Scanner;

public class RightAngleTri{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter base length of triangle: ");
		int length = input.nextInt();

		for(int counter = 1; counter <= length; counter++){
		System.out.print("*");
		
			if(counter >= 2){
				for(int counter2 = 1; counter2 < counter; counter2++){
					System.out.print("*");}}

			System.out.println();
		}
	}
}
		
		