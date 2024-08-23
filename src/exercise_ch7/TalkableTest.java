package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 4
public class TalkableTest {
  static void speak(Talkable talkable){
    talkable.talk();
  }

  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}
