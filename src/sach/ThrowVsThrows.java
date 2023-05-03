package sach;

public class ThrowVsThrows {

	/*
	 * throws:- It state that method can be throw error
	 * throw:- It throw an exception explicit by the programmers
	 * */
	//Eg2 
	static class NegativeRadiusException extends Exception
	{
		@Override
		public String toString()
		{
			return "Radius Cannot be Negative";
		}
		
		@Override
		public String getMessage()
		{
			return "Radius Cannot be Negative";
		}
	}
	
		public static double area(int r) throws NegativeRadiusException
		{
			if(r<0 && r==0)
			{	
				throw new  NegativeRadiusException();
			}
			double  result = Math.PI*r*r;
			return result;
		}
	//Eg 1
	public static int divide(int a, int b) throws ArithmeticException 
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Eg 1
		try
		{
			int c = divide(8,2);
			System.out.println(c);	
			
			 double ar = area(-6);
	         System.out.println(ar);
		}
		catch(Exception e)
		{
			System.out.println("Exception in Program");	
		}
	}

}
