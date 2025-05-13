public class CountOddInArray{
	
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

	public static void main(String[] args){
		
		int[] ogArray = {2, 2, 2, 1, 7, 9, 4, 7};
		
		System.out.println(CountOddInArray.noOfOddNumbersIn(ogArray));

}
}

	

		

		
