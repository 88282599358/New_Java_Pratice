package sach;

public class Dynamic_Method_Dispatch {

	static class Phone
	{
		public void ShowTime()
		{
			System.out.println("Time is 10:16 am");
		}
		public void on()
		{
			System.out.println("Turn on Phone...");
		}
	}
	
	static class SmartPhone extends Phone
	{
		public void Music()
		{
			System.out.println("On Music");
		}
		public void on()
		{
			System.out.println("Turn on SmartPhone...");
		}
	}
	public static void main(String[] args) {
		// Reference 	Object
		Phone obj = new SmartPhone();   //This Happen on Runtime not Complie Time
		obj.ShowTime();
		obj.on();
		//obj.Music();   //Show error because smartphone didn't have refernece
		
		

	}

}
