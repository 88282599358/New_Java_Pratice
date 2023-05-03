//package ;
public class d5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 1. Declaration and memory allocation
//	       int[] marks = new int[5];
//	       
//	       // 2. Declaration and then memory allocation
//	       int[] marks;
//	       marks = new int[5];
//	       //Initialization
//	       marks[0] = 86;
//	       marks[1] = 96;
//	       marks[2] = 95;
//	       marks[3] = 98;
//	       marks[4] = 87;
//	         System.out.print(marks[1]);
//	        
////	         3. Declaration, memory allocation and initialization together
//	         int [] marks = {98, 45, 79, 99, 80};
//	         System.out.print(marks[1]);

		
		//Finding Length of array
		int [] marks = {98, 45, 79, 99, 80};
		float [] fmarks = {98.3f, 45.59f, 79.58f, 99.645f, 80.258f};
		System.out.print(marks.length);
		System.out.print(fmarks.length);
		

        String[] smarks = {"Sachin","King","Mr.360","Mahi"};
        System.out.print(smarks.length);
        System.out.print(smarks[2]);
        
        
        
        //Array Traversal
        int [] marks = {98, 45, 79, 99, 80};
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        
        for(int i=marks.length -1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
        
        
        
        // Quick Quiz: Displaying the Array (for-each loop)
        int [] marks = {98, 45, 79, 99, 80};
        System.out.println("Printing using for-each loop");
        for(int element: marks)
        {
            System.out.println(element);
        }

	}

}
