package sach;

import java.util.*;

public class CalenderInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The calendar class in java provides the methods that helps in converting date between a specific instant in time.
			It is an abstract class.
			Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
			We use the static method Calender.getInstance() in order to implement a sub-class.*/

		
//		Calendar c =  Calendar.getInstance();
//		System.out.println(c.getCalendarType());  //gregory:- Apna Normal Calendar
//		System.out.println(c.getTimeZone());  
		
		
		
//		Calendar c =  Calendar.getInstance();
		Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//		Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));

		System.out.println(c.getCalendarType());  //gregory:- Apna Normal Calendar
		System.out.println(c.getTimeZone());  
		System.out.println(c.getTimeZone().getID());  
		
	}

}
