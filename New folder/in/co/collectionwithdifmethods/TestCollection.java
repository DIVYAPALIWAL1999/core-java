package in.co.collectionwithdifmethods;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Bura mat dekho");
		c.add("Bura mat suno");
		c.add("Bura mat karo");
		System.out.println("Length of Collection:"+c.size());
		for (Object ele:c) {
			System.out.println(ele);
		}
		Object[] oarray = c.toArray();
		for(Object ele:oarray) {
			String s = (String) ele;
			System.out.println(s);
			
		}
	}

}
