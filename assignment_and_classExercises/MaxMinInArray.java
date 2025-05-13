import java.util.Arrays;
public class MaxMinInArray{
	
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

	public static void main(String[] args){

		
		int[] ogArray = {2, 2, 2, 1, 7, 9, 4, 7};
		
		System.out.println(Arrays.toString(MaxMinInArray.maximumAndMinimumOf(ogArray)));

}
}

	

		

		
