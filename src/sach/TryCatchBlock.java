package sach;

public class TryCatchBlock {

	public static void main(String[] args) {
		int a = 9500;
		int b = 0;
		//Without Try
//		int c = a/b;
//		System.out.println("The result is " + c);
		
		
		//Without Try
		try
		{
			int c = a/b;
			System.out.println("The result is " + c);
		}
		catch(Exception r)
		{
			System.out.println("We failed to Divide: ");
			System.out.println(r);
		}
		
	}

}
