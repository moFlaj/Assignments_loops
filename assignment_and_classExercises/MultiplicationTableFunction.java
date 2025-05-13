import java.util.Scanner;
public class MultiplicationTableFunction{

	public static void multiplicationTableFromTo(int a, int b){

		System.out.print("\t\t");
		for(int header = 1; header <= b; header++){
			System.out.print(header);
			System.out.print("\t");}

		System.out.println();

		int rows = a;

		for(int count = a; count <= b; count++){
			System.out.print(count);
			System.out.print("\t\t");
			for(int multiplcationTable = 1; multiplcationTable <= b; multiplcationTable++){
				System.out.print(multiplcationTable * rows);
				System.out.print("\t");		
}
			rows++;
			System.out.println();
}
}

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int from = input.nextInt();
		System.out.print("Enter ending number: ");
		int to = input.nextInt();

		MultiplicationTableFunction.multiplicationTableFromTo(from,to);
}
}
			
