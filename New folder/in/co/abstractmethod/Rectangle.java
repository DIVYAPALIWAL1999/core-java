package in.co.abstractmethod;

public   class Rectangle extends Shape {
	private int length;
	private int width;
	Rectangle(){
	}
	Rectangle( int l, int w){
		length  = l;
		width = w;
		double arr = length*width;
		System.out.println(arr);
		
		
	}
	/*
	 * @Override public double area() { double arr = length*width; return arr; }
	 */
	@Override
	public double area() {
		double arr= length*width;
		return arr;
	}
	

}
