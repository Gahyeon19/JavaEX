package exercise_ch12;

//이것이 자바다 17.스트림 - 확인문제 5(773p)
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("This is a java book", "Lambda Expressions", "Java8 supports lambda expressions");

    list.stream()
        .filter(s -> s.toLowerCase().contains("java"))
        .forEach(System.out::println);


  }
}
