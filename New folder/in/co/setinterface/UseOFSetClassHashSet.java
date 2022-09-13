package in.co.setinterface;

import java.util.HashSet;

public class UseOFSetClassHashSet {
	public static void main(String[] args) {
		HashSet s1 = new HashSet();//doesn't maintain any order in output.
		s1.add(30);
		s1.add("hello");
		s1.add('g');
		s1.add(2.3);
		
		System.out.println(s1);
		
		HashSet s2 = new HashSet();
		s2.add(30);
		s2.add("end");
		s2.add(45);
		s2.add('k');
		System.out.println(s2);
		
		
		s1.addAll(s2);
		System.out.println(s1);
//		
//		s1.clear();
//		System.out.println(s1);//its used to remove all element.
//		
//		
//		System.out.println(s1.contains(45));//this method checks membership.
//		
//		System.out.println(s1.containsAll(s2));
//		System.out.println(s1.containsAll(s1));//this method checks inclusion.

//		System.out.println(s1.isEmpty());
////		
//	    s1.clear();
//	    System.out.println(s1);
//		
//	    
//	    System.out.println(s1.isEmpty());
//	    
		HashSet s3=new HashSet<>();
	    s3.add(35);
	    s3.add("good");
//	    s3.remove("good");
//	    System.out.println(s3);
//	    s3.removeAll(s3);
//	    System.out.println(s3);
//	    
	
	    System.out.println(s3.size());
	    
	    System.out.println(s1.retainAll(s2));
	    
	    System.out.println(s1.size());
	    System.out.println(s3.size());
	    }

}
