package advanced;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      System.out.println(random.nextInt(100));
    }

    random.setSeed(2935300L);   //seed 값 다시 설정

  }
}
