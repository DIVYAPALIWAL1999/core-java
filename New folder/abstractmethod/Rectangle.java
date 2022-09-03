package in.co.abstractmethod;

public   class Rectangle extends Shape {
	private int length;
	private int width;
	Rectangle(){
	}
	Rectangle( int l, int w){
		length  = l;
		width = w;
		
	}
	public  double area() {
		double arr = length*width;
		return arr;
	}
	

}
