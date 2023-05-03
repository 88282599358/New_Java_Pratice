package sach;

import sach.Multilevel_Inheritance.Animal;

public class Heriracal_Inheritance {
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
	static class Cat extends Animal
	{
		public void Meow() {
			System.out.println("Meowing....");
		}
	}
	
	//2nd Class
	static class A
	{
		public void print_A() {System.out.println("Printed A!!");}
	}
	
	static class B extends A
	{
		public void print_B() {System.out.println("Printed B!!");}
	}
	
	static class C extends A
	{
		public void print_C() {System.out.println("Printed C!!");}
	}
	static class D extends A
	{
		public void print_D() {System.out.println("Printed D!!");}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.Eat();
		c.Meow();
		
		Dog ani = new Dog();
		ani.Bark();
		
		
		B obj_b = new B();
		obj_b.print_A();
		obj_b.print_B();
		
		C obj_c = new C();
		obj_c.print_A();
		obj_c.print_C();
		
		D obj_d = new D();
		obj_d.print_A();
		obj_d.print_D();
	}

	}

