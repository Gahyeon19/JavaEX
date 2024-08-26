package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 3-4
/**
 * 나이 순서대로(연장자가 먼저 출력됨, 내림차순) 정렬한 후 출력
 */

import java.util.Arrays;
import java.util.Collections;

public class Exercise3_4 {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동", 32, 170, 75),
        new Person("박지성", 40, 175, 68),
        new Person("손흥민", 20, 180, 70)};

    for (Person person : persons) {
      System.out.println(person);
    }

//    Arrays.sort(persons);  //(방법1)
    
    Arrays.sort(persons, Collections.reverseOrder());   //reverse (방법2)
    System.out.println();
    for (Person person : persons) {
      System.out.println(person);
    }
  }
}

class Person implements Comparable{
  String name;
  int age;
  int height;
  int weight;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Person[name=" + name + '\"' + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
  }

//  @Override
//  public int compareTo(Object o) {
//    if (o instanceof Person){
//      Person person = (Person) o;
//      return person.age - this.age;   //age 기준 내림차순 정렬 (방법1)
//    }
//    return -999999999;
//  }
@Override
public int compareTo(Object o) {
  if (o instanceof Person){
    Person person = (Person) o;
    return this.age - person.age;   //age 기준 오름차순 정렬 (방법2)
  }
  return -999999999;
}
}