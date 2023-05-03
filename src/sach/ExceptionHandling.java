package sach;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		// Syntax Error
	/*	int a = 8;
		System.out.println("The sum of a+b is :" a+b) */
		
		//Logical Error
	/*	 // Write a program to print all prime numbers between 1 to 10
		 System.out.println(2);
		for(int i=1;i<5;i++)
		{
			 System.out.println(2*i+1);
		}  
		//Output:- 2,3,5,7,9 and 9 is not a prime Number
		 */
		 
		
		//Runtime Error
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		k = sc.nextInt();
		System.out.println("1000/k: "+ 1000/k);  
		

	}

}
