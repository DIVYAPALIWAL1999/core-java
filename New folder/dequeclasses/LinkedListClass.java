package dequeclasses;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		Deque d1 =new LinkedList();
		   d1.add(67);
		   d1.add("hiiii");
		   d1.add(67);
		   d1.add('f');
		   d1.add(4.5);
		   System.out.println(d1);
		   d1.addFirst(2);
		   System.out.println(d1);
		   d1.addLast(9);
		   System.out.println(d1);
		   d1.offerFirst(23);
		   System.out.println(d1);
		   d1.offerLast('u');
		   System.out.println(d1);
		   System.out.println(d1.removeFirst());
		   System.out.println(d1.removeLast());
		   System.out.println(d1.pollFirst());
		   System.out.println(d1.pollLast());
		   System.out.println(d1.peekFirst());
		   System.out.println(d1.peekLast());
		   System.out.println(d1.getFirst());
		   System.out.println(d1.getLast());
	}

}
