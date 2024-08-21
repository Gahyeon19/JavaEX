package object;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinDemo {
  public static void main(String[] args) {
    int[] scores = {40, 30, 70, 90, 100};

    int max = findMax(scores);
    int min = findMin(scores);

//    Arrays.stream(scores).max();
//    Arrays.stream(scores).min();

    System.out.println(Arrays.toString(scores));
    System.out.println("Max : " + max + ", Min : " + min);
  }

  private static int findMax(int[] values) {
    int max = values[0];
    for (int i = 1; i < values.length; i++) {
      if (max < values[i]){
        max = values[i];
      }
    }
    return max;
  }

  private static int findMin(int[] values) {
    int min = values[0];
    for (int i = 1; i < values.length; i++) {
      if (min > values[i]){
        min = values[i];
      }
    }

    return min;
  }

}
