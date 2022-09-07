package in.co.overloading;

public class Add {
	
	public void add(int a,int b) {
		System.out.println(a+b);
    }
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	
	}
	public void add (String a, String b) {
		System.out.println(a+b);
	}
	public double add (double a, int b,int c) {
		return (a+b);
	}

}
