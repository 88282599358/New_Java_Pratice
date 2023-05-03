package sach;

import java.util.*;
public class SpecificException {

	public static void main(String[] args) {
		int []marks = new int[3];
		marks[0] = 4;
		marks[1] = 89;
		marks[2] = 78;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Index Number: ");
		int ind = sc.nextInt();
		
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		try
		{
			System.out.println("Array Index is: " + marks[ind]);
			System.out.println("array-value/number is: " + marks[ind]/num);
		}
		catch(ArithmeticException e)
		{
			System.out.print("ArithmeticException Occured ");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("ArrayIndexOutOfBoundsException Occured ");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.print("Some Error Occured ");
			System.out.println(e);
		}
	}

}
