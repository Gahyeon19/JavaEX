package object;

import java.awt.geom.Area;

class Circle {
  // 필드
  private int radius = 1;
  static final double PI = Math.PI;

  //생성자 -m "생성자 practice"
  public Circle(int radius){
    if (radius <= 0){
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    }
    else {
      this.radius = radius;
    }
  }

  //Alt + Insert 키로 자동생성 가능
  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    if (radius <= 0){
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    }
    else {
      this.radius = radius;
    }
  }

  //매서드
  /**
   * 원의 반지름을 출력하는 매서드
   * 인스턴스를 생성해야 호출할 수 있는 매서드
   * 매개변수X, 리턴값X
   */
  public void printRadius(){
    System.out.println("원의 반지름 : " + radius);
  }

  /**
   * 원의 넓이를 반환하는 매서드
   * 매개변수X, 리턴값O (double)
   */
  public double getArea(){
//    final double PI = 3.14;
    double area =  radius * radius * PI;
    return (Math.round(area*100)/100.0);  //소수 둘째자리까지 반환
  }

  @Override
  public String toString(){   //toString 재정의
    return "반지름이 " + radius + "인 원의 넓이 : " + getArea();
  }

//  @Override     //Alt+Insert 키 눌러서 자동생성된 toString 매서드
//  public String toString() {
//    return "Circle{" +
//        "radius=" + radius +
//        '}';
//  }
}
