package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 3-1
/**
 * 두 개의 라인을 생성한 후 더 길이가 긴 라인을 출력한다.
 */
public class Exercise3_1 {
  public static void main(String[] args) {
    Line L1 = new Line(10);
    Line L2 = new Line(20);

    if (L2.compareTo(L1) > 0){
      System.out.println(L2);
      System.out.println("is longer");
    } else if (L2.compareTo(L1) == -1) {
      System.out.println(L1);
      System.out.println("is longer");
    } else if (L2.compareTo(L1) == 0){
      System.out.println("Same Length");
    } else {
      System.out.println("Can't compare");
    }
  }
}