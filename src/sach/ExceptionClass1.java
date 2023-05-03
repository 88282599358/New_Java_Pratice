package sach;
import java.util.*;  
public class ExceptionClass1 {
	
	static class InvalidAgeException extends Exception
	{
		public  InvalidAgeException(String Message)
		{
			super(Message);
		}
	}
	
	static void CheckEligibility(int age) throws  InvalidAgeException
	{
		if(age<18)
		{
			throw new  InvalidAgeException("You are not Eligible for Exam");
		}
		else
		{
			System.out.println("You are Eligible for Exam");
		}
	}
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);  
		 int age;
		  System.out.println("Enter your age:");    
		 age = scan.nextInt();
		 scan.close();
		 
		 try
		 {
			 CheckEligibility(age);
		 }
		 catch(InvalidAgeException e)
		 {
			  System.out.println("We found an excaption:");    
			  System.out.println(e);    
		 }
	}

}
/* In the above code, we create a custom exception, InvalidAgeException. 
 * We take input from the user for checking whether the user is eligible for the exam or not. 
 * We call the checkEligibility() method by passing the user input to it. 
 * The checkEligibility() method checks whether the given age is greater than 18 or not because a user having age 18+ is eligible for the exam.
 * The method throws InvalidAgeException when it finds an age less than 18. 
 * The catch block in the main() method will handle this Exception and print the detailed message of the Exception.*/
