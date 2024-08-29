package advanced2;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
//    Stream<String> s1 = Stream.of("d1", "a1", "b1", "c2", "e1");
//    s1.sorted().forEach(System.out::println);

//    System.out.println("나라 이름 순");
//    Stream<Nation> n1 = Nation.nations.stream();
//    n1.sorted(Comparator.comparing(Nation::getName))
//        .forEach(Util::printWithParenthesis);

    //GDP가 높은 순서부터
    System.out.println("GDP 높은 순");
    Stream<Nation> n2 = Nation.nations.stream();
    n2.sorted(Comparator.comparing(Nation::getGdpRank))
        .map(Nation::getName)
        .forEach(Util::printWithParenthesis);


  }
}
