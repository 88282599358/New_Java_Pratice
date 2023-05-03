package sach;

public class MultiThreadingInJava2 {

	static class MyThreadRunnable1 implements Runnable
	{
		@Override
		
		public void run()
		{
			int i=0;
			while(i<=5000)
			{
			System.out.println("This is Thread 1 Runnable");
			}
		}
	}
	
	static class MyThreadRunnable2 implements Runnable
	{
		@Override
		public void run()
		{
			int i=0;
			while(i<=5000)
			{
			System.out.println("This is Thread 2 Runnable");
			}
		}
	}
	public static void main(String[] args) {
		// Syntax to run Runnable
		
		MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(bullet1);  //To run the thread
		
		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();
	}

}
