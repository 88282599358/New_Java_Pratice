package sach;
import java.util.*;

public class ExerciseOnConstuctor {
	
    
	static class Cylinder{
		
		private int radius;
	    private int height;
	    
		public Cylinder()   //int radius, int height in parenthesis So in object we can use  its value
		{
			this.radius = radius;
			this.height = height;
			
		}
		public void setRadius(int radius)
		{
			this.radius = radius;
		}
		
		public int getRadius()
		{
			return radius;
		}
		public void setHeight(int height)
		{
			this.height = height;
		}
		public int getHeight()
		{
			return height;
		}
		
		public double surfaceArea()
		{
			return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
		}
		
		public double volume()
		{
			return Math.PI*radius*radius*height;
		}
		
		
	}
	
	
	static class Sphere{
		
		private int radius;
	    
		public Sphere()   //int radius, int height in parenthesis So in object we can use  its value
		{
			this.radius = radius;
			
		}
		public void setSphereRadius(int radius)
		{
			this.radius = radius;
		}
		
		public int getSphereRadius()
		{
			return radius;
		}
		
		
		public double spheresurfaceArea()
		{
			return 4*Math.PI*radius*radius;
		}
		
		public double spherevolume()
		{
			return (4/3)*Math.PI*radius*radius*radius;
		}
		
		
	}
	
	static class Rectangle
	{
		private int length;
	    private int breadth;
	    
		public Rectangle() {
	    this.length = 5;
	    this.breadth = 7;
		}
		
		public Rectangle(int length, int breadth) {
			this.breadth = breadth;
			this.length = length;
		}
		 public int getLength() {
		        return length;
		    }

		    public int getBreadth() {
		        return breadth;
		    }
	}
	public static void main(String[] args) {
		// PROBLEM 1
		Cylinder cylin  = new Cylinder(); //25,20 If in constrcutor we fill value to catch
		cylin.setRadius(9);
		System.out.println("Radius is: " + cylin.getRadius());
		cylin.setHeight(12);
		System.out.println("Height is: " + cylin.getHeight());
		
		//Problem 2	
		System.out.println("Height is: " + cylin.surfaceArea());
		System.out.println("Height is: " + cylin.volume());
		
		
		//PROBLEM 3
		Rectangle r = new Rectangle();
		System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        
        // 	Problem 4
        Sphere sph = new Sphere();
        sph.setSphereRadius(8);
        System.out.println("Radius is: " + sph.getSphereRadius());
        System.out.println("Surface Area of Sphere is: " + sph.spheresurfaceArea());
		System.out.println("Volume of Sphere is: " + sph.spherevolume());
        
	}

}
