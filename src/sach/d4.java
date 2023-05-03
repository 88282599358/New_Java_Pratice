
public class d4 {

	public static void main(String[] args) {
		//Pratice Problem 1
        int n = 4;
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        
        //Pratice Problem 2
        // First 4 even numbers are - 0 2 4 6
        int sum = 0;
        int n = 4;
        int i=0;
        while(i<n){ 
        sum = sum +(2*i);
        i++;
        }
        System.out.print("Sum of Even Number is :");
        System.out.print(sum);
        
        
        
      //Pratice Problem 3
        int n = 5;
        for(int i=0;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n ",n,i,n*i);
        }
        
        
      //Pratice Problem 4
        int n = 10;
        for(int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d = %d\n ",n,i,n*i);
        }
        
        
        //Pratice Problem 6
        int n = 5
        int i = 1;
        int factorial = 1;
        while(i<=5) {
        	factorial *= i;
        	i++;
        }
        System.out.print(factorial);
        
        
        //Problem 9
        int n = 8;
        int sum = 0;
        for(int i=0;i<=10;i++)
        {
            sum += n*i;
        }
        
        System.out.print(sum);
        
        
        
        
        
	}

}




