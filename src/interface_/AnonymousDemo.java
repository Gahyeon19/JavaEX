package interface_;

public class AnonymousDemo {
  public static void main(String[] args) {
    Parent p = new OnlyOnce();
    p.callOnce();

  }
}

//interface Parent{
//  void callOnce();
//}

class OnlyOnce implements Parent{   //한번만 사용할 class
  @Override
  public void callOnce() {
    System.out.println("딱 한번만 호출됩니다.");
  }

}