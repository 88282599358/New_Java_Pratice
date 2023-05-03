package sach;

import java.time.LocalDate;
import java.time.*;
import java.time.Clock;

public class JavaTimeAPI_in_Java {
	//Source CWH website   v no 100
	public static void main(String[] args) {
		// Current Date
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        LocalDate ld1 = LocalDate.parse("2021-05-27");
        LocalDate ld2= LocalDate.parse("2021-05-26");
        LocalDate ld3= LocalDate.parse("2021-05-26");

        System.out.println(ld2.equals(ld1));
        System.out.println(ld3.equals(ld2));
        System.out.println(ld1.withYear(2001));
		
		Clock cl = Clock.systemDefaultZone();
		System.out.println(cl);
		
		Duration d1 = Duration.between(LocalTime.MIN , LocalTime.NOON);	
		System.out.println(d1.isNegative());	////LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00' 
		
		Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);		
		System.out.println(d2.isNegative());	////LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
		
		
		Duration d3 = Duration.between(LocalTime.MIN , LocalTime.MIDNIGHT);
		System.out.println(d3.isZero());	//LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
		
		Duration d4 = Duration.between(LocalTime.MAX , LocalTime.MIN);
		System.out.println(d4.isZero());	 //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
