package sach;

public class Constructor_in_Inheritance {

	//Where there is no parameter use this no parameter in Derived Class
	static class Base1
	{
	
		Base1()
		{
			System.out.println("I am Base Class Constructor!!");
		}
		Base1(int p)
		{
			System.out.println("I am Base Class Constructor with value of p:"+ p);
		}
		
		Base1(int j,int k)
		{
			System.out.println("I am Base Class Constructor with value of J=:"+ j +" & "+ k);
		}
		
	}
	
	static class Derived1 extends Base1
	{
		Derived1(){
//			super(8);
//			super(1,2);
			System.out.println("I am Derived Class Constructor!!");
		}
		Derived1(int a,int b)
		{
			super(a);
			System.out.println("I am Derived Class Constructor with value of a & b:"+ a +" & "+ b);
		}
	}
	
	static class ChildofDerived extends Derived1
	{
		ChildofDerived()
		{
			System.out.println("I am ChildofDerived Class Constructor!!");
		}
		ChildofDerived(int q,int w, int e)
		{
			super(q,w);
			System.out.println("I am ChildofDerived Class Constructor with value of q,w & e:"+ q + " & "+ w + " & "+ e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If we didn't want to give value in Here in Base Class We can use super() in Derived Class
//		Base1  b = new Base1(4,5);
//		Base1  d = new Base1(9);
//		Derived1 deri = new Derived1();
//		Derived1 dericon = new Derived1(7,8);
		
//		ChildofDerived cd =  new ChildofDerived();

		ChildofDerived cd1 =  new ChildofDerived(78,89,90);
		
	}

}
