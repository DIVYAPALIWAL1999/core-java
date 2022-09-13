package in.co.setinterface;


import java.util.Set;

import java.util.TreeSet;

public class TreeSetUsingCollectionMethods {
	public static void main(String[] args) {
		Set t1 = new TreeSet();
		t1.add("hello");
		t1.add("good");
		t1.add("hii");
		t1.add("go");
		
		System.out.println(t1);
		
		Set t2 =new TreeSet<>();
		t2.add("hey");
		t2.add("bad");
		t2.add("buddy");
		//always takes similar type value = like t1 & t2 (string)
	
		System.out.println(t2);
		t1.addAll(t2);
    	System.out.println(t1);
//		t1.clear();
//		System.out.println(t1);
		
		System.out.println(t1.contains("good"));
		System.out.println(t1.contains("hiiii"));
		
		System.out.println(t1.containsAll(t2));//when we comment out addAll then output is true 
		
//		System.out.println(t1.isEmpty());
		
		System.out.println(t1.remove("good"));
		System.out.println(t1.remove("read"));
		
		System.out.println(t1.retainAll(t2));
		
		System.out.println(t1.removeAll(t2));
		System.out.println(t1.size());
	}

}
