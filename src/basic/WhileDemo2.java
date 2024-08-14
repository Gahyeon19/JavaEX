package basic;

import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.print("점수를 입력하시오. (1 ~ 10) ");
      int score = in.nextInt();
      String grade = "";

      if (score < 0){
        break;
      }

      switch (score) {
        case 10 -> grade = "A";
        case 9 -> grade = "B";
        case 8 -> grade = "C";
        default -> grade = "D";
      }

      System.out.printf("등급 : %s\n", grade);


    }
  }
}
