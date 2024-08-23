package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 4
public interface Talkable {
  void talk();
}

class Korean implements Talkable{
  @Override
  public void talk() {
    System.out.println("안녕하세요!");
  }
}

class American implements Talkable{
  @Override
  public void talk() {
    System.out.println("Hello!");
  }
}
