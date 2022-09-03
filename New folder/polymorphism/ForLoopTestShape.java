package in.co.rays.polymorphism;

public class ForLoopTestShape {
	public static void main(String[] args) {
		
		Shape[] s  = new Shape[3];
		s[0] = new Circle(10);
		s[1] = new Rectangle(20,30);
		s[2] = new Triangle(10,15);
		for(int i=0;i<3;i++) {
			System.out.println(s[i].area());
		}
		}

}
