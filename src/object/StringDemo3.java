package object;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = ", JAVA";

    System.out.println("s1의 길이는 " + s1.length());

    String concat = s1.concat(s2);  //s1 문자열 뒤에 s2 문자열 붙여서 새로운 객체 생성
    System.out.println(concat);

    System.out.println(s1.toUpperCase());   //s1 문자열을 대문자로 바꿔서 새로운 객체가 생성되므로
    System.out.println(s1);                 //기존의 s1 문자열은 그대로.
    System.out.println(s2.toLowerCase());   //s2 문자열을 소문자로 바꿔서 생성된 새로운 객체 출력

    System.out.println(s2.substring(2));
    System.out.println(s2.substring(2,4));

    System.out.println(String.valueOf(10).equals("10"));

    String s4 = """   
        hello,
              java
        12345
        """;      //텍스트 블록
    System.out.println(s4);

    """
        aaabbb""".length();
    "aaa".length();
  }
}
