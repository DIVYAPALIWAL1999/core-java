package dequeclasses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {
	public static void main(String[] args) {
		Deque a1 = new ArrayDeque();
		a1.add(23);
		a1.add(34);
		a1.add(23);
		a1.add("hello");
		a1.add('d');
		System.out.println(a1);
		
//	    a1.addFirst(36);
//	    System.out.println(a1);
//	    System.out.println(a1.removeFirst());
//		System.out.println(a1.getFirst());		
		a1.offerFirst(40);
		System.out.println(a1);
		System.out.println(a1.pollFirst());
		System.out.println(a1.pollFirst());
		System.out.println(a1.peekFirst());
		System.out.println(a1.peekFirst());
	    a1.addLast(5);
	    System.out.println(a1);
	    a1.removeLast();
	    System.out.println(a1);
	    
	    //System.out.println(a1.getLast());
	    a1.offerLast('h');
		System.out.println(a1);
		System.out.println(a1.pollLast());
		System.out.println(a1.peekLast());
	}
}
