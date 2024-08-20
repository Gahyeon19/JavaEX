package object;

import java.util.Arrays;

public class CircleArrayDemo {
  public static void main(String[] args) {
    //Circle을 원소로 가지는 배열 circles를 생성. 배열의 크기는 5.
    //첫번째와 두번째 원소만 원의 반지름이 각각 3, 4가 되도록 circle 객체를 생성.
    //객체가 생성되어 있을 경우에만 원의 넓이를 구하여 출력.

    Circle[] circles = new Circle[5];
    circles[0] = new Circle(3);
    circles[1] = new Circle(4);
//    System.out.println(Arrays.toString(circles));

//    for (int i = 0; i < circles.length; i++) {
//      if (circles[i] != null){
//        double Area = circles[i].getArea();
//        System.out.printf("%d번째 원의 넓이 : %.3f\n", (i + 1), Area);
//      }
//      else {
//        System.out.println("생성된 객체가 없습니다.");
//        break;
//      }
//    }

    for (Circle circle : circles) {
      if (circle != null){
        double Area = circle.getArea();
        System.out.printf("반지름이 %d인 원의 넓이 : %.3f\n", circle.getRadius(), Area);
      }
      else {
        System.out.println("생성된 객체가 없습니다.");
        break;
      }
    }
  }
}
