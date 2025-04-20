import java.util.Scanner;

public class NumberFactorial{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter any number to check factorial: ");		
int number = input.nextInt();
	
int i = number - 1;

int total = number;

while (i < number) {

total = total * i;
--i;

if(number == 1){
total = number;
System.out.printf("%d factorial is %d%n", number, total);
System.out.print("Enter any number to check factorial: ");
number = input.nextInt();
total = number;
i = number - 1;
}


if(i == 0){
System.out.printf("%d factorial is %d%n", number, total);
System.out.printf("Enter any number to check factorial: ");
number = input.nextInt();
total = number;
i = number - 1;}

if(number <= 0){
System.out.println("Enter valid input");
break;}


}
	
			
	}
}
