
public class Patterns3{

		public static void main(String[] args){
		int number = 1;
		int number2 = 1;

		for(int counter = 6; counter > 0; counter--){
			if(counter==5){
			System.out.print("	");}
			else if(counter==4){
			System.out.print("		");}
			else if(counter==3){
			System.out.print("			");}
			else if(counter==2){
			System.out.print("				");}
			else if(counter==1){
			System.out.print("					");
			}

			System.out.printf("%d	", number);

			if(counter <= 6){
			
			for(int counter1 = 1; counter1 < counter ; counter1++){

			System.out.printf("%d	", ++number2);
			
			}
			
			}
			
			
			
			number2 = 1;
			System.out.println();}
			
			


}
	
}
