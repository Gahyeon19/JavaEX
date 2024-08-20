package object;

import java.util.Arrays;

public class ArraySearchDemo {
  public static void main(String[] args) {
    int[] numbers = {77, 88, 66, 99, 11, 22, 33};
    //numbers 배열 안에서 '11'을 찾아라.

    int findnumber = 77;
    int findIndex = -1;
    for (int i = 0; i < numbers.length; i++) {    //O(n)
      if (numbers[i] == findnumber){
        findIndex = i;
        break;
      }

    }

    System.out.println(numbers.length + "개의 요소가 있음");
    if (findIndex < 0){
      System.out.println("해당 항목 없음");
    }
    else {
      System.out.println(findIndex + "번 Index 위치에서 찾음");
    }


    System.out.println();
    System.out.println("정렬 전 : " + Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println("정렬 후 : " + Arrays.toString(numbers));
    int result = Arrays.binarySearch(numbers, 77);
    System.out.println(result + "번째 index에 위치");
  }
}
