package interface_;

public class InterfaceDemo {
  public static void main(String[] args) {
    Class1 c1 = new Class1();
    c1.sayHello();      //Hello!
    c1.sayGoodbye();    //상수값은 : 10 // Good bye!
    System.out.println(MyInterface.MAX);  //10

    MyInterface.method();   //static method 입니다.


  }
}

class Class1 implements MyInterface{

  @Override
  public void sayHello() {
    System.out.println("Hello! ");
  }


}
