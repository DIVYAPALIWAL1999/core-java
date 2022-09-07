package in.co.constructorcallbyconstructor;

public class Employee extends Person {
	private String designation;
	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(String fn,String ln, String des) {
		super(fn, ln);
		designation = des;
		System.out.println("3 params const:"+fn+" "+ln+" "+des);
		}
	    public static void main(String[] args) {
			Employee e = new Employee("Divya","Paliwal","QA");
		}

}
