package sach;

import java.util.ArrayDeque;
public class ArrayDequeueInJava {

	public static void main(String[] args) {
		//ArrayDequeue :- Array Double Ended Queue”, pronounced as “ArrayDeck”) is a special kind of a growable array 
		//that allows us to add or remove an element from both sides. 

		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(7);
		ad.offerFirst(75);
		ad.addLast(89);
		ad.offerLast(56);
		ad.add(78);
		ad.offer(12);
		
		System.out.println(ad);
//		ad.remove();  //remove 75
		//ad.poll();		//remove 75
		
//		ad.pollLast(); //deletes  12
        ad.removeLast(); //deletes 12
		
		System.out.println("First Element of Deque: " + ad.getFirst());

		System.out.println("Peek Element of Deque: " + ad.peekFirst());
		System.out.println("Last Element of Deque: " + ad.getLast());

		System.out.println("Peek Last Element of Deque: " + ad.peekLast());
		System.out.println("Class Element of Deque: " + ad.getClass());
		
		 System.out.print(ad);
	}

}
