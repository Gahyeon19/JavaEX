package object;

import java.util.ArrayList;

public class DynamicArrayDemo {
  public static void main(String[] args) {
    //동적 배열

    //문자열 동적 배열
    ArrayList<Object> strings = new ArrayList<>();
    strings.add("A");
    strings.add("B");
    strings.add("C");
    System.out.println(strings);  //[A, B ,C]
    System.out.println(strings.size());   //3

    //Circle 객체 배열
    ArrayList<Circle> circles = new ArrayList<>();
    circles.add(new Circle(2));
    System.out.println(circles.size());   //1
    circles.add(new Circle(4));
    System.out.println(circles.size());   //2
    System.out.println(circles);  //Override로 구현한 toString 매서드 내용이 출력된다.
                                  // [반지름이 2인 원의 넓이 : 12.57, 반지름이 4인 원의 넓이 : 50.27]

    //int 동적 배열
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    System.out.println(numbers.size());
    System.out.println(numbers);

    //.add(데이터)
    //.remove(인덱스번호)
    //.get(인덱스번호)
    //.size()
  }
}
