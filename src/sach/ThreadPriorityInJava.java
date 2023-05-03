package sach;
import java.lang.*;

public class ThreadPriorityInJava {
	static class ThreadPriority extends Thread
	{
		@Override
		public void run()
		{
			System.out.println("Inside run method");
		}
	}
	
	static class MyThr extends Thread
	{
		public MyThr(String Name)
		{
			super(Name);
		}
		public void run()
		{
			int i = 0;

	        while(i<=30000)
	        {
			System.out.println("Thank you: " + this.getName());
			i++;
	        }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1 =  new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
		System.out.println("--------------------------------------------------");
		
		t1.setPriority(6);
		t2.setPriority(5);
		t3.setPriority(8);
		
		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
		
		

        // Displays the name of
        // currently executing Thread
		System.out.println("Currently Excuting Thread: " +Thread.currentThread().getName());
		System.out.println("Main Thread Priority: " +Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread Priority: " +Thread.currentThread().getPriority());
		
		System.out.println("--------------------------------------------------");
		MyThr my1 = new MyThr("King");
		MyThr my2 = new MyThr("Prince");
		MyThr my3 = new MyThr("Alien");
		MyThr my4 = new MyThr("Lion");
		MyThr my5 = new MyThr("Sachin (most Imp Priority)");
		
		my5.setPriority(Thread.MAX_PRIORITY);
//		my1.setPriority(Thread.MIN_PRIORITY);
//		my2.setPriority(Thread.MIN_PRIORITY);
//		my3.setPriority(Thread.MIN_PRIORITY);
//		my4.setPriority(Thread.MIN_PRIORITY);
		
		my1.start();
		my2.start();
		my3.start();
		my4.start();
		my5.start();
		
	}
}
