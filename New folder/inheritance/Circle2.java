package in.co.rays.inheritance;

public class Circle2 extends Shapeforcircle {
	public static void main(String[] args) {
		Shapeforcircle c=new Shapeforcircle();
		c.setBorderwidth(6);
		c.setColor("Lemon");
		c.setRadius(5);

		c.area();
		
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println(c.getRadius());
	}

}
