package staticKeyword;

public class Controller {
	
	public static void main(String[] args) {
		
		
		// using static keyword we can access the satic members using class name or the interface name
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println(s1.collegeName);
		System.out.println(s2.collegeName);
		System.out.println(Student.collegeName); // i can also do like this
		
		// This prints same college name as for one object the name changes it will change for all
		System.out.println();
		
		Demo.showMessage(); 
		// we called the method using the class name
		
		System.out.println();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
	 // as many objets the equal the count means it is increasing
		
		// we call the constructor 3 times so the  1 2 3 values got printed
		System.out.println();
		// calling methods using the class name

		MathUtils.add();
		MathUtils.multiply();
		// we can call the method using the object
		// but here we used the static int so it is dependent and we need to call is only using the class name
		
		// suppose methods are not dependent on static int then we can call.
		
		System.out.println();
		
		
		
	}

}
