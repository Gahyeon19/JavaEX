package intermediate;

public class UpcastingDowncastingDemo {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = (Student) p;  //오류 발생

    //upcasting 후 downcasting 해야 오류 발생안됨
    Student s = new Student();
    Person p = s;   //자동 형변환, upcasting
    String name = p.name;
    p.whoami();   //"나는 사람이다."
    Student s2 = (Student) p;   //downcasting
    System.out.println(s2.number);   //"7"
    s2.work();    //"나는 공부한다."
    //Student를 upcasting 했으면 Student만 downcasting 할 수 있다.
    //자식들 간 upcasting, downcasting 불가

  }
}


