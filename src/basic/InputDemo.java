package basic;

import java.util.Scanner;

public class InputDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //키보드에 의해 입력받음
//    System.out.print("정수형 숫자 하나를 입력하세요 : ");
//    String s = in.nextLine();
//    int i = Integer.parseInt(s);
//    int result = i + 100;
//    System.out.printf("입력한 숫자는 %d 이고, 100을 더한 결과는 %d 입니다. ", i, result);

    System.out.print("정수형 숫자를 2개 입력하세요 : ");
    int x = in.nextInt();
    int y = in.nextInt();
    int result = x * y;
    System.out.printf("입력한 숫자는 %d, %d 이고, 그 둘을 곱한 결과는 %d 입니다. ", x, y, result);
  }
}
