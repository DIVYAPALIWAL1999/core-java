package in.co.abstractmethod;

public  class Circle extends Shape  {
	private int radius;
	public static final double PI = 3.14;
	
	Circle(){
	}
	Circle(int r) {
		radius = r;
		
	}
	public  double area() {
		double arr = PI*radius*radius;
		return arr;
	}
}
