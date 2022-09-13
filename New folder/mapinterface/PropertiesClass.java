package mapinterface;


import java.util.Properties;

public class PropertiesClass {
	public static void main(String[] args) {
		
	Properties h1=new Properties();
	h1.put(1, "gm");
	h1.put(2,"Aaru" );
	h1.put(3, 8.9);
	h1.put(4, 76);
    h1.put(7, "o");
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
