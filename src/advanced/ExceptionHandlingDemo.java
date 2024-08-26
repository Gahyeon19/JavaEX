package advanced;

import java.io.IOException;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    try {
      method1();
    } catch (IOException e) {
//      throw new RuntimeException(e);
      System.out.println("예외 발생");
    } finally {   //무조건 실행
      System.out.println("프로그램 종료");
    }
  }

  public static void method1() throws IllegalArgumentException, IOException {
//    try {
////    System.out.println("예외 발생");
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }
//    throw new IllegalArgumentException();
    throw new IOException();
  }
}

