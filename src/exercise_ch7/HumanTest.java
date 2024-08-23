package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 6
public class HumanTest {
  public static void main(String[] args) {
    Human.echo();
    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new  Worker();
    p.print();
    p.eat();
  }
}
