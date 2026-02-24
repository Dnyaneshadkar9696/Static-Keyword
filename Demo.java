package staticKeyword;

public class Demo {
	
	static String name = "Ganesh";
	int age = 23;
	
	public static void showMessage() {
		System.out.println("Hellow Welcome to Maval Agro...");
		
		System.out.println("My name is  : "+ name);
		
//		System.out.println("Age : "+ age);
		// we cannot take the non-static field in the static enviornment.
		
		
	}

}
