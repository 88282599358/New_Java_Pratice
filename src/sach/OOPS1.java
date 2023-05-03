package sach;

public class OOPS1 {

	static class Employee {
		int id;
		float salary;
		String name;
		public void employeedetails()
		{
			System.out.println("My id is: " + id);
			System.out.println("My name is: " + name);
			System.out.println("My Salary is: " + salary);
		}
	}

	static class MyClass{
		static String name;
		static float price;
		
		static void set(String n, float p)
		{
			name = n;
			price = p;
		}
		
		static void get()
		{
			System.out.println("Software name is: " + name);
			System.out.println("Software Price is: " + price);
		}
	}
	public static void main(String[] args) {
		Employee Myobj = new Employee();   // Instantiating a new Employee Object
		Employee Myobj1 = new Employee();   // Instantiating a new Employee Object
		
		// Setting Attributes for Mohit
		Myobj.id = 12;
		Myobj.name = "Mohit";
		Myobj.salary = 35.23f;
		
		// Setting Attributes for Rohit
		Myobj1.id = 15;
		Myobj1.name = "Rohit";
		Myobj1.salary = 39.23f;
		
		//After Creating Method in Class
		
		Myobj.employeedetails();
		Myobj1.employeedetails();
		
		//When we didn't write method in class So we have to print like this
	/*	System.out.println(Myobj.id);
		System.out.println(Myobj.name); */
		
		
		//Another Class
		MyClass.set("Visual Studio", 0.0f);
		MyClass.get();
	}
}



