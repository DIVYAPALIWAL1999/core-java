package mapinterface;

import java.util.Hashtable;

public class HashTableClass {
	public static void main(String[] args) {
		
	Hashtable h1=new Hashtable();
	h1.put(1, "buddy");
	h1.put(2,"ok" );
	h1.put(3, 78);
	h1.put(4, 'j');
    h1.put(7, "hey");
	System.out.println(h1);
//	h1.clear();
//	System.out.println(h1);
	System.out.println(h1.containsKey(7));
	System.out.println(h1.containsKey(8));
	System.out.println(h1.containsValue("pen"));
	System.out.println(h1.containsValue("apple"));
    h1.entrySet();
    System.out.println(h1);
	System.out.println(h1.entrySet());
	
	System.out.println(h1.get(3));
	System.out.println(h1.isEmpty());
	System.out.println(h1.keySet());
	System.out.println(h1.put(4, 'h'));
	System.out.println(h1.put(9, "ball"));
	System.out.println(h1.remove(1));
	System.out.println(h1.size());
	System.out.println(h1.values());
	
	}
}
