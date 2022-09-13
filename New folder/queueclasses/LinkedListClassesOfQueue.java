package queueclasses;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListClassesOfQueue {
	public static void main(String[] args) {
		Queue  q = new LinkedList();
		q.add(7);
		q.add("hello");
		q.add('y');
//		System.out.println(q);
//		q.offer(4);
//		System.out.println(q);
//    	System.out.println(q.peek());
//	    System.out.println(q.peek());
//	    System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
		System.out.println(q.element());
		System.out.println(q.element());
		System.out.println(q.element());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
