package object;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] scores = new int[]{10, 20, 30, 40, 50};   //배열 선언 방법 1

    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    System.out.println("");

    scores = new int[10];                           //배열 선언 방법 2
    for (int i = 0; i < scores.length; i++) {
      scores[i] = i + 1;
      System.out.print(scores[i] + ",");
    }
    System.out.println("");

    int[] scores2 = {10, 20, 30, 40, 50, 60, 70, 80 ,90 , 100};   //배열 선언 방법 3
  }
}
