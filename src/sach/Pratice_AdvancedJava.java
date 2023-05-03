package sach;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Pratice_AdvancedJava {

	public static void main(String[] args) {
		/* Q1 Create an ArrayList and store the names of ten students inside it. Print it using a for each loop. */
		
		ArrayList<String> ar = new ArrayList();
		ar.add("Student 1");
		ar.add("Student 2");
		ar.add("Student 3");
		ar.add("Student 4");
		ar.add("Student 5");
		ar.add("Student 6");
		ar.add("Student 7");
		ar.add("Student 8");
		ar.add("Student 9");
		ar.add("Student 10");
		for(String ele :ar)
		{
			System.out.println(ele);
		}
		
		/*Q2 Use the Date class in Java to print the time in the following format : 21:47:02.*/
		Date d = new Date();
		System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
		
		
		/*Q3 Repeat question number 2 using the Calendar class.*/
		Calendar cl = Calendar.getInstance();
		System.out.println("The current Time: " 
		+ cl.get(Calendar.HOUR) + ":" + cl.get(Calendar.MINUTE) + ":" + cl.get(Calendar.SECOND) + ":" + cl.get(Calendar.MILLISECOND));
		
		
		/*Q4 Repeat question number 2 using java.time API.*/
		LocalTime lt = LocalTime.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("H:m:s");
		String st = dt.format(lt);
		System.out.println(st);
		
		
		/*Q5 Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.*/
		
		HashSet <Integer> myhs = new HashSet();
		myhs.add(8);
		myhs.add(7);
		myhs.add(4);
		myhs.add(9);
		myhs.add(5);
		myhs.add(6);
		myhs.add(8);
		System.out.println(myhs);
		
		
		
		
	}

}
