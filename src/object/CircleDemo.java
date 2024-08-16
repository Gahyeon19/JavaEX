package object;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();

    c1.setRadius(9);
    c1.printRadius();
    System.out.println("원의 넓이 : " + c1.getArea());
  }
}
