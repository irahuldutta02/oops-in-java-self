package new_package;
class Shape2 {

    public void area() {
      System.out.println("Displays Area of Shape");
    }
  }

  class Triangle2 extends Shape2 {

    public void area(int h, int b) {
      System.out.println((1 / 2) * b * h);
    }
  }

  class Circle2 extends Shape2 {

    public void area(int r) {
      System.out.println((3.14) * r * r);
    }
  }
public class RUNTIMEPOLYMORPHISM {
  public static void main(String[] args) {}
}
