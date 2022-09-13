package mapinterface;

import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1, "one");
		h1.put(2,"two" );
		h1.put(3, "three");
		h1.put(4, 'h');
	    h1.put(7, "hey");
		System.out.println(h1);
//		h1.clear();
//		System.out.println(h1);
		System.out.println(h1.containsKey(7));
		System.out.println(h1.containsKey(8));
		System.out.println(h1.containsValue("three"));
		System.out.println(h1.containsValue("good"));
	    h1.entrySet();
	    System.out.println(h1);
		System.out.println(h1.entrySet());
		
		System.out.println(h1.get(3));
		System.out.println(h1.isEmpty());
		System.out.println(h1.keySet());
		System.out.println(h1.put(4, 'h'));
		System.out.println(h1.put(9, "bad"));
		System.out.println(h1.remove(1));
		System.out.println(h1.size());
		System.out.println(h1.values());
		
		
	}

}
