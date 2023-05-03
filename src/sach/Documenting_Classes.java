package sach;

/**
 * This Class is Teach you about Java Documenting Classes 
 * @author Sachin
 * @version 2.1
 * @since 2022
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html"></a>
 * @param args These are argument supplied to the command line
 * */


// /***/:-- This is Java Doc Comment
// /**/:--  This is Comment
public class Documenting_Classes {

	/**
	 * This method is show you how to write function with example of sum of two number
	 * @param a This is First number to add
	 * @param b This is Second number to add
	 * @throws Exception if i is 0
	 * @deprecated This method is now deprecated
	 * */
	static public void add(int a,int b) throws Exception
	{
		if(a==0)
		{
			throw new Exception();
		}
		System.out.println("The adding of two number: " + (a+b));
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		add(7,9);
	}

}
