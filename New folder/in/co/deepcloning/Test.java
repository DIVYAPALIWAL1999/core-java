package in.co.deepcloning;

public class Test {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();
		e.setId("1");
		e.setName("divya");

		Address a = new Address();
		a.setStreet("mushakhedi");
		a.setCity("indore");
		a.setState("madhya pradesh");

		Employee e1 = (Employee) e.clone();
		Address a1 = (Address) a.clone();

		System.out.println(e1.getId());
		System.out.println(e1.getName());

		System.out.println(a1.getStreet());
		System.out.println(a1.getCity());
		System.out.println(a1.getState());
		System.out.println("----------------");

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(a.getStreet());
		System.out.println(a.getCity());
		System.out.println(a.getState());
	}

}
