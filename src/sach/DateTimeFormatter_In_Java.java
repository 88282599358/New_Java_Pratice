package sach;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
public class DateTimeFormatter_In_Java {

	public static void main(String[] args) {
		// Source https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		LocalDateTime dt =  LocalDateTime.now();
		System.out.println(dt);
		
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy	H:0M --a --E --G --y M/L **F");  //--E week of days -- is nothing
		String myd = dt.format(df);
		System.out.println(myd);
		
		DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		String myd1 = dt.format(df1);
		System.out.println(myd1);
		
		
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
		String myd2 = dt.format(df2);
		System.out.println(myd2);
		
		
		ZonedDateTime zdt = ZonedDateTime.now();
		DateTimeFormatter df3 = DateTimeFormatter.ISO_ZONED_DATE_TIME;
		String myd3 = zdt.format(df3);
		System.out.println(myd3);
	}
 
}
