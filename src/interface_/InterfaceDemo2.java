package interface_;

public class InterfaceDemo2 {
  public static void main(String[] args) {
    Class2 c2 = new Class2();
    c2.sayHello();
    c2.sayGoodbye();
  }
}

class Class2 implements MyInterface{
  @Override
  public void sayGoodbye() {    //MyInterface 에서 dafault 로 구현되어있기때문에 Override 해도 되고 안해도 되고
    System.out.println("Good bye! ");
  }

  @Override
  public void sayHello() {
    System.out.println("Hello! ");
  }
}
