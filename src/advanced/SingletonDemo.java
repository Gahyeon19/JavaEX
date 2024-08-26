package advanced;

public class SingletonDemo {
  public static void main(String[] args) {
//    Singleton singleton = new Singleton(); > 오류 발생

    Singleton i1 = Singleton.getInstance();
    Singleton i2 = Singleton.getInstance();
    System.out.println(i1.getValue()); //10
    System.out.println(i2.getValue()); //10

    System.out.println(i1 == i2);   //true
    System.out.println(i1); //i1과 i2는 같은 것을 가리키고 있기 때문에 주소도 같다.
    System.out.println(i2); //
  }
}

class Singleton{
  //private 접근 권한을 갖는 정적 필드 선언과 초기화
  private static Singleton singleton = new Singleton();

  //private 접근 권한을 갖는 생성자 선언
  private Singleton(){

  }

  public static int getValue(){
    return 10;
  }

  //public 접근 권한을 갖는 정적 메소드 선언
  public static Singleton getInstance(){
    return singleton;
  }
}
