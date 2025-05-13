public class LargestInArray{
	
	public static int maximumIn(int[] ogArray){
		
		int largest = ogArray[0];
		int count = 0;
		
		while(count < ogArray.length){

			if(ogArray[count] > largest)largest = ogArray[count];

			count++;}

		return largest;
}

	public static void main(String[] args){

		
		int[] ogArray = {2, 2, 2, 1, 7, 9, 4, 7};
		
		System.out.println(LargestInArray.maximumIn(ogArray));

}
}

	

		

		
