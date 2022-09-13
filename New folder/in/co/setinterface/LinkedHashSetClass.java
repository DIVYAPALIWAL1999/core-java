package in.co.setinterface;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("hello");
		lh.add(20);
		lh.add('s');
		System.out.println(lh);
		 
		LinkedHashSet lh1 = new LinkedHashSet();
		lh1.add("hey");
		lh1.add(35);
		lh1.add('m');
		lh1.add(35);
		System.out.println(lh1);
		
//		lh.addAll(lh1);
//		System.out.println(lh);
////		
//	    lh.clear();
//	    System.out.println(lh);
//	    
	    System.out.println(lh.contains(20));
        System.out.println(lh.contains(35));
	    
        System.out.println(lh.containsAll(lh1));
	    
	    System.out.println(lh.isEmpty());
	    
        System.out.println(lh1.remove(10));
         
	    System.out.println(lh.removeAll(lh1));
	    
	    System.out.println(lh.retainAll(lh1));
	    
	    System.out.println(lh.size());
	    System.out.println(lh1.size());
	    
	    
		
	}

}
