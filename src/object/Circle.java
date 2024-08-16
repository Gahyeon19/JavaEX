package object;

class Circle {
  // 필드
  private int radius = 1;

  //생성자 (기본생성자, ...)
//  public Circle(){
//
//  }

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
    double area =  radius * radius * Math.PI;
    return area;
  }
}
