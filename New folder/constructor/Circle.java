package in.co.rays.constructor;

import java.awt.Shape;

public class Circle  extends Shapeforcircle{
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public void area() {
	double arr = PI*radius*radius;
	System.out.println("Area of circle"+arr);
	
}
	}


