package collectionmethoodwithlinkedlist;

import java.util.LinkedList;

public class AddAll {
	public static void main(String[] args) {
	LinkedList l = new LinkedList<>();
	l.add(23);
	l.add("hii");
	l.add('a');
	
	System.out.println(l);
	LinkedList l2 =new LinkedList<>();
	l2.add(50);
	l2.add("java");
	l2.add('b');
	
	System.out.println(l2);
	l.addAll(l2);
	System.out.println(l);
	
	
	System.out.println(l.contains(l2));
	System.out.println(l.containsAll(l2));
	System.out.println(l.isEmpty());
	
	//l.remove(l2);
	System.out.println(l.remove(2));
	System.out.println(l2.remove(1));
	
    //System.out.println(l.removeAll(l2));
    
   // System.out.println(l.retainAll(l2));
	}

}
