import java.util.Scanner;
public class Productwhile{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
			int total = 0; // initialize sum of grades entered by the user
 			int gradeCounter = 1; // initialize # of grade to be entered next

				while (gradeCounter <= 10) { // loop 10 times					System.out.print("Enter grade: "); // prompt
					int grade = input.nextInt(); // input next grade
					total = total + grade; // add grade to total
					gradeCounter = gradeCounter + 1; }
					
					System.out.printf("%nTotal of all 10 grades is %d%n", total);
	}
}