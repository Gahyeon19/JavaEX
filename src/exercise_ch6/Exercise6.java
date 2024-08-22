package exercise_ch6;

//강의자료 6.상속 - 프로그래밍 문제 6
public class Exercise6 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();      //색상 : 파랑, 속도 : 200
                   //배기량 : 1000, 기어 단수 : 5

    Vehicle v1 = new Vehicle("빨강", 250);
    System.out.println();
    v1.show();

    System.out.println();
    Vehicle v2 = c; //downcasting
    v2.show();      //색상 : 파랑, 속도 : 200
                   //배기량 : 1000, 기어 단수 : 5

  }
}

class Vehicle{
  public String color;   //자동차 색상
  public int speed;      //자동차 속도

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  void show(){
    System.out.println("색상 : " + color + ", 속도 : " + speed);
  }
}

class Car extends Vehicle{
  public int displacement;   //자동차 배기량
  public int gears;          //자동차 기어 단수

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  @Override
  void show() {
    super.show();
    System.out.println("배기량 : " + displacement + ", 기어 단수 : " + gears);
  }
}