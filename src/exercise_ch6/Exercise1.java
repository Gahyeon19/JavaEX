package exercise_ch6;

//강의자료 6.상속 - 프로그래밍 문제 1
public class Exercise1 {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    ColoredCircle cc = new ColoredCircle(10, "빨간색");

    c.show();
    cc.show();
  }
}

class Circle{
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  void show(){
    System.out.println("반지름이 " + radius + "인 원이다.");
  }
}

class ColoredCircle extends Circle{
  String color = "";

  public ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }

  @Override
  void show() {
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
  }
}