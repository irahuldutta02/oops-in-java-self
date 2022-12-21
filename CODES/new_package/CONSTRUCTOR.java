package new_package;
class Student1 {

    String name;
    int age;

    // default non parameterized 
    Student1() {
      System.out.println("default non parameterized called");
    }
    
    // parameterized
    Student1(String name, int age) {
      this.name = name;
      this.age = age;
      System.out.println("parameterized called");
      System.out.println(this.name +"'s age is now "+ this.age );
    }

    // copy constructor
    Student1(Student1 s2) {
      this.name = s2.name;
      this.age = s2.age;
      System.out.println("Copy Constractor aclled");
      System.out.println(this.name +"'s age is now "+ this.age );
    }
  }
public class CONSTRUCTOR {

  public static void main(String[] args) {
	  Student1 s1 = new Student1("Rahul", 20);
	  Student1 s2 = new Student1(s1);
	  Student1 s3 = new Student1();

  }
}
