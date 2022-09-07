package in.co.exception;

public class TestException2 {
	public static void main(String[] args) {
		try {
			double div = 15/0;
			System.out.println(div);
		}catch(ArithmeticException e) {
			System.err.println("you can'nt divide by zero");
		}
	}

}
//if we wants to convert output in red color instead of black then we use err instead of out in syso