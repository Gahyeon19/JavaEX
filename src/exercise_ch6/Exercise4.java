package exercise_ch6;

//강의자료 6.상속 - 프로그래밍 문제 4
public class Exercise4 {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);   //"영조"      //필드는 Override 되지 않는다.
    p.print();                    //"사도세자"   //매서드는 Override 된다.

  }
}

class Parent{
  String name = "영조";

  void print(){
    System.out.println(this.name);
  }
}

class Child extends Parent{
  String name = "사도세자";

  @Override
  void print() {
    System.out.println(this.name);
  }
}
