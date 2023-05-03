package sach;
import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        while(true) {
	        System.out.println("Enter the value of index: ");
	        int ind = sc.nextInt();
	        
	        try {
	        	System.out.println("Welcome to Nested TRY-CATCH BLOCK");
	        	
	        	try {
	        		System.out.println(marks[ind]);
	        		 flag = false;
	        	}
	        	catch(ArrayIndexOutOfBoundsException  e)
	        	{
	        		System.out.println("Soory this Index is not exist");
	        	}
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Exception in Level 1");
	        	
	        }
        }
        
	}
}
