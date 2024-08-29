package exercise_ch12;

//이것이 자바다 17.스트림 확인문제 6(774p)
/**
 * List 에 저장되어 있는 Member 의 평균 나이 출력
 */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Exercise6 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", 30),
        new Member("신용권", 40),
        new Member("김자바", 26));

    //MAPTOINT
    OptionalDouble avg = list.stream()
        .mapToInt(Member::getAge)
        .average();

    System.out.println("평균 나이 : " + avg.getAsDouble());
  }
}

class Member{
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}