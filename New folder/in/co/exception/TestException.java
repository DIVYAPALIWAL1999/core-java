package in.co.exception;

public class TestException {
	public static void main(String[] args) {
		try{
			double div = 15/0;
		
		System.out.println(div);
	}
		catch(ArithmeticException e) {
      System.out.println("you can'nt buy pizza");
}
}
}