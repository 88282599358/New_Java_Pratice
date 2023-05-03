package sach;

public class PraticeOOPs {

	
	//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
	static public class TommyVecetti  {
		public void hit()
		{
			System.out.println("Hitting on the Enemy....");
		}
		
		public void run()
		{
			System.out.println("Running on the Hills....");
		}
		
		public void fire()
		{
			System.out.println("Firing on the Enemy....");
		}
		
		public void walk()
		{
			System.out.println("Walking on the Road....");
		}
		
		public void drink()
		{
			System.out.println("Drinking the Water....");
		}
		
	}
	public static void main(String[] args) {
		// Problem 3
		TommyVecetti rect = new TommyVecetti();
		rect.hit();
		rect.run();
		rect.fire();
		rect.walk();
		rect.drink();
	}

}
