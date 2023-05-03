package sach;
import java.io.*;

public class InheritanceInInterfaces {

	interface sampleInterface
	{
		void method1();
		void method2();
	}
	
	//interface childSampleInterface extends sampleInterface:- only done in interface not in class
	interface childSampleInterface extends sampleInterface
	{
		void method3();
		void method4();
	}
	
	static class MySampleClass implements childSampleInterface
	{
		 @Override
		public void method1()
		{
			System.out.println("This is Method 1");
		}
		 @Override
		public void method2(){
			System.out.println("This is Method 2");
		}
		 @Override
		public void method3(){
			System.out.println("This is Method 3");
		}
		 @Override
		public void method4(){
			System.out.println("This is Method 4");
		}
	}
	
	static class Person
	{
		int id;
		String name;
		void set_person()
		{
			try {
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Enter the Id: ");
				id = Integer.parseInt(br.readLine());
				System.out.println("Enter the Name: ");
				name = br.readLine();
			}
			catch(Exception Ex)
			{
				Ex.printStackTrace();
			}
			
		}
		void disp_person()
		{
			System.out.println(id  +"\t" + name + "\t");
		}
	}
	
	static class Employee extends Person
	{
		int sal;
		String designation;
		void set_employee()
		{
			try {
				set_person();
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Enter the Designation: ");
				designation = br.readLine();
				System.out.println("Enter the Salary: ");
				sal = Integer.parseInt(br.readLine());
			}
			catch(Exception Ex)
			{
				Ex.printStackTrace();
			}
			
		}
		void disp_employee()
		{
			disp_person();
			System.out.println(designation + "\t" + sal);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySampleClass sc = new MySampleClass();
		sc.method1();
		sc.method2();
		sc.method3();
		sc.method4();
		
		Employee e1 = new Employee();
		e1.set_employee();
		e1.disp_employee();

	}

}
