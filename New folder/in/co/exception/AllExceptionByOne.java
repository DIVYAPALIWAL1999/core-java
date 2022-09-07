package in.co.exception;

public class AllExceptionByOne {
	public static void main(String[] args) {
		try {
			double div = 15/0;
			System.out.println("hello");
			}catch(Exception e) {
			System.out.println("java");
			}
		try {
			double div = 16/0;
			System.out.println("hii");
		}catch (Exception e1) {
			System.out.println("Divya");
		}
	}

}
