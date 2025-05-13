public class SumInArray{
	
	public static int sumOf(int[] ogArray){
		
		int sum = 0;
		int count = 0;
		
		while(count < ogArray.length){

			sum += ogArray[count];

			count++;}

		return sum;
}

	public static void main(String[] args){

		
		int[] ogArray = {2, 2, 2, 1, 7, 9, 4, 7};
		
		System.out.println(SumInArray.sumOf(ogArray));

}
}

	

		

		
