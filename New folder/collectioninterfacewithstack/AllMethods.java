package collectioninterfacewithstack;

import java.util.Stack;

public class AllMethods {
	public static void main(String[] args) {
		Stack s =new Stack();
		s.push(20);
		s.push("hello");
		s.push('z');
		s.push(2.3);
		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
//		System.out.println(s.peek());
//		System.out.println(s.peek());
//		System.out.println(s.peek());
//		System.out.println(s.peek());
//		
//		Object oTop = s.pop();
//		Object o1 =s.pop();
////		Object o2 = s.pop();
//		Object oEnd = s.pop(); 
//		System.out.println(s);
//		
		Object o1Top=s.peek();
		Object o21=s.peek();
		Object o32=s.peek();
		Object o43=s.peek();
		System.out.println(s);
		
		
		}

}
