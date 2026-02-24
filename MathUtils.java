package staticKeyword;

public class MathUtils {
	static int num = 4;
	public static void add() {
		num += 10;
		System.out.println("Addition : "+ num);
	}
	
	public static void multiply() {
		// here the last num value is 14 after addition 
		
		num *= 5;
		System.out.println("Multiplication : "+ num);
		// so after multiplication it will be 70 as answer as static gives the latest value.
		
	}
	
	// call the methods using the class name.

}
