package in.co.rays.inheritance;

public class TriangleClass {
	private int base,hight;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}
	public void area() {
		double bh = (base*hight)/2;
		System.out.println("Area of triangle ="+bh);
	}
	

}
