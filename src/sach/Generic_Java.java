package sach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MyGeneric <T1, T2>{
	int val;
	private T1 t1;
	private T2 t2;
	
	
	public MyGeneric(int val,T1 t1, T2 t2)
	{
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}


	public int getVal() {
		return val;
	}


	public void setVal(int val) {
		this.val = val;
	}


	public T1 getT1() {
		return t1;
	}


	public void setT1(T1 t1) {
		this.t1 = t1;
	}


	public T2 getT2() {
		return t2;
	}


	public void setT2(T2 t2) {
		this.t2 = t2;
	}
}
public class Generic_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*This Produce Error that beacuse we put two datatYPES int and Str */
		/*ArrayList al = new ArrayList();
		al.add("Hello Generic");
		al.add(80);
		int a = (int) al.get(0);
		System.out.println(a); 
		*/
		
		/*This also Produce Error that because we say the we will use int only but we use str also */
		ArrayList <Integer> al = new ArrayList();
	/*	al.add("Hello Generic");
		al.add(80);
		int a = (int) al.get(0);
		System.out.println(a); 
		*/
		
		
		//Example 1
		/* The use of generics ensures type safety, by ensuring that only elements of the specified type can be added to the list, 
		 * and eliminating the need for explicit type casting when retrieving elements from the list.*/
		MyGeneric<String,Integer> g1 = new MyGeneric(2,"MyString",7);
		String str = g1.getT1();
		Integer int1 = g1.getT2();
		Integer int2 = g1.getVal();
		System.out.println(str +" "+ int1+" "+ int2);
		
		
		
		//Example 2
		ArrayList<String> list = new ArrayList<String>();
		list.add("King");
		list.add("Lord");
		list.add("Ram");
		
		String s=list.get(1);//type casting is not required  
		System.out.println("element is: "+s);  
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*
		 * The code imports the java.util.* package, which contains various utility classes and interfaces, such as the ArrayList class and the Iterator interface.

The TestGenerics1 class defines a main method, which creates an ArrayList object of type String, adds two String elements to it, and then retrieves and prints the second element of the list.

The third line of the main method (//list.add(32);//compile time error) is commented out because it causes a compilation error. This is because the ArrayList has been declared to hold only String objects, so attempting to add an int value to the list is not allowed.

After printing the second element of the list, the code creates an Iterator object using the iterator method of the ArrayList class, and then iterates over the elements of the list using a while loop and the hasNext and next methods of the Iterator interface. Each element of the list is printed to the console using the println method of the System class.

Overall, the code demonstrates the use of the ArrayList class, the Iterator interface, and generics in Java. The use of generics ensures type safety, by ensuring that only elements of the specified type can be added to the list, and eliminating the need for explicit type casting when retrieving elements from the list.




*/
		
		//Example 3 Java Generics using Map
		/*Now we are going to use map elements using generics. Here, we need to pass key and value.*/
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sachin");
		map.put(2, "Word");
		map.put(3, "Smooth");
		
		//Now use Map.Entry for Set and Iterator  
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr1= set.iterator();
		while(itr1.hasNext())
		{
			Map.Entry e = itr1.next();
			System.out.println(e.getKey() + " " + e.getValue());			
		}
		
		/*
The code creates a Map object of type HashMap, which maps integer keys to string values. The put method is used to add three key-value pairs to the map, with keys 1, 2, and 3 and corresponding string values "Sachin", "Word", and "Smooth", respectively.

The code then creates a Set of Map.Entry objects using the entrySet method of the Map interface. Each Map.Entry object represents a key-value pair in the map.

An Iterator object of type Iterator<Map.Entry<Integer,String>> is created to iterate over the Set of Map.Entry objects. The Iterator is initialized using the iterator method of the Set object.

A while loop is used to iterate over the Map.Entry objects using the hasNext and next methods of the Iterator. For each Map.Entry object, the key and value are obtained using the getKey and getValue methods, respectively. The key and value are then printed to the console using the println method of the System class.

Overall, the code demonstrates how to use the Map interface and the entrySet method to iterate over the key-value pairs of a map using a Set and an Iterator.*/
		
	}

}
