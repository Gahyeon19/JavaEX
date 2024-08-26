package exercise_ch8;

//강의자료 8.기본패키지 - 프로그래밍 문제 2
/**
 * Student 클래스 작성
 */
public class Exercise2 {
  public static void main(String[] args) {
    System.out.println(new Student("김삿갓"));
    System.out.println(new Student("홍길동"));
  }
}

class Student{
  String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student[" + name + "]";
  }
}