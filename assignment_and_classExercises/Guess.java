import java.util.Scanner;
public class Guess{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int compChoice = 1;
		compChoice = compChoice + (int)(Math.random() * 10);
		int noOfGuesses = 0;

		int userChoice = 1;
		System.out.println("Guess computer number. It's a number ranging from 1 - 10: ");
		userChoice = input.nextInt();
		noOfGuesses+=1;

		while(userChoice != compChoice && userChoice > 0 && userChoice < 11){
		if(userChoice < compChoice){
		System.out.println("Too low. Try again");
		}
		if(userChoice > compChoice){
		System.out.println("Too high. Try again");
		}
		System.out.println("Guess computer number. It's a number ranging from 1 - 10: ");
		userChoice = input.nextInt();
		noOfGuesses+=1;
		}

		if(userChoice == compChoice){
			System.out.println("Congratulations, guess is correct.");
			System.out.printf("It took %d guesses for you to get it.", noOfGuesses);}

		if(userChoice < 1){
		System.out.println("Enter valid input. Restart game");
		}

		if(userChoice > 10){
			System.out.println("Enter valid input. Restart game");
		}

	}
}
			

		
		
	