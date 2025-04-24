public class Patterns2{

		public static void main(String[] args){

		int number;

		for(int counter = 1; counter <= 6; counter++){
		
			number = counter;
			if(counter == 1){
				System.out.print("					");}
			else if(counter == 2){
				System.out.print("				");}
			else if(counter == 3){
				System.out.print("			");}
			else if(counter == 4){
				System.out.print("		");}
			else if(counter == 5){
				System.out.print("	");}
			else if(counter == 6){
				System.out.print("");}
			
			
			for(int counter1 = 0; counter1 < counter ; counter1++){

			System.out.printf("%d	", number--);

			
			}
			System.out.println();

			}
			
			
			


}
	
}
