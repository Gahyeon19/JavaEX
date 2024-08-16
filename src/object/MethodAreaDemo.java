package object;

public class MethodAreaDemo {
  public static void main(String[] args) {
    System.out.println(Math.PI);

    Circle circle = new Circle(3);
    int r = circle.getRadius();
    double area = r * r * Math.PI;
    System.out.printf("원의 반지름은 %d, 넓이는 %.2f", r, area);
  }
}
