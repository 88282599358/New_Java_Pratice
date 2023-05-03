package sach;
import java.util.*;

public class PraticeOnExceptionHandling {

	public PraticeOnExceptionHandling() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args, Object String) {
		// 1) Write a java program to demonstrate syntax, logical 2 runtime errors.
		
//		int a = 06   //--Syntax Error
	
//		int age = 50;
//		int born_y = 2000; //Logical Error
		
//		System.out.println(500/0);  //Runtime Error

		
		
		//2) Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
		
		/*try 
		{
			int val1 = 666/9;
		}
		catch(ArithmeticException AE)
		{
			System.out.println("HaHa");
		}
		catch(IllegalArgumentException IA)
		{
			System.out.println("HeHe");  //Not show output
			
		}  */
		
		//3) Write a program that allows you to given. If max retries exceed 5 print "errors".
		
	/*	boolean flag = true;
		int [] marks = new int[3];
		marks[0] = 5;
		marks[1] = 45;
		marks[2] = 54;
		Scanner scan = new Scanner(System.in);
		int index;
		int i=0;
		while(flag && i<5)
		{
			try {
			System.out.println("Enter the value: ");
			index = scan.nextInt();
			System.out.println("The value at index is: " + marks[index]);
			break;  //break the loop if condition is satisfy
			}
			catch(Exception e)
			{
				System.out.println("Invalid Syntax");
				i++;	
			}
		}
		if(i>5)
		{
			System.out.println("Error");
		}   */
		
		
		//4) Modify program in Q3 to throw a custom Exception if max retries are reached
		boolean flag = true;
		int [] marks = new int[3];
		marks[0] = 5;
		marks[1] = 45;
		marks[2] = 54;
		Scanner scan = new Scanner(System.in);
		int index;
		int i=0;
		while(flag && i<5)
		{
			try {
			System.out.println("Enter the value: ");
			index = scan.nextInt();
			System.out.println("The value at index is: " + marks[index]);
			break;  //break the loop if condition is satisfy
			}
			catch(Exception e)
			{
				System.out.println("Invalid Syntax");
				i++;	
			}
		}
		
	}

}
