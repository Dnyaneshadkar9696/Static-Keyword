package staticKeyword;

public class OuterClass {
	
	
	
	public static void main(String[] args) {
		OuterClass.Inner e = new OuterClass.Inner();
		e.table();
	}
	
	public static class Inner{
		
		
		public void table() {
			int a = 5;
			for(int i = 1; i <= 10; i++) {
				System.out.println(a + "*" + i + " = " + (a *i));
			}
		}
		
		
		
		
		
		
	}

}
