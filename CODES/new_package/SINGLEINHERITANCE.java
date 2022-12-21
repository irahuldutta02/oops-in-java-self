package new_package;

class Shape4 {

	public void area() {
		System.out.println("Displays Area of Shape");
	}
}

class Triangle4 extends Shape4 {

	public void area(int h, int b) {
		System.out.println((1 / 2) * b * h);
	}
}

public class SINGLEINHERITANCE {

	public static void main(String[] args) {
	}
}
