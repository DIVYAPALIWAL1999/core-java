package in.co.exception;

public class FinallyWithException {
	public static void main(String[] args) {
		try{
			double div = 15/0;
			System.out.println("wrong");
	}
			catch(Exception e) {
			System.out.println("correct");
			System.exit(0);
		
	}	
		    finally {
		    System.out.println("both");
	}
}
}
