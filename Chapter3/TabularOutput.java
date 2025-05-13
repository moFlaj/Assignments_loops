public class TabularOutput{
		public static void main(String[] args){
		int number = 1;

		int square = number;

		int cube = number;
	
		int quad = number;
		
		System.out.printf("N²	N²	N²	N²%n");

		System.out.printf("%d	%d	%d	%d%n", number, square, cube, quad);

		while(number < 5){
		number++;
		square = number * number;
		cube = number * number * number;
		quad = number * number * number * number;
		System.out.printf("%d	%d	%d	%d%n", number, square, cube, quad);
		}
		
	}
}