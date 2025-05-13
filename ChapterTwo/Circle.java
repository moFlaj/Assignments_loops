import java.util.Scanner;

public class Circle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = input.nextInt();

		int diameter = 2 * radius;
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * (radius * radius);

		System.out.printf("Diameter is %d%n", diameter);
		System.out.printf("Circumference is %f%n", circumference);
		System.out.printf("Area is %f%n", area);


	}
}