package intermediate;

public class InheritanceDemo3 {
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();

    child.method1();
    child.method2();
    child.method3();


  }
}

class Parent{
  void method1(){
    System.out.println("Parent method1");
  }
  void method2(){
    System.out.println("Parent method2");
  }

}

class Child extends Parent{
  void method3(){
    System.out.println("Child method3");
  }

  @Override
  void method2() {
    System.out.println("Child method2");
  }
  void method1(){
    System.out.println("Child method1");
  }
}
