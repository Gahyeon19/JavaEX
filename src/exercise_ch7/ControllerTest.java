package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 5
public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = {new TV(false), new Radio(true)};

    for (Controller controller : controllers) {
      controller.show();
    }
  }
}
