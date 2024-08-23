package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 6
public interface Human {
  void eat();
  default void print(){     //기존에 존재하던 클래스에 영향을 주지 않기 위해 default 사용
    System.out.println("인간입니다.");
  };
  static void echo(){
    System.out.println("야호 !");
  };
}

class Worker implements Human{
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}

class Student implements Human{
  private int age;

  public Student(int age) {
    this.age = age;
  }

  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

  @Override
  public void print(){
    System.out.println(age + "세의 학생입니다.");
  }
}
