package sach;

import java.util.Scanner;

public class ExceptionClass {

	static class MyException extends Exception
	{
		@Override
		public String toString()
		{
//			return super.toString() + " I am toString()";
			return  " I am toString()";
		}
		
		@Override
		public String getMessage()
		{
//			return super.getMessage() + " I am getMessage()";
			return " I am getMessage()";
		}
	}
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		i = sc.nextInt();
		if(i<99)
		{
			try {
//			throw new MyException();
//				throw new ArithmeticException("I am Arithmetic Exception");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.toString());   //-----| --> Same 
				System.out.println(e);				//-----|
				e.printStackTrace();
				System.out.println("I am Proper");   //-----| --> Same 
				
			}
		}
		System.out.println("Bilkul Proper");    
		
	}

}
