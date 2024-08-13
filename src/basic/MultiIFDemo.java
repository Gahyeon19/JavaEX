package basic;

import java.util.Scanner;

public class MultiIFDemo {
  public static void main(String[] args) {
    //점수를 입력받아 등급을 매기는 프로그램
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하시오. (1 ~ 100) ");
    int score = in.nextInt();
    String grade = "";

    if (score >= 90){
      grade = "A";
    } else if (score >= 80){
      grade = "B";
    } else if (score >= 70){
      grade = "C";
    } else {
      grade = "D";
    }

    System.out.printf("점수 : %d, 등급 : %s", score, grade);
  }
}
