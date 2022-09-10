package in.co.collectionwithdifmethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class AddAll {
	public static void main(String[] args) {
		
		List l = new ArrayList<>();
		l.add(12);
		l.add(3.6);
		l.add('a');
		l.add("java");
      

		System.out.println(l);
		
//		for(Object o:l) {
//			System.out.println(o);
//		}
	
			
		List l2 =new ArrayList<>();
		l2.add(18);
		l2.add(12.2);
		l2.add('b');
		l2.add("hello");
		
		System.out.println(l2);
		l.addAll(l2);//this method used to add
		System.out.println(l);
	
		
	}
}

