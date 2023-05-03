package sach;

public class ThreadMethodInJava {
	
	static class MyThr1 extends Thread
	{
		public void run() 
		{
			while(true)
			{
				//1
				System.out.println("Thank you ");
				//2
				try
				{
					Thread.sleep(500);
					
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	static class MyThr2 extends Thread
	{
		//1 and 2 
		public void run() 
		{
			while(true)
			{
				System.out.println("Thankkkkk youuuuuu ");
			}
		}
	}
	public static void main(String[] args) {
		MyThr1 mt1 = new MyThr1();
		MyThr2 mt2 = new MyThr2();
		mt1.start();
		
		//1
//		try
//		{
//			mt1.join();	
//		}
//		catch(Exception e)
//		{
//			System.out.println("The exception has been caught " + e);  
//		}
		
		mt2.start();
	}
}
