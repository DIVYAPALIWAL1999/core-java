package collectionmethodwithvector;

import java.util.Vector;

public class AllCollectionMethod {
	public static void main(String[] args) {
		Vector v= new Vector<>();  //<> not mandartory
		v.add(20);
		v.add("hello");
		v.add('x');
		v.add(5.2);
		System.out.println(v);
		
		Vector v1 = new Vector();
		v1.add(10);
		v1.add("Divya");
		v1.add("y");
		v1.add(6.7);
		System.out.println(v1);
	   
		v.addAll(v1);
	    System.out.println(v);
	    
	    System.out.println(v.contains(3));
	    
	    System.out.println(v.containsAll(v1));
	    
	    
	}

}
