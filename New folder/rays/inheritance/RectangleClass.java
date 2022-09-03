package in.co.rays.inheritance;

public class RectangleClass {
private int length,width;

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}
public void area() {
	double arr=length*width;
	System.out.println("Area of Rectangle ="+arr);
	 
}
}
