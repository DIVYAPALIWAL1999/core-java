package in.co.exception;

public class ExceptionType {
	public static void main(String[] args) {
		
		 String name ="Bhagyashree";
		 try {
			 System.out.println(name.length());
			 System.out.println(name.charAt(15));
		 }catch(NullPointerException e) {
			 System.out.println("name can't be null");
		 }catch(StringIndexOutOfBoundsException e) {
			 System.out.println("String is small");
		 }
	}

}
