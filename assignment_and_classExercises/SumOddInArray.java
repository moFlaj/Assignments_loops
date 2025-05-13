public class SumOddInArray{
	
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

	public static void main(String[] args){

		
		int[] ogArray = {2, 2, 2, 1, 7, 9, 4, 7};
		
		System.out.println(SumOddInArray.sumOfOddNumbersIn(ogArray));

}
}

	

		

		
