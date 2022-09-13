package queueclasses;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
	public static void main(String[] args) {
		Queue q1 = new PriorityQueue();
		q1.add(90);
		q1.add(23);
		q1.add(2);
		q1.add(23);
		System.out.println(q1);
		Queue q2 = new PriorityQueue();
		q2.add("hello");
		q2.add("buy");
		q2.add("good");
		System.out.println(q2);
		
//		q1.offer(34);
//		System.out.println(q1);
//		System.out.println(q1.peek());
//		System.out.println(q1.peek());
//		System.out.println(q2.peek());
//		System.out.println(q2.peek());
//		
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q2.poll());
//		System.out.println(q2.poll());
//		
//		System.out.println(q1.element());
//		System.out.println(q1.element());
//		System.out.println(q2.element());
//		System.out.println(q2.element());
		
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
	}

}
