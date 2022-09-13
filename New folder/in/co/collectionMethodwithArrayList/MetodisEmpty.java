package in.co.collectionMethodwithArrayList;

import java.util.ArrayList;
import java.util.List;

public class MetodisEmpty {
public static void main(String[] args) {
    //this for empty list
	List l1 = new ArrayList<>();
	///I am not creating any kind of list here
	//like l1.add(1);
	//thats why output will be empty
	boolean ans1 = l1.isEmpty();
	if(ans1 == true)
		System.out.println("list is empty");
	else
		System.out.println("list is not empty");

	//this for filled list
	 List l=new ArrayList<>();
	 l.add(20);
	 l.add("hello");
	 l.add('a');
	 l.add(2.3);
	 boolean ans = l.isEmpty();
	 if (ans == true)
		 System.out.println("The list is empty");
	 else
		 System.out.println("The list is not empty");
		 
	
}
		

	

}
