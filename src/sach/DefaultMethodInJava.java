package sach;

public class DefaultMethodInJava {

	interface Camera
	{
		void takesnap();
		void recordvideo();
		
		//3
		//Private we can use in default only not in other class 
		private void greet(){
	        System.out.println("Good Morning");
	    }
		
		//2
		//When we use default it didn't force any conceter class to implement it.
		default void record4kvideo()
		{
			System.out.println("Recording in 4k");
		}
	}
	interface wifi
	{
		String[] getNetwork(); 
		void connectToNetworks(String Networks);
		
	}
	static class CellPhone
	{
		void call(int phonenumber)
		{
			System.out.println("Calling..." + phonenumber );
		}
		void pickcall()
		{
			System.out.println("Connecting... ");
		}
	}
	
	static class SmartPhone extends CellPhone implements Camera,wifi
	{
		public void takesnap()
		{
			System.out.println("Taking Snap... ");
		}
		public void recordvideo()
		{
			System.out.println("Recording Video... ");
		}
		public String[] getNetwork()
		{
			System.out.println("Getting List of Networks");
			String[] networkList = {"Sachin","King","Mahi"};
			return networkList;
		}
		public void connectToNetworks(String Networks)
		{
			System.out.println("Connecting to " + Networks);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		sp.takesnap();
//		sp.greet();   //Throw error
		String[] ar = sp.getNetwork();
		for(String item : ar)
		{
			System.out.println(item);
		}
	}

}
