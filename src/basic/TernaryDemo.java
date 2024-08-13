package basic;

import java.util.Scanner;

public class TernaryDemo {
  public static void main(String[] args) {
//    int i = 2;
//    int res = i % 2;
//    String name = "";

//    if (res == 0){
//      name = "짝수";
//    } else {
//      name = "홀수";
//    }
//
//    //삼항 연산자도 쇼트서킷 로직 이용
//    name = (res == 0) ? "짝수" : "홀수";
//
//    System.out.printf("%d 는 %s 입니다.", i, name);

    //x값을 입력받아 x가 0보다 크거나 같으면 "양수입니다" 출력, 0보다 작으면 "음수입니다" 출력. (조건연산자 이용)
    Scanner in = new Scanner(System.in);
    System.out.printf("정수를 입력하시오 : ");
    int x = in.nextInt();
    String res = (x >= 0) ? "양수입니다." : "음수입니다.";
    System.out.println(res);

//    String res = "";
//    if (x >= 0){
//      res = "양수";
//    } else{
//      res = "음수";
//    }
//    System.out.printf("%s입니다.", res);

  }
}
