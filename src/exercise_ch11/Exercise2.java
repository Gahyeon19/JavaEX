package exercise_ch11;

//강의자료 11.컬렉션 - 프로그래밍 문제 2
/**
 * Person 클래스 작성
 * - 이름과 나이를 포함. 이름과 나이를 반환하도록 toString() 메서드 오버라이딩
 * 객체를 중복 없이 저장하는 HashSet 컬렉션에 Person 객체를 추가.
 * HastSet은 원소의 중복 여부를 hashCode() 와 equals() 메서드를 이용해 판단.
 * 반복자를 사용해 HashSet 컬렉션 원소 출력.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Exercise2 {
  public static void main(String[] args) {
    Set<Person> personSet = new HashSet<>();

    personSet.add(new Person("김열공", 20));
    personSet.add(new Person("최고봉", 56));
    personSet.add(new Person("우등생", 16));
    personSet.add(new Person("나자바", 35));

    //중복 값을 넣어도 hashCode 와 equals 메서드를 통해 알아서 걸러준다.
    personSet.add(new Person("나자바", 35));
    personSet.add(new Person("우등생", 16));

    Iterator<Person> iterator = personSet.iterator();
    Person p;

    while (iterator.hasNext()){
      p = iterator.next();
      System.out.println(p.name + " : " + p.age);
    }

    iterator = personSet.iterator();
    while (iterator.hasNext()){
      System.out.print(iterator.next() + " ");
    }


  }
}

class Person{
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //equals 와 hashCode 는 항상 같이 Override 해주어야 한다.
  //방법1
//  @Override
//  public boolean equals(Object o) {
//    if (o instanceof Person){
//      Person p = (Person) o;
//      return age == p.age && name.equals(p.name);
//    }
//    return false;
////    if (this == o) return true;
////    if (o == null || getClass() != o.getClass()) return false;
////    Person person = (Person) o;
////    return age == person.age && Objects.equals(name, person.name);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(name, age);
//  }

  //방법2
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Person[" + name + " : " + age + "]";
  }
}