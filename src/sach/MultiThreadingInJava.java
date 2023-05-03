package sach;
/*Concurrency:- At one time you do one work but you handle many computation 
 * eg. Code karna hai video pause kareke Khana banana and reply dena but ek time per sirf ek kaam karna
 * 
 * Parallism:- At one time many work done Simultaneously (running Multiple Computations Simultaneously)
 * Eg. You are doing reply and khana ban raha hai Ek time per 2 kaam 
 * */

//Thread by Extending Thread class

class MyThread1 extends Thread
{
	
	@Override
	public void run()
	{
		int i=0;
		while(i<=50000)
		{
		System.out.println("My Cooking Thread is Running");
		System.out.println("Shaktimaan");
		i++;
		}
		
	}
}

class MyThread2 extends Thread
{
	
	@Override
	public void run()
	{
		int i=0;
		while(i<=50000)
		{
		System.out.println("My Running Thread is Running");
		System.out.println("Krish");
		i++;
		}
		
	}
}
public class MultiThreadingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		
		mt1.start();  //To Start run Method
		mt2.start();

	}

}
