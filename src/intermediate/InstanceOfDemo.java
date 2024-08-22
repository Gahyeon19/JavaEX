package intermediate;

import java.util.Arrays;

public class InstanceOfDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = new Person();
    Army a = new Army();

    System.out.println(s instanceof Student);   //true
    System.out.println(s instanceof Person);    //true
    System.out.println(s instanceof Object);    //true
    System.out.println(p instanceof Student);   //false
    System.out.println(p instanceof Person);    //true

    downcast(s);  //"7" //"나는 공부한다"
    downcast(a);  //"5" //"나는 국가를 지킨다"
  }

  private static void downcast(Person p) {
    if (p instanceof Student s){
//      Student s = (Student) p;
      System.out.println(s.number);
      s.work();
    }
    if (p instanceof Army a){
//      Army a = (Army) p;
      System.out.println(a.number);
      a.work();
    }
  }
}
