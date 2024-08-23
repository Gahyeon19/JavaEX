package interface_;

//Computer class 상속, Portable interface 상속 > 다중 상속
public class Notebook extends Computer implements Portable{
  @Override
  public void inMyBag() {
    System.out.println("Notebook is in my bag");
  }

  @Override
  public void turnOn() {
    System.out.println("Turn On Notebook");
  }

  @Override
  public void turnOff() {
    System.out.println("Turn Off Notebook");
  }

  @Override
  public void repair() {
    System.out.println("Repairing Notebook ...");
  }

}
