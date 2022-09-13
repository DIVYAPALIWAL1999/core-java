package mapinterface;


import java.util.LinkedHashMap;

public class LinkedHashMapClass {
	public static void main(String[] args) {
		
	LinkedHashMap h1=new LinkedHashMap();
	h1.put(1, "gm");
	h1.put(2,"hello" );
	h1.put(3, 8);
	h1.put(4, 'p');
    h1.put(7, "hey");
	System.out.println(h1);
//	h1.clear();
//	System.out.println(h1);
	System.out.println(h1.containsKey(7));
	System.out.println(h1.containsKey(8));
	System.out.println(h1.containsValue("great"));
	System.out.println(h1.containsValue("day"));
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
