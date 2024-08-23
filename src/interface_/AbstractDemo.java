package interface_;

//추상클래스
public class AbstractDemo {
  public static void main(String[] args) {
    Circle c = new Circle();

  }
}

abstract class Shape{
  abstract void method1();  //추상 매서드들은 자식 클래스에서 구현
  abstract void getArea();
}

class Circle extends Shape{
  @Override
  void method1() {
  }

  @Override
  void getArea() {
  }
}
