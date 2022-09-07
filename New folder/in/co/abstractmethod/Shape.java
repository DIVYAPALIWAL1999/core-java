package in.co.abstractmethod;

public abstract class Shape {
	private static Shape Shape;
	private String color;
	private int borderWidth;

	public Shape() {

	}

	public Shape(String a, int b) {
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public static Shape getShape(int i) {
		if (i == 1)
			return new Circle();
		if (i == 2)
			return new Rectangle();
		if (i == 3)
			return new Triangle();
		return Shape;
	}

	public abstract double area();
}