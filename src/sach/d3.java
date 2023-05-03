
public class d3 {

	public static void main(String[] args) {
		
		//Break with For Loop
		 for(int i=0;i<10;i++)
			{
				System.out.println(i);
				System.out.println("\n");
				System.out.println("Java is Secure");
				if(i==7){
				    System.out.println("Ending the Loop");
				    break;
				}
			}			
		
		
		//With While loop
				int i = 0;
				while(i<10)
				{
					System.out.println(i);
					System.out.println("\n");
					System.out.println("Java is Secure");
					if(i==7){
					    System.out.println("Ending the Loop");
					    break;
					}
					i++;
		    }
		
		
		
		//With do while Loop
		int i =0;
		do {
			System.out.println(i);
			System.out.println("\n");
			System.out.println("Java is Secure");
			if(i==7){
			    System.out.println("Ending the Loop");
			    break;
			}
			i++;
			}while(i<10);
		
		
		
		//Continue Statement with for Loop
		for(int i=0;i<10;i++)
		{
			if(i==7){
			    System.out.println("Ending the Loop");
			    continue;
			}
			System.out.println(i);
			System.out.println("Java is Secure");
			System.out.println("\n");
		}
		
		//Continue Statement with do-while Loop
		int i =0;
		do {
		    i++;
			if(i==7){
			    System.out.println("Ending the Loop");
			    continue;
			}
			System.out.println(i);
			System.out.println("Java is Secure");
			System.out.println("\n");
			
			}while(i<10);
		
		}
	}

