package sach;

public class Abstract_ClassandMethods {

	static abstract class MyParent
	{
		public MyParent()
		{
			System.out.println("I am Abstarct Parent Class Constructor");
		}
		
		abstract public void concrate1();
		abstract public void concrate2();
	}
	
	static class MyChild extends MyParent
	{
		@Override
		public void  concrate1(){
			System.out.println("I am Concrete1");
		}

		@Override
		public void concrate2() {
			System.out.println("I am Concrete2");
		}
		
	}
	abstract class MyChild2 extends MyParent{
	    public void th(){
	        System.out.println("I am good");
	    }
	}
	
	//Pratice 2
	abstract static class SunStar
	{
		abstract void printInfo();
	}
	
	static class Employee extends SunStar
	{
		void printInfo() {
			String name = "Virat";
			int age = 25;
			float salary = 25.22f;
			
			System.out.println(name);
	        System.out.println(age);
	        System.out.println(salary);
	  
		}
		
	}
	
	
	//Pratice 3
	abstract static class B 
	{
		abstract static class C
		{
			abstract void abstractInfo();
		}
	}
	static class D extends 	B			//if to use Class C(INNER) in (Outer) class sach.Abstract_ClassandMethods.B.C
	{
		static class E extends C
		{
			void abstractInfo()
			{
				System.out.println("Inside abstract method implementation");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyParent my = new MyParent();   //Error: Because We can't make Object of Abstract Class
		MyChild mc = new MyChild();
		mc.concrate1();
		mc.concrate2();
//		MyChild2 mc2 = new MyChild2(); -- error
		
		
		//Pratice 2
		SunStar ss  = new Employee();
		ss.printInfo();	
		
		
		//Pratice 3
		D outer  = new D();
		D.E inner = new D.E();
		inner.abstractInfo();
	}

}
