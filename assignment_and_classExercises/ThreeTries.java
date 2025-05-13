import java.util.Scanner;
public class ThreeTries{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		int compChoice = 1;
		compChoice = compChoice + (int)(Math.random() * 10);

		if(compChoice < 1){
		System.out.println("Try again");}
		if(compChoice > 10){
		System.out.println("Try again");}
			
		System.out.println("Guess computer number. It's a number ranging from 1 - 10. You have three tries: ");
		int userChoice = input.nextInt();

		if(userChoice < 1){
		System.out.println("Enter valid input");
		}

		if(userChoice > 10){
		System.out.println("Enter valid input");
		}

		if(userChoice >= 1){
		if(userChoice <= 10){

			if(userChoice == compChoice){
			System.out.println("Guess is correct.");}
			
			if(userChoice != compChoice){
				System.out.println("Incorrect guess.");
				if(userChoice < compChoice){
				System.out.println("Too low");}
				if(userChoice > compChoice){
				System.out.println("Too high");}
				System.out.println("You have two tries left. Try again");

				System.out.print("Guess computer number. It's a number ranging from 1 - 10: ");
				userChoice = input.nextInt();

					if(userChoice == compChoice){
					System.out.println("Guess is correct");}

					if(userChoice != compChoice){
					if(userChoice < compChoice){
					System.out.println("Too low");}
					if(userChoice > compChoice){
					System.out.println("Too high");}
					System.out.println("You have one try left. Try again");

					System.out.print("Guess computer number. It's a number ranging from 1 - 10: ");
					userChoice = input.nextInt();

					if(userChoice == compChoice){
					System.out.println("Guess is correct");}

					if(userChoice != compChoice){
					System.out.printf("Game over. Computer picked %d.%nRestart game.", compChoice);}}}


		}}						

			
}}
			
		

		