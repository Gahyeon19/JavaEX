package intermediate;

public class TypeCastingDemo {
  public static void main(String[] args) {
    Vehicle v = new Car();  //upcasting //자동 형변환
    System.out.println(v.name);   //"탈 것"
    v.whoami();                   //"나는 자동차다"
    v.move();                     //"이동하다"
    //field는 Override 할 수 없다
    //Override method인 Car의 whoami 출력
    //static이 붙은 method는 Override 할 수 없다.

    Car c = new Car();
    System.out.println(c.name);   //"자동차"
    c.whoami();                   //"나는 자동차다"
    c.move();                     //"달리다"

    SportsCar s = new SportsCar();
    System.out.println(s.name);   //"스포츠카"
    s.whoami();                   //"나는 스포츠카다"
    s.move();                     //"빨리 달리다"
  }
}

class Vehicle{
  String name = "탈 것";

  void whoami(){
    System.out.println("나는 탈 것이다");
  }

  static void move(){
    System.out.println("이동하다");
  }
}

class Car extends Vehicle{
  String name = "자동차";

  @Override
  void whoami() {
    System.out.println("나는 자동차다");
  }

  static void move(){
    System.out.println("달리다");
  }
}

class SportsCar extends Vehicle{
  String name = "스포츠카";

  @Override
  void whoami() {
    System.out.println("나는 스포츠카다");
  }

  static void move(){
    System.out.println("빨리 달리다");
  }

}