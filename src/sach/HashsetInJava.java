package sach;

import java.util.HashSet;
public class HashsetInJava {

	public static void main(String[] args) {
		// Hashset
		
//		HashSet <Integer> myHashset = new HashSet<>();

		HashSet <Integer> myHashset = new HashSet<>(100,0.5f);  //InitialCapacity and load factor(must be in int)
		myHashset.add(7);
		myHashset.add(5);
		myHashset.add(5);  //if there is two same element then one value will ignored
		
		System.out.println(myHashset);
		
	}

}
