package interface_;

public interface MyInterface {
  int MAX= 10; //상수. public static final 생략됨.
  void sayHello();  //abstract method. public abstract 생략됨.
  default void sayGoodbye(){
    System.out.println("상수값은 : " + getMax());
    System.out.println("Good bye! ");
  };

  static void method(){
    System.out.println("static method 입니다.");
  }

  private int getMax(){
    return MAX;
  }

}


