package sach;

public class InterfacesInJava {

	interface Bicycle
	{
		 
		void applyBrake(int decrement);
		void speedUp(int increment);
	}
	
	interface HornBlow
	{
		void hornblowpardesi();
		void hornblowbaarish();
	}
	static class Herculus implements Bicycle, HornBlow
	{
		public int speed = 10;
		public void applyBrake(int decrement)
		{
			
			speed = speed - decrement;
			System.out.println("Applied Brake: "+ speed);
		}
		public void speedUp(int increment)
		{
			speed = speed + increment;
			System.out.println("Applied Accerelator: "+ speed);
		}

		public void hornblowpardesi()
		{
			System.out.println("Pardesi jana nahi ooye ooye");
		}
		public void hornblowbaarish()
		{
			System.out.println("Tuhme baarish bada yaad karti hai hu hu hu ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Herculus cycle = new Herculus();
		System.out.println("Speed of Cycle is :" + cycle.speed);
		cycle.applyBrake(5);   //5
		cycle.speedUp(12);   //17 Because 10-5 pahle applybrake wale me hi mius ho gaya hai
		cycle.hornblowbaarish();
		cycle.hornblowpardesi();
		
	}

}
