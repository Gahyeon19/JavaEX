package object;

public class StringDemo {
  public static void main(String[] args) {
    String s1 = new String();
    String s2 = new String("A");

    System.out.println("s1 : \"" + s1 + "\"");
    System.out.println("s2 : \"" + s2 + "\"");

    String s3 = "B";  //String 타입의 변수 선언과 초기화
    String s4 = s3;

    System.out.println("s3와 s4를 동일 객체로 공유했을 때");
    System.out.println("s3 : \"" + s3 + "\"");
    System.out.println("s4 : \"" + s4 + "\"");

    s4 = "BBB";
    System.out.println("s4의 값을 변경했을 때");
    System.out.println("s3 : \"" + s3 + "\"");
    System.out.println("s4 : \"" + s4 + "\"");


  }
}
