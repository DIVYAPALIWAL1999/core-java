package in.co.constructorcallbyconstructor;

public class Person {
	
	protected String firstName;
	protected String lastName;
	protected String address;
	public Person() {
		System.out.println("person default const");
	}
	public Person (String fn, String ln) {
		this();
		firstName = fn;
		lastName = ln;
		System.out.println("2 params constructor is called : "+fn+" "+ln);
	}
	public Person (String fn,String ln,String adr ) {
		this(fn,ln);
		address = adr;
		System.out.println("3 params constructor is called : "+fn+" "+ln+" "+adr);
	}
	public static void main(String[] args) {
		
		Person p = new Person("Divya","Paliwal","Maharastra");
		
		
		
	}

}
