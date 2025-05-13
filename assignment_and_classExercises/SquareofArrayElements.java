import java.util.Arrays;
public class SquareofArrayElements{

	public static String squareNumbersIn(int[] numberArray){
		int[] squareOfArray = new int[numberArray.length];

		for(int index = 0; index < numberArray.length; index++){
			squareOfArray[index] = (int)Math.pow(numberArray[index], 2);
}

		return Arrays.toString(squareOfArray);
}

	public static void main(String[] args){

		int[] numberArray = {2,4,5,7,8};
		System.out.println(SquareofArrayElements.squareNumbersIn(numberArray));
}
}