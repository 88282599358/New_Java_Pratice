package sach;

public class AccessModifier {
	
	static class Employee{
		private int id;
		private String name;
		
		
		public void setid(int i)
		{
			//id = i;	 //or
			this.id =  i;
		}
		
		public int getid()
		{
			
			return id;
		}
		
		
		public void setname(String n)
		{
			//name = n;  //or
			this.name = n;
		}
		
		public String getname()
		{
			return name;
		}
		
	}
	
	static class Circle
	{
		private float radius;
		private float pi = 3.14f;
		
		public void setradius(float r)
		{
			this.radius = r;
		}
		
		public float getradius()
		{
			return (float)(pi)*radius;
		}
			
		public float getperimeter()
		{
			return (float) (2*pi*radius);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setid(645);
		System.out.println(emp.getid());
		
		emp.setname("Sachin Prajapati");
		System.out.println(emp.getname());
		

		Circle cir = new Circle();
		cir.setradius(5.2f);
		System.out.println(cir.getradius());

		System.out.println(cir.getperimeter());
	}

}
