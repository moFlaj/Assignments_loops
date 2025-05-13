public class RaisePower{

		public static void main(String[] args){

		int number = 1;
		int raise = 2;
		int powerValue = 0;
		System.out.println("a	b	pow(a,b)");
		while(number<=5){
		powerValue = (int)Math.pow(number, raise);
		System.out.printf("%d	%d	%d%n", number, raise, powerValue);
		raise++;
		number++;}
	}
}