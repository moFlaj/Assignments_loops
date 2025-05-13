public class SmallestInArray{
	
	public static int minimumIn(int[] ogArray){
		
		int smallest = ogArray[0];
		int count = 0;
		
		while(count < ogArray.length){

			if(ogArray[count] < smallest)smallest = ogArray[count];

			count++;}

		return smallest;
}

	public static void main(String[] args){

		
		int[] ogArray = {2, 2, 2, 1, 7, 9, 4, 7};
		
		System.out.println(SmallestInArray.minimumIn(ogArray));

}
}

	

		

		
