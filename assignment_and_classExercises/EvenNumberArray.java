import java.util.Arrays;
public class EvenNumberArray{
	
	public static int[] evenNumbersIn(int[] ogArray){
		
		int count = 0;
		int counter = 0;

		while(count < ogArray.length){

			switch(ogArray[count] % 2){
			case 0: ++counter; break;
			default: break;
}	
			count++;
}
		int[] modEvenArray = new int[counter];
		counter = 0;
		count = 0;

		while(count < ogArray.length){
			switch(ogArray[count] % 2){
			case 0: modEvenArray[counter] = ogArray[count]; counter++; break;
			default: break;}

			count++;
}
		count = 0;
		

		for(int index = 0; index < modEvenArray.length; index++){
			
			for(int counter = 0; counter < modEvenArray.length; counter++){

				if(modEvenArray[index] == modEvenArray[counter])++count;}}

		int[] modEvenArrayDuplicate = new int[(modEvenArray.length - count) + 1];

		 












		
		return modEvenArray;
}

	public static void main(String[] args){
		
		int[] ogArray = {2, 4, 8, 1, 7, 9, 4, 7};
		
		System.out.println(Arrays.toString(EvenNumberArray.evenNumbersIn(ogArray)));

}
}

	

		

		
