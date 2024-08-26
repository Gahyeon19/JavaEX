package exercise_ch8;

//강의자료 8.기본패키지 - 프로그래밍 문제 1-2
/**
 * 주민번호와 이름이 같은 Person 객체를 동일한 사람으로 치급하는 Person 클래스 작성
 */

import java.util.Objects;

public class Exercise1_2 {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");
    Person p3 = new Person("111111", "손흥민");

    if (p1.equals(p2)){
      System.out.println("같은 사람이다.");
    }
    else {
      System.out.println("다른 사람이다.");
    }

    if (p3.equals(p2)){
      System.out.println("같은 사람이다.");
    }
    else {
      System.out.println("다른 사람이다.");
    }
  }
}

class Person{
  String num;
  String name;

  public Person(String num, String name) {
    this.num = num;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    Person person = (Person) o;
//    return num == person.num && name == person.name;
    if (o instanceof Person){
      Person person = (Person) o;
      return num.equals(person.num) && name.equals(person.name);
    }
    return false;
  }

}
