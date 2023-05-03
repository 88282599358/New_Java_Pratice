import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Taking data from user: ");
        Scanner sc = new Scanner(System.in);
        //Int
        // System.out.println("Enter number1: ");
        // int a = sc.nextInt();
        // System.out.println("Enter number2: ");
        // int b = sc.nextInt();
        // System.out.println(a + b);
        
        //Float
        // System.out.println("Enter number1: ");
        // float a = sc.nextFloat();
        // System.out.println("Enter number2: ");
        // float b = sc.nextFloat();
        // System.out.println(a + b);
        
        
        //String
        System.out.println("Enter Name1: ");
        // String a = sc.next();
        String a = sc.nextLine();
        System.out.println("Enter Name2: ");
        // String b = sc.next();
        String b = sc.nextLine();
        System.out.println(a + b);
        
        
        //It check that user is given value or not
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}