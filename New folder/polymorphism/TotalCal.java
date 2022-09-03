package in.co.rays.polymorphism;

public class TotalCal {
	public static void main(String[] args) {
		Shape []s =new Shape[3];
		
		s[0] = new Circle(10);
		s[1] = new Rectangle (10,20);
		s[2] = new Triangle (30,10);
		
		double tarea = calcArea(s);
		System.out.println(tarea);
		}
        private static double calcArea(Shape[] s) {
		double tarr = 0;
		for (int i=0;i<s.length;i++){
			tarr = tarr + s[i].area();
		}
		return tarr;
			
		}
	}


