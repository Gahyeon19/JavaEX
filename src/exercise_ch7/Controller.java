package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 5
abstract class Controller {
  boolean power;
  void show(){};
  abstract String getName();
}

class TV extends Controller {
  public TV(boolean power) {
    super.power = power;
  }

  @Override
  public String getName() {
    return "TV";
  }

  @Override
  public void show() {
    if (power) {
      System.out.println(getName() + "가 켜졌습니다.");
    } else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }
}

class Radio extends Controller {
  public Radio(boolean power) {
    super.power = power;
  }

  @Override
  public String getName() {
    return "Radio";
  }

  @Override
  public void show() {
    if (power) {
      System.out.println(getName() + "가 켜졌습니다.");
    } else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }
}
