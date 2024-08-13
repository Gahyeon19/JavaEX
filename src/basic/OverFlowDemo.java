package basic;

public class OverFlowDemo {
  public static void main(String[] args) {
    int a = 1_000_000;  //보기 쉽게 3개씩 끊어서 표기
    int b = 2_000_000;
//    int result = a * b;   //int의 범위 내 최대값보다 큰 값을 출력해야하므로 오버플로우 발생
    long result = (long)a * b;    //하나만 long으로 설정하면 나머지도 long이 됨

    System.out.println(result);
  }
}
