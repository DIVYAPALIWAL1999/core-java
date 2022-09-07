package in.co.exception;

public class AgainTestException {
	public static void main(String[] args) {
		try {
			String s = "java";
			System.out.println(s.length());
			double div = 15/0;
			System.out.println(div);
		}catch(ArithmeticException e) {
			System.out.println("you cannt divide by zero");
		}catch(NullPointerException e) {
			System.out.println("String is empty");
		}
	}

}
