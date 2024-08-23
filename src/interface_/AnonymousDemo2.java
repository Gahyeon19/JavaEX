package interface_;

public class AnonymousDemo2 {
  public static void main(String[] args) {
    Parent p = new Parent() {
      //익명 객체
      @Override
      public void callOnce() {  //아래의 OnlyOnce class 를 만든 것과 같은 효과
        System.out.println("딱 한 번만 호출됩니다.");
      }
    };
    p.callOnce();
  }
}

interface Parent{
  void callOnce();
}


//class OnlyOnce implements Parent{   //한번만 사용할 class
//  @Override
//  public void callOnce() {
//    System.out.println("딱 한번만 호출됩니다.");
//  }
//
//}