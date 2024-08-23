package interface_;

public class TV implements Controllable{
  @Override
  public void turnOn() {
    System.out.println("Turn on TV");
  }

  @Override
  public void turnOff() {
    System.out.println("Tunr off TV");
  }
}
