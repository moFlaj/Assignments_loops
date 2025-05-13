import java.util.Arrays;
public class EvenNumbersArray{

	public static String evenNumbersIn(int[] numberArray){

		int count = 0;
		

		for(int index = 0; index < numberArray.length; index++){

			if(numberArray[index] % 2 == 0){
				++count;
}}
		int[] evenArrayCount = new int[count];
		int counter = 0;
		for(int index = 0; index < numberArray.length; index++){

			if(numberArray[index] % 2 == 0){

				evenArrayCount[counter] = numberArray[index];
				counter++;
}}

		
		int countRemoveDuplicate = 1;
		int counterTwo = evenArrayCount.length;
		int[] evenNumberArray = new int[counterTwo];
		int countOnce = 0;
		for(int index = 0; index < evenArrayCount.length; index++){
				if(index > 0){
					for(int counterOne = index - 1 ; counterOne >= 0; counterOne--){
						if(evenArrayCount[counterOne] == evenArrayCount[index]){
							evenNumberArray = new int[counterTwo = counterTwo - 1];
							++countOnce;}
						if(countOnce == 1){
							countOnce = 0;
							break;}

}
}
}

		int indexEven = 0; 
		int countDup = 0;

		for(int index = 0; index < evenArrayCount.length; index++){
			if(index > 0){
				for(int counterOne = index - 1 ; counterOne >= 0; counterOne--){
					if(evenArrayCount[counterOne] == evenArrayCount[index]){
							++countDup;}
							if(countDup == 1){
							break;}
							
}

					if(countDup == 0){
						evenNumberArray[indexEven] = evenArrayCount[index];
						++indexEven;}
											
}
			countDup = 0;

			if(index == 0){
				evenNumberArray[indexEven] = evenArrayCount[index];
				++indexEven;}

}
			
		return Arrays.toString(evenNumberArray);
}

	public static void main(String[] args){

		int[] numberArray = {1,1,5,6,8};
		System.out.println(EvenNumbersArray.evenNumbersIn(numberArray));	
}
}
				