package staticKeyword;

public class Block {

	{
		System.out.println("This is Non-Static Block");
	}
	
	static {
		
		System.out.println("This is a static block");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Hellow Static block..");
		Block b = new Block();
	}

}

