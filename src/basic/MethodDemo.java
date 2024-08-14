package basic;

import java.util.Scanner;

public class MethodDemo {
  public static void main(String[] args) {
    System.out.println(sum(10, 100));

//    Scanner in = new Scanner(System.in);
//    System.out.printf("두 개의 정수 입력 : ");
//    int a = in.nextInt();
//    int b = in.nextInt();
//    System.out.println(sum(a,b));
  }

  public static int sum(int x, int y){
    int res = 0;
    for (int i = x; i <= y; i++){
      res += i;
    }
    System.out.printf("%d~%d 합 : ", x, y);
    return res;
  }
}
