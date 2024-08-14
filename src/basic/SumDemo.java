package basic;

public class SumDemo {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0 ; i <= 10 ; i++){
      sum += i;
    }
    System.out.println("1~10 합 : " + sum);

    sum = 0;
    for (int i = 10 ; i <= 100 ; i++){
      sum += i;
    }
    System.out.println("10~100 합 : " + sum);

    sum = 0;
    for (int i = 100 ; i <= 1000 ; i++){
      sum += i;
    }
    System.out.println("100~1000 합 : " + sum);
  }
}
