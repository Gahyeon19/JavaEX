package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 3-2
/**
 * 두 개의 삼각형을 생성한 후 더 넓이가 큰 삼각형을 출력한다.
 */
public class Exercise3_2 {
  public static void main(String[] args) {
    Triangle tri1 = new Triangle(10, 10);
    Triangle tri2 = new Triangle(10, 5);

    int res = tri1.compareTo(tri2);

    switch (res){
      case 0 :
        System.out.println("Same Area");
        break;
      case -1 :
        System.out.println(tri2);
        System.out.println("is Bigger");
        break;
      case 1 :
        System.out.println(tri1);
        System.out.println("is Bigger");
        break;
      default:
        System.out.println("Can't compare");
    }
  }
}
