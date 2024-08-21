package intermediate;

import java.util.Arrays;

public class UpcastingDemo {
  public static void main(String[] args) {
//    Student s = new Student();
//    System.out.println(s.name); //사람
//    System.out.println(s.number); //7
//    s.whoami(); //나는 사람이다.
//    s.work(); //나는 공부한다.
//
//    Person p = s;
//    //p.number 사용 불가
//    //p.work() 사용 불가
//    System.out.println(p.name); //사람
//    p.whoami(); //나는 사람이다.

    //Person 배열 하나만 만들어도 안에 Student, Employee, Owner, Army 모두를 담을 수 있다.
    Person[] persons = new Person[5];
    persons[0] = new Student();
    System.out.println(persons[0].seq);
    persons[1] = new Owner();
    System.out.println(persons[1].seq);
    persons[2] = new Student();
    System.out.println(persons[2].seq);
    persons[3] = new Army();
    System.out.println(persons[3].seq);
    persons[4] = new Employee();
    System.out.println(persons[4].seq);



  }
}

class Person{
  String name = "사람";
  static int seq = 0;

  public Person() {
    seq++; //자식 객체들이 호출될때마다 부모 생성자 호출됨.
  }

  void whoami(){
    System.out.println("나는 사람이다.");
  }
}

class Student extends Person{

  int number = 7;
  void work(){
    System.out.println("나는 공부한다.");
  }
}

class Employee extends Person{
  int number = 10;
  void work(){
    System.out.println("나는 회사에서 일한다.");
  }
}

class Owner extends Person{
  int number = 3;
  void work(){
    System.out.println("나는 회사를 관리한다.");
  }
}

class Army extends Person{
  int number = 5;
  void work(){
    System.out.println("나는 국가를 지킨다.");
  }
}