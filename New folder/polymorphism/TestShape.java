package in.co.rays.polymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape[] s= new Shape[3];
		s[0]=new Circle(6);
		s[1]=new Rectangle(40,30);
		s[2]=new Triangle(10,20);
		
		double x = s[0].area();
		double y = s[1].area();
		double z = s[2].area();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		double a = x+y+z;
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
}