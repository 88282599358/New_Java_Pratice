package sach;

public class Multilevel_Inheritance {

	static class Animal
	{
		public void Eat() {
			System.out.println("Eating....");
		}
	}
	static class Dog extends Animal
	{
		public void Bark() {
			System.out.println("Barking....");
		}
	}
	
	static class BabyDog extends Dog
	{
		public void Weep() {
			System.out.println("Weeping....");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd = new BabyDog();
		bd.Eat();
		bd.Bark();
		bd.Weep();
	}

}

 

