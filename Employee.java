package staticKeyword;

public class Employee {
	
	static int count = 0;
	
	Employee(){
		
	   if(count <= 10) {
		   count++;
	   }
	   else {
		   return;
	   }
	   
	   System.out.println(count);
	}

}
