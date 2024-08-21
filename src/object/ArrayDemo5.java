package object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo5 {
  public static void main(String[] args) {
    //학생의 점수를 입력받아 저장하고 합계와 평균을 구하라
    //학생의 수는 정해져 있지 않다. 더 이상 입력받지 않으려면 -값을 입력한다.
    //재사용성 고려.
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();
    int score = 0;
    long sum = 0L;
    double avg = 0.0;

    //방법1
    do {
      System.out.print("점수를 입력하시오 (종료 시 -값 입력) : ");
      score = in.nextInt();
      if (score >= 0) {
        scores.add(score);
      }
    }while (score>=0);

    //방법2
//    while (true){
//      System.out.print("점수를 입력하시오 (종료 시 -값 입력) : ");
//      score = in.nextInt();
//      if (score < 0){
//        break;
//      }
//      else {
//        scores.add(score);
//      }
//    }

    for (Integer i : scores) {
      sum += i;
    }

    avg = (double) sum / scores.size();

    System.out.println(scores);
    System.out.printf("합계 : %d , 평균 : %.2f", sum, avg);


    ////////////////////////////////////////////////////////////////
//    sum = 0L;
//    for (long price : prices) {   //prices 배열에서 price를 하나씩 갖고 온다.
//      sum += price;
//    }

  }
}
