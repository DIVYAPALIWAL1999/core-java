package in.co.exception;

public class TryCatchInTry {
	public static void main(String[] args) {
		try { 
			double div = 15/0;
			System.out.println(div);
		
			try {
				double div1 = 15/0;
				System.out.println(div);
				
			}catch(ArithmeticException e) {
				
				System.out.println("hello");
			}	
			
			}catch(Exception e) {
           
			System.out.println("java");
		}
	
		
		
		}
}