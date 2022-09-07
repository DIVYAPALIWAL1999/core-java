package in.co.abstractmethod;

public  class Triangle extends Shape {
private int height;
private int base;
 Triangle(){
 }
 Triangle( int h, int b){
	 height = h;
	 base = b;
	 
 }
	/*
	 * @Override public double area() { double arr = (height*base)/2; return arr; }
	 */
@Override
public double area() {
	return 0;
}
}
