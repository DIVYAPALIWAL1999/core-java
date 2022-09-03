package in.co.rays.oop;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setWidth(10);
		System.out.println(r1.getLength() + "  " + r1.getWidth());

		r1.area();

	}

}
