import java.util.Scanner;
public class Kata{
	
	public static boolean trueEvenFalseOdd(int userInputInteger){
		boolean evenOrOdd;
		if(userInputInteger % 2 == 0){
			evenOrOdd = true;	
}		else {
			evenOrOdd = false;	
}
		return evenOrOdd;	
}

	public static boolean isPrime(int userInputInteger){
		boolean isPrimeNumber;
		int count = 0;
			for(int i = 1; i <= userInputInteger; i++){
				if(userInputInteger % i == 0){
					++count;}
				
}		if(count == 2){
			isPrimeNumber = true;
}
		else{
			isPrimeNumber = false;
}
		return isPrimeNumber;
}

	public static int posDifference(int integerOne, int integerTwo){
		int difference = Math.abs(integerOne - integerTwo);
		return difference;
}
	public static float quotient(int integerOne, int integerTwo){

		float division = 0;
		if(integerTwo == 0){
		division = 0;}

		else if(integerTwo != 0) {
		division = (float)integerOne/(float)integerTwo;
	
}
		return division;
}

	public static int factorOf(int userInputInteger){
		int count = 0;
		for(int i = 1; i <= userInputInteger; i++){
			if(userInputInteger%i == 0){
				++count;
}			
}
		return count;
}
	public static boolean isSquare(int userInputInteger){
		boolean squareRoot;
		int count = 0;
		for(int i = 1; i <= userInputInteger; i++){
			if(Math.sqrt(userInputInteger) == (double)i){
				++count;}
}
			if(count == 1){
				squareRoot = true;}
			else{
				squareRoot = false;
}

		return squareRoot;		

}

	public static boolean isPalindrome(int userInputInteger){
		boolean palindrome;
		int count = 0;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int fifthDigit;

		if(userInputInteger >= 10000 && userInputInteger <= 99999){
			firstDigit = userInputInteger/10000;
			secondDigit = (userInputInteger - (firstDigit * 10000))/1000;
			thirdDigit = (userInputInteger - ((firstDigit * 10000) + (secondDigit * 1000)))/100;
			fourthDigit = (userInputInteger - ((firstDigit * 10000) + (secondDigit * 1000) + (thirdDigit * 100)))/10;
			fifthDigit =  (userInputInteger - ((firstDigit * 10000) + (secondDigit * 1000) + (thirdDigit * 100) + (fourthDigit * 10)))/1;

				if(firstDigit == fifthDigit){
			++count;
}
				if(secondDigit == fourthDigit){
			++count;
}
}
	
		if(count == 2){
			palindrome = true;
}		else{palindrome = false;}

		return palindrome;
}

	public static int factorialOf(int userInputInteger){
		int factorial = 1;
		for(int i = 1; i <= userInputInteger; i++){
			factorial*=i;
}
		return factorial;
}

	public static int squareOf(int userInputInteger){
		int square = (int)Math.pow(userInputInteger, 2);
		return square;
}
	
}
		
		
