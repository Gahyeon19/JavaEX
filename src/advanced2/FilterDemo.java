package advanced2;

import java.util.Comparator;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    //c로 시작하는 값 추출
    Stream<String> s = Stream.of("a1", "a2", "b1", "c1", "c2", "c3");
    s.filter(x -> x.startsWith("c"))    //c로 시작하는 String
        .skip(1)    //1개 건너뛰기 (skip(2) > 2개 건너뛰기
        .forEach(System.out::println);

    //짝수만 추출 + 중복 값은 한 개만 추출
    Stream<Integer> i = Stream.of(1,2,1,3,3,2,4);
    i.filter(n -> n % 2 == 0)   //짝수
        .distinct()   //distinct 는 중복 값 제거
        .forEach(System.out::println);

    //인구가 1억이 넘는 국가 중에서 인구가 큰 순서대로 2개만 출력
    Stream<Nation> nations = Nation.nations.stream();
    nations.filter(n -> n.getPopulation() > 100)    //인구가 1억이 넘는 nation
        .sorted(Comparator.comparing(Nation::getPopulation).reversed())   //인구가 큰 순서대로 정렬
        .limit(2)   //limit 은 갯수 제한
        .forEach(System.out::println);
  }
}
