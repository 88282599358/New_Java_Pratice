package sach;

public class This_super {

	static class OneClass
	{
		int a;
		
		public int getA()
		{
			return a;
		}
		OneClass(int a)
		{
			this.a = a;
		}
	}

	static class TwoClass extends OneClass
	{
		TwoClass(int c)  //This show error because we don't have contructor in Base class having no parameter
		{
			super(c);
			System.out.println("I am a constructor" + c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneClass oc = new OneClass(8);
		System.out.println(oc.getA());
		TwoClass tc = new TwoClass(10);
		
		
	}

}



