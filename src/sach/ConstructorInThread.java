package sach;

public class ConstructorInThread {

	static class MyThr extends Thread
	{
		public MyThr(String Name)
		{
			super(Name);
		}
		public void run()
		{
			System.out.println("Thank You I am Constructor In Thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr mt = new MyThr("Sachin");
		mt.start();
		System.out.println("The id of the thread is : "+ mt.getId());
		System.out.println("The id of the thread is : "+ mt.getName());
	}

}
