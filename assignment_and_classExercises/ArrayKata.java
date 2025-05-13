public class ArrayKata{
	
	public static int maximumIn(int[] ogArray){
		
		int largest = ogArray[0];
		int count = 0;
		
		while(count < ogArray.length){

			if(ogArray[count] > largest)largest = ogArray[count];

			count++;}

		return largest;
}

	public static int minimumIn(int[] ogArray){
		
		int smallest = ogArray[0];
		int count = 0;
		
		while(count < ogArray.length){

			if(ogArray[count] < smallest)smallest = ogArray[count];

			count++;}

		return smallest;
}

	public static int sumOf(int[] ogArray){
		
		int sum = 0;
		int count = 0;
		
		while(count < ogArray.length){

			sum += ogArray[count];

			count++;}

		return sum;
}

	public static int sumOfEvenNumbersIn(int[] ogArray){
		
		int sum = 0;
		int count = 0;
		
		while(count < ogArray.length){

			switch(ogArray[count]%2){
			case 0: sum += ogArray[count];break;
			default: break;}

			count++;}

		return sum;
}

	public static int sumOfOddNumbersIn(int[] ogArray){
		
		int sum = 0;
		int count = 0;
		
		while(count < ogArray.length){

			switch(ogArray[count]%2){
			case 1: sum += ogArray[count];break;
			default: break;}

			count++;}

		return sum;
}

	public static int[] maximumAndMinimumOf(int[] ogArray){
		
		int largest = ogArray[0];
		int smallest = ogArray[0];
		int count = 0;
		int[] modArray = new int[2];

		while(count < ogArray.length){
			
			if(ogArray[count] > largest){

				largest = ogArray[count];
				modArray[1] = ogArray[count];
}
			if(ogArray[count] < smallest){

				smallest = ogArray[count];
				modArray[0] = ogArray[count];
}			
			count++;
}
	
		return modArray;
}

	public static int noOfOddNumbersIn(int[] ogArray){
		
		int count = 0;
		int counter = 0;

		while(count < ogArray.length){

			switch(ogArray[count]%2){
			case 1: ++counter;break;
			default: break;
}
			
			count++;
}
	
		return counter;
}

	public static int noOfEvenNumbersIn(int[] ogArray){
		
		int count = 0;
		int counter = 0;

		while(count < ogArray.length){

			switch(ogArray[count] % 2){
			case 0: ++counter; break;
			default: break;
}
			
			count++;
}
	
		return counter;
}

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


	public static String oddNumbersIn(int[] numberArray){

		int count = 0;
		

		for(int index = 0; index < numberArray.length; index++){

			if(numberArray[index] % 2 == 1){
				++count;
}}

		int[] oddArrayCount = new int[count];
		int counter = 0;
		for(int index = 0; index < numberArray.length; index++){

			if(numberArray[index] % 2 == 1){

				oddArrayCount[counter] = numberArray[index];
				counter++;
}}

		
		int countRemoveDuplicate = 1;
		int counterTwo = oddArrayCount.length;
		int[] oddNumberArray = new int[counterTwo];
		int countOnce = 0;
		for(int index = 0; index < oddArrayCount.length; index++){
				if(index > 0){
					for(int counterOne = index - 1 ; counterOne >= 0; counterOne--){
						if(oddArrayCount[counterOne] == oddArrayCount[index]){
							oddNumberArray = new int[counterTwo = counterTwo - 1];
							++countOnce;}
						if(countOnce == 1){
							countOnce = 0;
							break;}

}
}
}

		int indexEven = 0; 
		int countDup = 0;

		for(int index = 0; index < oddArrayCount.length; index++){
			if(index > 0){
				for(int counterOne = index - 1 ; counterOne >= 0; counterOne--){
					if(oddArrayCount[counterOne] == oddArrayCount[index]){
							++countDup;}
							if(countDup == 1){
							break;}
							
}

					if(countDup == 0){
						oddNumberArray[indexEven] = oddArrayCount[index];
						++indexEven;}
											
}
			countDup = 0;

			if(index == 0){
				oddNumberArray[indexEven] = oddArrayCount[index];
				++indexEven;}

}
			
		return Arrays.toString(oddNumberArray);
}


	public static String squareNumbersIn(int[] numberArray){
		int[] squareOfArray = new int[numberArray.length];

		for(int index = 0; index < numberArray.length; index++){
			squareOfArray[index] = (int)Math.pow(numberArray[index], 2);
}

		return Arrays.toString(squareOfArray);
}
}


	