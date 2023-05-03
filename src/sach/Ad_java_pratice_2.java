package sach;

import java.io.FileWriter;
import java.io.IOException;

// Q1 Create a class and a method with deprecated annotation. What is its effect on program execution?
	class MyDeprecated
	{
		@Deprecated
		void meth1()
		{
			System.out.println("I am Deprecated");
		}
	}
	
	// Q3 Create an interface and generate an instance from it.
	interface MyInt
	{
		void display();
	}
public class Ad_java_pratice_2 {

	
	
	public static void main(String[] args) {
		// Q1
		//Q2 Suppress the warning generated in question number 2.
		@SuppressWarnings("Deprecated")
		MyDeprecated myd = new MyDeprecated();
		myd.meth1();
		
		
		//Q3
		MyInt i = () ->{
			System.out.println("I am Interface");
		};
		i.display();
	
		
		
		//Q4 System.out.println("I am Deprecated");
		int t = 19;
		String table = "";
		for(int j = 0; j<10; j++)
		{
			table+= t + "X" +(j+1) + "=" + t*(j+1);
			table += "\n";
		}
		
		try
		{
			FileWriter myfile = new FileWriter("Mutli.txt");
			myfile.write(table);
			myfile.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
 	}

}
