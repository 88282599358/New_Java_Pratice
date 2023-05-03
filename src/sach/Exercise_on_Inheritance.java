package sach;

public class Exercise_on_Inheritance {

	static class Circle
	{
		public int radius;
		Circle()
		{
			System.out.println("I am non param of circle");
		}
		Circle(int r)
		{	
			System.out.println("I am param of circle");
			this.radius = r;
		}
		public double area() {
			return Math.PI*this.radius*this.radius;
		}
	}
	
	static class Cylinder extends Circle
	{
		public int height;
		Cylinder(int r, int h)
		{
			super(r);
			System.out.println("I am cylinder parameterized constructor");
			this.height = h;
		}
		public double volume()
		{
			return Math.PI*this.radius*this.radius*this.height;
		}
	}
	
	
	//Rectangle 
	
	static class Rectangle
	{
		public int length;
		public int breadth;
		public int width;
		
		public void setlb(int l, int b)
		{
			this.breadth = b;
			this.length  = l;
		}
		public void setw(int w)
		{
			this.width = w;
		}
		public int getlb()
		{
			return length*breadth;
		}
		public int getvol()
		{
			return length*breadth*width;
		}
		
	}
	
	public static void main(String[] args) {
//		Circle objC = new Circle(12); 
//		Cylinder cy = new Cylinder(8,9);
		
		//Rectangle
		Rectangle rect = new Rectangle();
		rect.setlb(8, 9);
		rect.setw(4);
		System.out.println("The area of rectangle: " + rect.getlb());
		System.out.println("The Volume of rectangle: " + rect.getvol());
		

	}

}
