package interface_;

public class Computer implements Controllable{
  @Override
  public void turnOn() {
    System.out.println("Turn On Computer");
  }

  @Override
  public void turnOff() {
    System.out.println("Turn Off Computer");
  }

  @Override
  public void repair() {
    System.out.println("Repairing Computer ...");
  }
}
