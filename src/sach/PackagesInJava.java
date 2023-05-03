package sach;

public class PackagesInJava {

	static class C1
	{
		public 	  String pub ="I am Public";
		protected String prot ="I am protected";
			  	  String def ="I am Default"; 
		private   String priv ="I am Private";
		
		//Same Class
		private void method1() {
			System.out.println(pub);
			System.out.println(prot);
			System.out.println(def);
			System.out.println(priv);
		}
	}
	public static void main(String[] args) {
		//Access modifier in java
		C1 my = new C1();
		my.method1();
		
		//Packages
		System.out.println(my.pub);
		System.out.println(my.prot);
		System.out.println(my.def);
		System.out.println(my.priv);
	}

}
