package sortedsetinterfaceusingcolclasses;

import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(98);
		t1.add(45);
		t1.add(12);
		t1.add(45);
		System.out.println(t1);
		TreeSet t2 = new TreeSet();
		t2.add(32);
		t2.add(4);
		t2.add(4);
		t2.add(2);
		System.out.println(t2);
//		t1.addAll(t2);
//		System.out.println(t1);
//		System.out.println(t1.first());
//		System.out.println(t2.first());
//		System.out.println(t1.last());
//		System.out.println(t2.last());
//		System.out.println(t1.headSet(12));
//		System.out.println(t1.headSet(98));
//		System.out.println(t2.headSet(4));
//		System.out.println(t1.tailSet(12));
//		System.out.println(t1.tailSet(45));
//		System.out.println(t2.tailSet(2));
		System.out.println(t1.subSet(12, 98));
		System.out.println(t2.subSet(2, 4));
	}

}
