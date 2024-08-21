package object;

import java.util.Scanner;

public class StringDemo4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String url = "";

    //~로 끝나는 : endswith
    //~를 포함하는 : contains
    while (true) {
      System.out.print("URL을 입력하세요: ");
      url = sc.nextLine();
      String urlLow  = url.toLowerCase();
      if (url.equals("bye")){
        break;
      }
      if (urlLow.endsWith("com")){
        System.out.println(url + "은 'com'으로 끝납니다.");
      }
      if (urlLow.contains("java")){
        System.out.println(url + "은 'java'를 포함합니다.");
      }

    }

  }
}
