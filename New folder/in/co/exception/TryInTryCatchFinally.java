package in.co.exception;

public class TryInTryCatchFinally {
	public static void main(String[] args) throws NullPointerException {
		try {
		try {
			String s = null;
			System.out.println(s.length());
			
		    }catch(NullPointerException b) {
				System.out.println("hello java");
		}
		double div = 15/0;
		System.out.println(div);
		}
		catch(ArithmeticException b) {
				System.out.println("java");
		
		try {
			int i =10/0;
			System.out.println(i);
		}catch(ArithmeticException b1) {
			System.out.println("hello");
		}
		}
		finally{
		try {
				double d = 10/0;
				System.out.println();
				}catch(ArithmeticException b3) {
					System.out.println("its completed");
			}
		}
		}
}
