import java.util.Scanner;
public class Guesses{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int compChoice = 1;
		compChoice = compChoice + (int)(Math.random() * 10);
		int noOfGuesses = 0;
		int userChoice = 1;

		System.out.println("Guess computer number. It's a number ranging from 1 - 10: ");
		noOfGuesses++;
		userChoice = input.nextInt();

		while(userChoice != compChoice && userChoice > 0 && userChoice < 11){

		if(userChoice < compChoice){
		System.out.println("Too low. Try again");
		}
		if(userChoice > compChoice){
		System.out.println("Too high. Try again");
		}

		System.out.println("Guess computer number. It's a number ranging from 1 - 10.: ");
		noOfGuesses++;
		userChoice = input.nextInt();
		
		if(noOfGuesses == 3){
		compChoice = 1;
		compChoice = compChoice + (int)(Math.random() * 10);
		System.out.println("You have wrongly guessed thrice. Mystery number has been changed.");
		noOfGuesses = 0;}}

		if(userChoice < 1){
		System.out.println("Enter valid input");
		}

		if(userChoice > 10){
			System.out.println("Enter valid input");
		}

		if(userChoice == compChoice){
			System.out.println("Congratulations, guess is correct.");
			System.out.printf("It took %d guesses for you to get it.", noOfGuesses);}

	}
}

		
		
