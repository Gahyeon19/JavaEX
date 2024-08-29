package advanced2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FindDemo {
  public static void main(String[] args) {
    Stream<Nation> stream = Nation.nations.stream();

    //Type 이 ISLAND 인 나라
    Optional<Nation> any = stream.filter(n -> n.isIsland()).findFirst();
    System.out.println(any);

//    any.ifPresent(nation -> System.out.println(nation.getName()));

    //인구가 가장 많은 나라
    stream = Nation.nations.stream();
    Optional<Nation> max = stream.max(Comparator.comparing(Nation::getPopulation));
    System.out.println(max.get());

    //인구가 1억(100)이 넘는 나라의 수
    stream = Nation.nations.stream();
    long count = stream.filter(n -> n.getPopulation() > 100).count();
    System.out.println(count);
  }
}
