package exercise_ch6;

//강의자료 6.상속 - 프로그래밍 문제 3
public class Exercise3 {
  public static void main(String[] args) {
    //upcasting
    Person[] people =  new Person[3];
    people[0] = new Person("길동이", 22);
    people[1] = new Student("황진이", 23, "100");
    people[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");
//
//    System.out.println(people[0].show() + "]");
//    System.out.println(people[1].show() + "]");
//    System.out.println(people[2].show() + "]");

    for (Person person : people) {
      System.out.println(person.show() + "]");
    }
  }
}

class Person{
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String show(){
    return  "사람[이름 : " + this.name + ", 나이 : " + this.age;
  }
}

class Student extends Person{
  private String number;

  public Student(String name, int age, String number) {
    super(name, age);
    this.number = number;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String show() {
    return super.show() + ", 학번 : " + this.number ;
  }
}

class ForeignStudent extends Student{
  private String nationality;

  public ForeignStudent(String name, int age, String number, String nationality) {
    super(name, age, number);
    this.nationality = nationality;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  @Override
  public String show() {
     return super.show() + ", 국적 : " + this.nationality;
  }
}
