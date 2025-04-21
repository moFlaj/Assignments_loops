import java.util.Scanner;
public class Practice{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int compChoice = 1;
		compChoice = compChoice + (int)(Math.random() * 10);

		System.out.println("Guess computer number. It's a number ranging from 1 - 10. You have three tries: ");
		int userChoice = input.nextInt();
		
		int counter = 1;

		
		while(counter < 3 && userChoice > 0 && userChoice < 11){
		
				if(userChoice == compChoice){
				System.out.println("Guess is correct.");
				counter = 4;}
			

				if(userChoice < compChoice){
				System.out.println("Incorrect guess. Too low. Try again");}

				else	if(userChoice > compChoice){
				System.out.println("Incorrect guess. Too high. Try again");
				}
		
				if(userChoice != compChoice){
				System.out.println("Try again. It's a number ranging from 1 - 10: ");
				userChoice = input.nextInt();
				counter++;}}

				if(userChoice < 1){
				System.out.println("Enter valid input. Restart game");
		}

				else	if(userChoice > 10){
				System.out.println("Enter valid input. Restart game");
		}
				
				if(userChoice > 0){
				if(counter == 3){
				if(userChoice == compChoice){
				System.out.println("Guess is correct.");}
				
				else	if(userChoice != compChoice){
				System.out.println("Game over. You have used up all tries.");}}}
				
				else	if(userChoice < 11){
					if(counter == 3){
					if(userChoice == compChoice){
					System.out.println("Guess is correct.");}
				
					else	if(userChoice != compChoice){
					System.out.println("Game over. You have used up all tries.");}}}



			
	}
}
					
