package in.co.rays.polymorphism;

public class Triangle extends Shape {
	private int height;
	private int base;
	public static final double PI = 3.14;
	Triangle(){
	}
	Triangle(int h,int b){
		height = h;
		base = b;
	}
	public double area() {
		double arr= (height*base)/2;
		return arr;
	}
	
	

}
