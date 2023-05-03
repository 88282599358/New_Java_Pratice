package sach;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone; 
public class GregorianCalendarClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal = new GregorianCalendar();
		
		//Leap year or not
//		System.out.println(cal.isLeapYear(2006));
//		System.out.println(cal.isLeapYear(2004));
	
	/*	System.out.println("Date Before Rolling: " +cal.getTime());
		//Here it means that if value is true then one month ahead of current month and it is false then one month before current month
		cal.roll(Calendar.MONTH, true);
		cal.roll(Calendar.DATE, false);
        cal.roll(Calendar.YEAR, true);
		System.out.println("Date After Rolling:" +cal.getTime());
	
		*/
		
		//HashCode()
		Calendar cal1  = Calendar.getInstance();
		System.out.println("The current Time: " + cal1.getTime());
		System.out.println("Hash Code: " + cal1.hashCode());
		
		
		//Printing TimeZone
		System.out.println(TimeZone.getAvailableIDs(0));
		System.out.println(TimeZone.getAvailableIDs(1));
		System.out.println(TimeZone.getAvailableIDs(0));
	}

}
