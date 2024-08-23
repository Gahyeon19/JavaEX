package interface_;

/**
 * 장비를 켜고 끄는 기능을 구현해야 하며,
 * 수리와 초기화 기능이 구현되어 있습니다.
 */

public interface Controllable {
  default void repair(){
    show("Repairing Machine ...");
  }

  static void reset(){
    System.out.println("Reset Machine");
  }

  private void show(String s){
    System.out.println(s);
  }

  void turnOn();
  void turnOff();

}
