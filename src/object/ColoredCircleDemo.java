package object;

public class ColoredCircleDemo {
  public static void main(String[] args) {
    ColoredCircle cc1 = new ColoredCircle();
    System.out.printf("1번 원의 반지름 : %d, 색깔 : %s\n", cc1.r, cc1.color);
    cc1.showStatus();

    ColoredCircle cc2 = new ColoredCircle("Yellow");
    System.out.printf("2번 원의 반지름 : %d, 색깔 : %s\n", cc2.r, cc2.color);
    cc2.showStatus();

    ColoredCircle cc3 = new ColoredCircle(10);
    System.out.printf("3번 원의 반지름 : %d, 색깔 : %s\n", cc3.r, cc3.color);
    cc3.showStatus();

    ColoredCircle cc4 = new ColoredCircle(9, "Blue");
    System.out.printf("4번 원의 반지름 : %d, 색깔 : %s\n", cc4.r, cc4.color);
    cc4.showStatus();
  }
}

class ColoredCircle{
  //멤버 - 필드
  static int numOfCircles=0;    //static 정적 변수 사용
  int r;
  String color;

  //생성자 - 오버로딩
  public ColoredCircle(){
//    color = "white";
    this(1,"White");
  }
  public ColoredCircle(String color){
//    if (color == null || color.equals("") || color.equals(" ")){  //isEmpty() , isBlank()
////      this.color = "white";
//    }
//    else {
//      this.color = color;
//    }
    this(1, color);
  }
  public ColoredCircle(int radius){
//    if (radius > 0){
//      this.r = radius;
//    }
    this(radius, "White");
//    this.color = "white";
  }
  public ColoredCircle(int radius, String color){
    if (radius > 0){
      this.r = radius;
    }
    else {
      this.r = 1;
    }

    if (color == null || color.equals("") || color.equals(" ")){  //isEmpty() , isBlank()
      this.color = "White";
    }
    else {
      this.color = color;
    }

    numOfCircles++;
  }

  //멤버 - 매서드
  public void showStatus(){
    System.out.println(numOfCircles + "번째 원이 생성되었습니다.");
  }

}