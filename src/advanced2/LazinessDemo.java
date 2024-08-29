package advanced2;

import java.util.stream.IntStream;

public class LazinessDemo {
  public static void main(String[] args) {
    //중간 연산과 최종 연산
    //filter, map : 중간 연산
    //forEach : 최종 연산
    //중간 연산은 최종 연산을 만나기 전까지는 실행되지 않는다.
    IntStream is = IntStream.rangeClosed(1, 5);

    //짝수만 제곱하여 출력
    is.filter(
        i -> {
          System.out.println("filter: " + i);
          return i % 2 == 0;
    }).map(
        i -> {
          System.out.println("map : " + i);
          return i * i;
    }).forEach(System.out::println);

//    is.forEach();

  }
}
