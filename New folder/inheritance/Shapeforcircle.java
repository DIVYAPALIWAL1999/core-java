package in.co.rays.inheritance;

public class Shapeforcircle {
	private String color;
	private int borderwidth;
	private int radius;
	
	public static  double PI = 3.14;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
        this.radius = radius;
	}
	
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public static double getPI() {
		return PI;
	}
	public void area() {
		double arr = PI*radius*radius;
		
		System.out.println("Area of circle =" + arr);
	}
		

	

}
