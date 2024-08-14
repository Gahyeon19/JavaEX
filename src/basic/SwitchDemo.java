package basic;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    //점수를 입력받아 등급을 매기는 프로그램
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하시오. (1 ~ 10) ");
    int score = in.nextInt();
    String grade = "";

    switch (score){
      case 10 -> grade = "A";
      case 9 -> grade = "B";
      case 8 -> grade = "C";
      case 7 -> grade = "D";

    }

    System.out.printf("점수 : %d, 등급 : %s", score, grade);
  }
}
