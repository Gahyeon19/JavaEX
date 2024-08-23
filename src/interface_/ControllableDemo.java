package interface_;

public class ControllableDemo {
  public static void main(String[] args) {
    /*
    controllable 객체 배열을 이용(TV와 Computer 객체를 배열에 저장)
    반복문으로 모든 배열의 요소인 각 객체에 대해서 각각 켜고 끄고 수리한다.
    최종적으로 초기화한다.
     */
    Controllable[] controllables = {new TV(), new Computer()};

    for (Controllable controllable : controllables) {
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
    }
    Controllable.reset();
  }
}
