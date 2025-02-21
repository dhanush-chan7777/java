class Calculate {
	static class Static {
		static void area(double r) {
			double C=3.14*r*r;
			System.out.println("Area of circle::"+C);

		}
		static void area(int s) {
			int C=s*s;
			System.out.print("Area of Square::"+C);
		}
		static void area(int l,int b) {
			int C=l*b;
			System.out.println("Area of rectangle::"+C);
		}
		static void area(int l,int b,int h) {
			int C=l*b*h;
			System.out.println("Area of Triangle::"+C);
		}
	}
}

public class Methodoverloading {
	public static void main(String []args) {
		Calculate.Static.area(9);
	}
}
