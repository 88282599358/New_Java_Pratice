package sach;
import java.io.*;
public class InheritanceInJava {

	//Inheritance and Single Inheritance
	//Base Class
	static class Base{
	public int x;
	
	public int getx()
	{
		return x;
	}
	
	public void setx(int x)
	{
		System.out.println("I am Base Class and Set x");
		this.x = x;
	}
	  public void printMe(){
	        System.out.println("I am a constructor");
	    }
	}
	
	//Derived Class
	static class Derived extends Base
	{
		public int y;
		public int gety()
		{
			return y;
		}
		
		public void sety(int y)
		{
			System.out.println("I am Derived Class and Set y");
			this.y = y;
		}
	}
	
	//2nd Base Class
	// Base or Super Class
	static class Employee
	{
		int salary  = 600000;
	}
	
	
	// Inherited or Sub Class
	static class Engineer extends Employee
	{
		int Benefits = 100000;
	}
	
	
	//Third Class
	static class one
	{
		public void print_something()
		{
			System.out.println("Hey!! I am Sachin");
		}
	}
	static class two extends one
	{
		public void print_again()
		{
			System.out.println("I am Learning Java");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bas = new Base();
		bas.setx(8);
		System.out.println(bas.getx());
		
		//We can only use Derived Class Also
		Derived der = new Derived();
		der.sety(7);
		System.out.println(der.gety());

		//2nd CLASS Objects
		   Engineer E1 = new Engineer();
	        System.out.println("Salary : " + E1.salary
	                           + "\nBenefits : " + E1.Benefits);
	        
	       //Third Class Objects
	        two g = new two();
	        g.print_something();
	        g.print_again();
	}

}


 
