package sach;

import java.io.*;
public class FinallyBlock {

	public static int greet()
	{
		try{
			int value1 = 50;
			int value2 = 6;
			int division = value1/value2;
			return division;
		}
		catch(Exception e)
		{
			System.out.println("I am an Exception " + e);
		}
		finally
		{
			System.out.println("I am Finally");
		}
		return -1;
	}
	public static void main(String[] args) {
		//FROM GFG & javaTpoint for Notes &CWH
		
		//1
		int result = greet();
		System.out.println(result);
		
		//2
		int val1 = 50;
		int val2 = 5;
		while(true)
		{
			try
			{
				int division = val1/val2;
				System.out.println("Result is: " +division);
			}
			catch(Exception e)
			{
				System.out.println("I am Exception" + e);
				break;
			}
			
			finally
			{
				System.out.println("Exception ho ya na ho phir bhi run hone ka gamand hai");
			}
			
			val2--;
		}
		
		
		//3 without catch
		try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }
		
		
		
		
		// Case 1: When an exception does not rise 
//		In this case, the program runs fine without throwing any exception and finally block execute after the try block.
		
	/*	try
		{
			System.out.println("I am in try Block");
			System.out.println(36/6);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("\"finally : i execute always.\"");
		}
		*/
		
		
		
		//Case 2: When the exception rises and handled by the catch block
		//In this case, the program throws an exception but handled by the catch block, and finally block executes after the catch block.
		
	/*	try
		{
			System.out.println("I am in try Block");
			System.out.println(36/0);
			
		}
		catch(Exception e)
		{
			System.out.println("catch : exception handled.");
			System.out.println(e);
		}
		finally
		{
			System.out.println("\"finally : i execute always.\"");
		}  */
		
		
		//Case 3: When exception rise and not handled by the catch block 
		/*In this case, the program throws an exception but not handled by catch 
		 * so finally block execute after the try block and after the execution of finally block program terminate abnormally, 
		 * But finally block execute fine.*/
		
		/*try
		{
			System.out.println("I am in try Block");
			System.out.println(36/0);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("catch : exception handled.");
			System.out.println(e);
		}
		finally
		{
			System.out.println("\"finally : i execute always.\"");
		} 
		System.out.println("I want to run");  */
	}

}
