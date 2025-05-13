import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int gradeCounterA = 0;
		int gradeCounterB = 0;
		int gradeCounterC = 0;
		int gradeCounterD = 0;
		int gradeCounterF = 0;
		int scoreOverHundred;
		int invalidScores = 0;
		int tenValidScores = 0;

		while(tenValidScores < 10){
			System.out.print("Enter student score: ");
			scoreOverHundred = input.nextInt();

			if(scoreOverHundred < 0 || scoreOverHundred > 100){
				++invalidScores;
				System.out.println("Invalid score.");}

			else if(scoreOverHundred >= 0 && scoreOverHundred <= 100){
				++tenValidScores;	
				switch(scoreOverHundred/10){
					case 10, 9, 8: 
						++gradeCounterA;
						System.out.printf("Student scored %d which is grade A.%n", scoreOverHundred);
						break;
					case 7: ++gradeCounterB;
						System.out.printf("Student scored %d which is grade B.%n", scoreOverHundred);
						break;
					case 6: ++gradeCounterC;
						System.out.printf("Student scored %d which is grade C.%n", scoreOverHundred);
						break;
					case 5: ++gradeCounterD;
						System.out.printf("Student scored %d which is grade D.%n", scoreOverHundred);
						break;
					case 4, 3, 2, 1, 0: 
						++gradeCounterF;
						System.out.printf("Student scored %d which is grade F.%n", scoreOverHundred);
						break;}}
			if(tenValidScores == 10){
				System.out.printf("%d valid scores have been collected.%n", invalidScores);
				System.out.printf("%d invalid scores were entered but not considered.%n", tenValidScores);}

		}

		System.out.printf("%d students scored an A grade.%n", gradeCounterA);
		System.out.printf("%d students scored a B grade.%n", gradeCounterB);
		System.out.printf("%d students scored a C grade.%n", gradeCounterC);
		System.out.printf("%d students scored a D grade.%n", gradeCounterD);
		System.out.printf("%d students scored a F grade.%n", gradeCounterF);
}}
		
		

		
		
		