package sach;

import java.util.LinkedList;
public class LinkedListInJava {

	public static void main(String[] args) {
		// LinkedList
		
		LinkedList <Integer> l1 = new LinkedList<>();
		
		l1.add(8);
		l1.addLast(789);  //addlast is not in ArrayList
		l1.addFirst(74);
		l1.add(2, 896);
		System.out.println(l1.isEmpty());
		System.out.println(l1.subList(1, 3));  //1 and 3 ke sare Element batayega
		
		
		for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

	}

}
