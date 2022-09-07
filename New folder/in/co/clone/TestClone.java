package in.co.clone;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a = new Address();
		a.setStreet("Vijaynagar");
		a.setCity("pune");
		a.setState("MHT");
		
		Employee e = new Employee();
		e.setFname("Divya");
		e.setLname("Paliwal");
		e.setId("123");
		e.setAddr(a);
		
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getId());
		System.out.println(e.getAddr().getStreet());
		System.out.println(e.getAddr().getCity());
		System.out.println(e.getAddr().getState());
		System.out.println();
				
		Employee e1 =(Employee) e.clone();
		System.out.println(e1.getFname());
		System.out.println(e1.getLname());
		System.out.println(e1.getId());
		System.out.println(e1.getAddr().getStreet());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getState());
	
	}	
		
	}
	
		
	