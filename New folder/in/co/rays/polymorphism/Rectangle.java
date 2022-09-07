package in.co.rays.polymorphism;

public class Rectangle extends Shape{
	private int length;
	private int width;
	public static final double PI= 3.14;
    Rectangle(){
    }
    Rectangle(int l,int w){
    	length = l;
    	width = w;
    	
    }
    public double area() {
    	double arr = length*width;
    	return arr;
    }
}
