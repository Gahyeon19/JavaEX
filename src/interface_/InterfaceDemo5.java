package interface_;

public class InterfaceDemo5 {
  public static void main(String[] args) {

    Movable m = new Vehicle();
    Vehicle v = new Car();
    Movable c = new Car();

    m.move(3);
    v.move(10);
    c.move(5);

    Car car1 = (Car) c;
    Car car2 = (Car) v;

    car1.show();
    car2.show();
  }
}
