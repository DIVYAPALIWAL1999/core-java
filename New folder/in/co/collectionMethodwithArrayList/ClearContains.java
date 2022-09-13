package in.co.collectionMethodwithArrayList;

import java.util.ArrayList;
import java.util.List;
public class ClearContains {
	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(20);
		l.add("hii");
		l.add('h');
		l.add(1.5);
		
	l.clear();//this method used for removes all elements
	System.out.println(l);
		boolean c = l.contains(20);//this method is used for membership checking
		
		if(c)
			System.out.println("the list contains 20");//means element is present or not
		    
		else
		    System.out.println("the list does not contains 20");
		
		c = l.contains("hii");
		if(c)
	        System.out.println("the list contain hii");
		else   
		System.out.println("the list does not contains hii");
		c=l.contains(78);
		if(c)
			System.out.println("present");
		else
			System.out.println("absent");
		
	}

	
	}

	
	

	
	


