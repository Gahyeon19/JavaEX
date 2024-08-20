package object;

public class ArrayDemo {
  public static void main(String[] args) {
    //배열 scores 에 4개의 int score 를 저장
//    int scores[];
//    int[] scores = {};  //empty 배열
//    System.out.println(scores.length);  //0

    int[] scores = {90, 75, 85, 75, 80, 90, 100, 60, 99, 88};
    int sum = 0;

    System.out.println(scores.length);

    for (int i = 0 ; i < scores.length ; i++){
      System.out.println(scores[i]);
      sum += scores[i];
    }
    double avg = (double) sum/ scores.length;

    System.out.println("합계 : " + sum);
    System.out.printf("평균 : %.2f", avg);

//    System.out.println(scores[0]);
//    System.out.println(scores[1]);
//    System.out.println(scores[2]);
//    System.out.println(scores[3]);

  }
}
