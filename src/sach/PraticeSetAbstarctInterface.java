package sach;

public class PraticeSetAbstarctInterface {
	//PP 1 + 2
	static abstract class Pen
	{
		abstract void write();
		abstract void refill();
	}
	static class BallPen extends Pen
	{
		void write()
		{
			System.out.println("Writing...");
		}
		void refill()
		{
			System.out.println("Refilling...");
		}
		void cap()
		{
			System.out.println("Cap the Pen...");
		}
	}
	
	//PP 3
	static class Monkey
	{
		void jump()
		{
			System.out.println("Monkey is Jumping...");
		}
		void bite() 
		{
			System.out.println("Monkey can Bite...");
		}
	}
	interface basicAnimal
	{
		void  eat();
		void sleep();
	}
	static class Human extends Monkey implements basicAnimal
	{
		void speak() {
			System.out.println("Hello World!! I can Speak...");
		}
		
		@Override
		public void  eat()
		{
			System.out.println("Hello We are Eating...");
		}
		@Override
		public void sleep()
		{
			System.out.println("Hello We can Sleep...");
		}
		
	}
	
	//PP 4
	static abstract class telephone {
		abstract void pickup();
		abstract void lift();
		abstract void disconnected();
		
	}
	static class smartTelephone extends telephone
	{
		@Override
		public  void pickup()
		 {
			System.out.println("PickUp the Call...");
		 }
		
		@Override
		public  void lift()
		 {
			System.out.println("Lift the Call...");
		 }
		public void talk()
		{
			System.out.println("Talking ...");
		}
		@Override
		public  void disconnected()
		 {
			System.out.println("Disconnect the Call...");
		 }
		
	}
	
	//PP5
	interface TVremote
	{
		void click();
		void pick();
	}
	interface smartTVremote extends  TVremote
	{
		void put();
		void cover();
	}
	static class TV implements TVremote,  smartTVremote
	{
		@Override
		public void click()
		{
			System.out.println("Click on Remote...");
		}
		@Override
		public void pick()
		{
			System.out.println("Pick on Remote...");
		}
		
		@Override
		public void put()
		{
			System.out.println("Put on Remote...");
		}
		
		@Override
		public void cover()
		{
			System.out.println("Cover on Remote...");
		}
	}
	public static void main(String[] args) {
		// PP1 + 2
		//Pen bp = new BallPen();:- Then bp.cap throw error
		BallPen bp = new BallPen();
		bp.cap();
		bp.refill();
		bp.write();
		
		//PP3
		Human h = new Human();
		h.eat();
		h.jump();
		h.bite();
		h.speak();
		h.sleep();	
		

		//PP4
		smartTelephone st = new smartTelephone();
		st.pickup();
		st.lift();
		st.talk();
		st.disconnected();
		
		
		//PP5
		TVremote tvs = new TV();
		tvs.pick();
		tvs.click();
//		tvs.put();  -->Error
	}

}
