package object;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {
  public static void main(String[] args) {
    //long 타입의 수를 5번 입력받아 입력받은 값의 합계와 평균 출력
    Scanner in = new Scanner(System.in);
    long[] prices = new long[5];
    long sum = 0L;
    double avg = 0.0;

    for (int i = 0; i < prices.length; i++) {
      System.out.print("가격을 입력하시오 : ");
      prices[i] = in.nextLong();
    }
    for (int i = 0; i < prices.length; i++) {
      sum += prices[i];
    }
    avg = (double) sum / prices.length;

    System.out.println(Arrays.toString(prices));
    System.out.printf("합계 : %d , 평균 : %.2f", sum, avg);


  }
}
