package in.co.collectionMethodwithArrayList;


import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(34);
		l.add("Divya");
		l.add("a");
		l.remove(0);
		l.remove(1);
		//l.remove(2);
		System.out.println(l);
		
	}

}
