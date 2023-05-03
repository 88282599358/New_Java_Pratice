
public class d2 {

	public static void main(String[] args) {
	       String name = "Sachin";
			int value = name.length();
			String value = name.toUpperCase();
			String value = name.toLowerCase();
	 		String value = name.substring(0);
	 		System.out.println(value);

	         String value = name.substring(1,5);
	 		System.out.println(value);

	         String value = name.replace("hin","oper");
	 		System.out.println(value);

	         String value = name.startsWith("Sa");
	 		System.out.println(value);
			String value = name.endswidth("in");
			System.out.println(value);
			
			// if indexOf didn't get same value it will return -1
		    String txt = "Please locate where 'locate' occurs!";
		    System.out.println(txt.indexOf("locate"));
			
		    String txt = "Please locate where 'locate' occurs!";
		    System.out.println(txt.indexOf("locate",7));
		
		    //lastIndexOf
			String value = name.lastIndexOf("a");
			System.out.println(value);
			
			// Here there is i and 2 means find i from index 2 from last
			String value = name.lastIndexOf("i",2);
			System.out.println(value);
			
			String value = name.equals("Sachin");
			System.out.println(value);
			
			String value = name.equalsIgnoreCase("SacHIn");
			System.out.println(value);
		
		
		 String name1 = "		Sachin	";
	     System.out.println(name1);
	     String value1 = name1.trim();
	     System.out.println(value1);
		
	     //Escape Sequence
	     System.out.println("Hello I am \n Escape Sequence");
	     System.out.println("Hello I am \t Escape Sequence");
	     System.out.println("Hello I am \' Escape Sequence");
	     System.out.println("Hello I am \" Escape Sequence");
	     System.out.println("Hello I am \\ Escape Sequence");
    }
	}
