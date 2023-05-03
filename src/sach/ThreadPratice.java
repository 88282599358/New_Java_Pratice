package sach;

public class ThreadPratice {
	
	//Q1 Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
	
/*	static class QThread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
			System.out.println("Good Morning");
			}
		}
	}
	static class QThread2 extends Thread
	{
		public void run()
		{
			while(true)
			{
			System.out.println("Welcome to our KingDom");
			}
		}
	}  */

	// Q2  Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
	/* static class QThread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
			System.out.println("Good Morning");
			}
		}
	}
	static class QThread2 extends Thread
	{
		public void run()
		{
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException  e)
			{
				e.printStackTrace();
			}
			System.out.println("Welcome to our KingDom");
		}
	}  */
	
	
	//Q3 Demonstrate gerPriority() and setPriority() methods in Java threads.
	 /* static class QThread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
			System.out.println("Good Morning");
			}
		}
	}
	static class QThread2 extends Thread
	{
		public void run()
		{
			while(true)
			{
			System.out.println("Welcome to our KingDom");
			}
		}
	}   */
	
	//Q4 How do you get the state of a given thread in Java? & How do you get the reference to the current thread in Java?
	static class QThread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
			System.out.println("Good Morning");
			}
		}
	}
	static class QThread2 extends Thread
	{
		public void run()
		{
			
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException  e)
			{
				e.printStackTrace();
			}
			System.out.println("Welcome to our KingDom");
			
			}
	}
		
	public static void main(String[] args) {
		// Q1
	/*	QThread1 qt1 = new QThread1();
		QThread2 qt2 = new QThread2();
		
		qt1.start();
		qt2.start();  */
		
		//Q2
	/*	QThread1 qt1 = new QThread1();
		QThread2 qt2 = new QThread2();
		
		qt1.start();
		qt2.start(); */
		
		
		//Q3
	/*	QThread1 qt1 = new QThread1();
		QThread2 qt2 = new QThread2();
		
		qt1.start();
		qt2.start();
		qt1.setPriority(5);
		qt2.setPriority(9);
		
		System.out.println(qt1.getPriority());
		System.out.println(qt2.getPriority());  */
		
		//Q4
		QThread1 qt1 = new QThread1();
		QThread2 qt2 = new QThread2();
		
	
		qt1.setPriority(5);
		qt2.setPriority(9);
		
		System.out.println(qt1.getPriority());
		System.out.println(qt2.getPriority()); 
		System.out.println(qt2.getState());
//		qt1.start();
		qt2.start();
		System.out.println(qt2.getState());
		System.out.println("--------------");
		System.out.println(Thread.currentThread().getState());
		
	}

}
