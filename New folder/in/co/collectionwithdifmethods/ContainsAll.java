package in.co.collectionwithdifmethods;


import java.util.ArrayList;
import java.util.List;

public class ContainsAll {
	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(20);
		l.add(25);
		l.add(30);
		
		System.out.println("List:"+l);
		List l2 = new ArrayList<>();
		l2.add(20);
		l2.add(25);
		l2.add(30);
		System.out.println("Are all the contents equal?"+l.containsAll(l2));//here I checked between l and l2.		
		List x = new ArrayList<>();
		x.add(1);
		x.add(2);
		x.add(3);
		System.out.println("Are all the contents equal?"+l.containsAll(x));//here I checked between l2 and x.
	}

}
