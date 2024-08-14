package basic;

import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("요일을 입력하시오 : ");
    String day = in.nextLine();

    switch (day){
      case "mon", "tue", "wed", "thu":
      case "금" :
        System.out.println("평일입니다."); break;
      case "sat" :
      case "sun" :
        System.out.println("주말입니다."); break;
      default:
        System.out.println("알 수 없습니다.");
    }
  }
}
