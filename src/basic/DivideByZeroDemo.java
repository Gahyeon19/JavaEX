package basic;

import java.util.Scanner;

public class DivideByZeroDemo {
  public static void main(String[] args) {
//    int result = 5/0;   //ArithmeticException (/ by zero)
    Scanner in = new Scanner(System.in);
//    System.out.print("양수 정수를 입력해주세요. ");
//    int i = in.nextInt();
//
//    if (i == 0){
//      System.out.println("0으로 나눌 수 없습니다.");
//    }
//    if (i > 0){
//      int result = 5/i;
//      System.out.printf("5 나누기 %d 는 %d 입니다. ", i, result);
//    }

//    double result = 5 / 0.0;    //Infinity

    double result = 5 % 0.0;    //NaN(Not a Number)
    System.out.printf("5 나누기 2.0의 나머지는 %.2f 입니다.", result);


  }
}