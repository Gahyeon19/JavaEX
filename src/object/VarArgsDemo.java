package object;

import java.util.Arrays;

public class VarArgsDemo {
  public static void main(String[] args) {

    printSum(1);
    printSum(1, 10);
    printSum(1, 10, 20);

  }

  //가변 개수 인수 메서드
  private static void printSum(int...nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    System.out.println(Arrays.toString(nums));
    System.out.println(sum);
  }

  //앞에서는 인수들을 따로 설정할 수 있지만 뒤에는 쓸 수 없다.
  //int...nums 는 마지막에만 쓸 수 있다.
//  private static void printSum(int n, int k, int...nums){
//
//  }

}
