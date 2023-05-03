package sach;

public class Method {

	// Define a class
	static public class MyClass{
		// Define instance variables
		private int Number;
		private String Name;
		
		// Define accessor (getter) methods
		public int getnumber()
		{
			return Number;
		}
		public String getname()
		{
			return Name;
		}
		
		// Define mutator (setter) methods
		
		public void setNumber(int Number)
		{
			this.Number = Number;
		}
		
		public void setName(String Name)
		{
			this.Name = Name;
		}
		
		
		// Define other methods
		public void printdetails()
		{
			System.out.println("Number is: "+Number);
			System.out.println("Name: " + Name);
		}
	}
	
	//Another Class
	
	static public class Add
	{
		int sum = 0;
		
		public int addTwoInt(int a, int b)
		{
			sum = a+b;
			System.out.println("Sum is:"+sum);
			return sum;
		}
	}
	
	
	public static void main(String[] args) {
//		Method method = new Method();
//		Method.MyClass myobj = method.new MyClass();
		
		
	/*	MyClass myobj = new MyClass();
		myobj.setNumber(125);
		myobj.setName("Sachin");
		myobj.printdetails();  */
		
		//Method
		Add myadd = new Add();
		 myadd.addTwoInt(5,9);
		 
		
		
	}

}
