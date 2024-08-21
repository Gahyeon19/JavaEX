package object;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EnumDemo {
  public static void main(String[] args) {
//    System.out.println(People.FEMALE);
//    System.out.println(People.TWO);
//    int a = 2;
//    if (People.TWO == a){
//      System.out.println("여성");
//    }

//    System.out.println(People.Gender.FEMALE);
//    System.out.println(People.Number.TWO);

    //Gender 라는 이름의 Enum 설정
    System.out.println(Gender.FEMALE);
    //Day 라는 이름의 Enum 설정

    System.out.println(Day.FRI);
  }
}

class People{   //상수값을 묶어놓은 클래스
//  static final int MALE = 1;
//  static final int FEMALE = 2;
//  static final int ONE = 1;
//  static final int TWO = 2;
  enum Gender { MALE, FEMALE }    //Gender 타입
  enum Number { ONE, TWO}         //Number 타입

}
