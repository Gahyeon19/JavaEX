package intermediate;

public class InstanceOfDemo2 {
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(5);
    Circle c3 = new Circle(3);
    Person p = new Person();

    System.out.println(c1.equals(c2));  //ture
    System.out.println(c1.equals(c3));  //false
    System.out.println(c1.equals(p));   //false
  }
}

class Circle{
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  //Ctrl+O : Override 단축키
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      Circle c = (Circle) obj;  //downcasting
      return this.radius == c.radius;
    }
    return false;
  }
}
