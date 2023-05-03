package sach;

import java.util.Date;

public class DateandTimeInJava {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("The Maximum value of Long is: " + Long.MAX_VALUE);
		System.out.println("The Value of Current time in ms: " + System.currentTimeMillis()/1000/3600/24/365);
		System.out.println("The Value of Current time in ms: " + System.currentTimeMillis()/1000/3600/24);
		System.out.println("The Value of Current time in ms: " + System.currentTimeMillis()/1000/3600);
		System.out.println("The Value of Current time in ms: " + System.currentTimeMillis()/1000);
	*/
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getMonth());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime());
		System.out.println(d.getTimezoneOffset());   
		/*If the user's time zone is ahead of UTC, the offset will be negative, and 
		 *  if it's behind UTC, the offset will be positive.
		 *  For example, if the user is in the Eastern Standard Time (EST) time zone (which is 5 hours behind UTC), 
		 * the offset returned by this code would be 300, because 5 hours * 60 minutes per hour = 300 minutes.*/
		System.out.println(d.getYear());   //year-1900
		System.out.println(d.getClass());
		
		
		
		
		
		
		
		
		
		
		Date d1 = new Date(2018,9,21);  
        Date d2 = new Date(2097,3,10);  
        System.out.println("Date 'd' is after Date 'd2' : "+d1.after(d2));   ///false
		
	}

}
