package sach;


public class OverridingInJava {
	static class BaseA
	{
		public void meth1()
		{
			System.out.println("This is meth1 of BaseA");
		}
	}
	
	static class DeriA extends BaseA
	{
		@Override
		public void meth1()
		{
			System.out.println("This is meth1 of DeriA");
		}
	}

	
	static class Bank
	{
		int getRateOfInterest() {
			return 0;
		}
	}
	static class SBI extends Bank
	{
		@Override
		int getRateOfInterest() {
			return 8;
		}
	}
	static class HDFC extends Bank
	{
		@Override
		int getRateOfInterest() {
			return 9;
		}
	}
	
	static class AXIS extends Bank
	{
		@Override
		int getRateOfInterest() {
			return 7;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeriA De = new DeriA();
		De.meth1();
		
		 SBI s = new SBI();
		 HDFC h = new HDFC();
		 AXIS a = new AXIS();
		 System.out.println("SBI Bank Rate of Interest: " + s.getRateOfInterest());
		 System.out.println("SBI Bank Rate of Interest: " + h.getRateOfInterest());
		 System.out.println("SBI Bank Rate of Interest: " + a.getRateOfInterest());
	}

}
 




