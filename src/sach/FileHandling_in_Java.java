package sach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileHandling_in_Java {

	public static void main(String[] args) {
		
//		System.err.println("error message");  
		
//		Creating File 
		File myfile = new File("filehand.txt");
		try {
			myfile.createNewFile();
			System.out.println("File Created Successfully");
		}
		catch(IOException  e)
		{
			e.printStackTrace();
		}
		

		
		//Writing in File
		/*	try {
			FileWriter filewr = new FileWriter("filehand.txt");
			filewr.write("I am the Devil of my Life \n Lion is the King of Jungle");
			filewr.close();
		
			}
			catch(IOException  e)
			{
				e.printStackTrace();
				System.err.println("Error Hai Bhai");
			}
			*/
			
			//Reading a file Eg 1
		/*	File myfile = new File("filehand.txt");
			try
			{
				Scanner sc = new Scanner(myfile);
				while(sc.hasNext())
				{
					String Line= sc.nextLine();
					System.out.println(Line);
				}
				sc.close();
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			*/
		
			//Example 2
		/*	try {
				FileReader filewr = new FileReader("filehand.txt");
				BufferedReader buf = new BufferedReader(filewr);
				String Line;
				while((Line=buf.readLine()) != null)
				{
					System.out.println(Line);
				}
				
				buf.close();
			}
			catch(IOException e)
			{
				System.out.println("Error Reading File: " +e.getMessage());
			}
			
			*/
			
			/*
			 In this code, we create a FileReader object that reads data from the file "file.txt"
			   using the constructor that takes a file name as a parameter. 
	 Then we create a BufferedReader object that wraps the FileReader object and provides buffering and efficient reading of data.
		
		We use the readLine method of the BufferedReader object to read each line of the file and store it in the line variable. 
		The readLine method returns null when the end of the file is reached. 
		Therefore, we use the while loop to read all the lines of the file.
		
		Inside the loop, we print each line to the console using the println method of the System.out object. 
		Finally, we close the BufferedReader object to release the resources.
		
		Note that we use a try-catch block to handle the IOException that might occur during file handling,
		 such as file not found or file access denied.
		 */
			
			
			
			//Delete a file
	/*	File myfile = new File("filehand.txt");
		if(myfile.delete())
		{
			System.out.println("I have deleted: " +myfile.getName());
		}
		else {
			System.out.println("Some Error Occured in File Deletetion ");
		}
		*/
		
		
		
		
		
		
		
	}

}
