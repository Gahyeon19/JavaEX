package interface_;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();
    Controllable.reset();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    Controllable.reset();
    computer.repair();

    Notebook notebook = new Notebook();
    notebook.turnOn();
    notebook.turnOff();
    notebook.repair();
    Controllable.reset();
  }
}
