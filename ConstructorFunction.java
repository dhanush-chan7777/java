class Car {
	String brand;
	Car() {
		brand="unknown";
	}
	void setbrand() {
		brand="BMW";

	}
}

public class ConstructorFunction {
	public static void main(String []args) {
		Car obj=new Car();

		obj.setbrand();
		System.out.println("Car brand::"+obj.brand);

	}
}
