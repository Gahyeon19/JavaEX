package basic;

import object.Day;

import java.util.Scanner;

public class SwitchDemo3 {
  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.print("요일을 입력하시오 : ");
//    String day = in.nextLine();

    Day dayOfweek = Day.SUN;
    switch (dayOfweek){
      case MON, TUE, WED, THU, FRI:
        System.out.println("평일입니다."); break;
      case SAT, SUN:
        System.out.println("주말입니다."); break;
      default:
        System.out.println("알 수 없습니다.");
    }
  }
}
