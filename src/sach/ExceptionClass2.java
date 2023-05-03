package sach;

import java.util.Scanner;  
import java.util.ArrayList;  
import java.util.Arrays;  
public class ExceptionClass2 {

	static class AlreadyExistException extends Exception
	{
		public AlreadyExistException (String message)    
	    {    
	        // calling parent Exception class constructor    
	        super(message);    
	    }    
	}
	
	static void checkExistence(ArrayList<String>language,String language1) throws AlreadyExistException
	{
		// use conditional statement to check the existence of the language  
		if(language.contains(language1))
		{
			// we throw AlreadyExistException when the language is already exist in the list  
			throw new AlreadyExistException(language1 + "is already exist in the list.");
		}
		else
		{
			language.add(language1);  
			 System.out.println(language1 + " is added to the ArrayList successfully.");  
			 for(int i=0;i<language.size(); i++ )
			 {
				 System.out.println(language.get(i));  	
			 }
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>language = new ArrayList<>(Arrays.asList("Java","Python","Kotlin"));
		Scanner scan = new Scanner(System.in);  
		// declare variable lang to store the user input  
        String lang;  
        System.out.println("Enter language to enter in the ArrayList:");  
        lang = scan.nextLine();
        
        scan.close();
        
        try
        {
        	// call method checkExistence() to check whether the language is already exist in the list or not  
        	checkExistence(language, lang);
        }
        catch(AlreadyExistException e)
        {
        	System.out.println("We found an excaption:");    
        	   
            // printing the message from AlreadyExistException object    
            System.out.println(e);  
              
        }
	}
}

/*In the above code, we create the custom exception AlreadyExistException. 
 * We take input from the user to add it in the languages ArrayList. 
 * We call the checkExistence() method by passing the user input and the languages ArrayList to it. 
 * The checkExistence() method checks whether the given language is available in the languages ArrayList or not. 
 * The method throws AlreadyExistException when it finds the user input language in the languages ArrayList.
 * The catch block in the main() method will handle this Exception and print the detailed message of the Exception. 
 * If the checkExistence() method doesn't find the given language in the languages ArrayList,
 * it will add the user input language in the languages ArrayList.
 */

