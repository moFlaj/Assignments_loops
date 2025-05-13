import java.util.Scanner;
 
public class Even{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter set of integers: ");
	int a = input.nextInt();
	int b = input.nextInt();

int even1 = 0; 
int odd1 ; 

if (a%2==0 )
even1 = a;
System.out.printf("%d", even1);


if (a%2!=0)
odd1 = a;
System.out.printf("%d", odd1);


int even2= 0;
int odd2=0;

if (b%2==0)
even2 = b;
System.out.printf("%d", even2);


if (b%2!=0)
odd2 = b;
System.out.printf("%d",odd2);

}
}
