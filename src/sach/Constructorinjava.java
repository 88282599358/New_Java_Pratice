package sach;

public class Constructorinjava {

	
	static class MyEmployee{
		private int id;
		private String name;
		
		//Constructor 
		//Without Parameter
		public MyEmployee() {
			id =  78;
			name  = "Sachin";
		}
		
		//Constructor Overloading with Parameter 
		public MyEmployee(String myName, int myId){
	        id = myId;
	        name = myName;
	    }
		
		public void setid(int i)
		{
	        this.id = i;
	    }
		
		public int getid()
		{
			return id;
		}
		
		
		public void setname(String n)
		{
			this.name = n;
		}
		
		public String getname()
		{
			return name;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor with Parameter
		MyEmployee emp = new MyEmployee();
		
		emp.setid(645);
		System.out.println(emp.getid());
		
		emp.setname("Sachin Prajapati");
		System.out.println(emp.getname());
		
//		//Without Parameter
//		MyEmployee emp = new MyEmployee("Prajapati",14);   OR
//		
//
//		MyEmployee emp = new MyEmployee();
//		System.out.println(emp.getid());
//        System.out.println(emp.getname());

	}

}




