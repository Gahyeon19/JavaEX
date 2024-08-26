package exercise_ch8;
//강의자료 8.상속 - 프로그래밍 문제 1-1

/**
 * 반지름이 같은 Circle 객체를 모두 동일한 종류로 취급하는 Circle 클래스 작성
 */
public class Exercise1_1 {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if (c1.equals(c2)){
      System.out.println("c1과 c2는 같다.");
    }
    else {
      System.out.println("c1과 c2는 다르다.");
    }
  }
}

class Circle{
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle){
      Circle c = (Circle) obj;
      return radius == c.radius;
    }
    return false;
  }
}