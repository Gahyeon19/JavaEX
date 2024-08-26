package advanced;

import java.util.ArrayList;
import java.util.LinkedList;

public class SystemDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    LinkedList ll = new LinkedList();

    long before = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      al.add(i);
    }
    long after = System.nanoTime();
    System.out.println("ArrayList 실행시간 : " + (after - before));

    //i를 100으로 하면 ArrayList 실행시간이 더 짧고
    //i를 100000으로 하면 LinkedList 실행시간이 더 짧다.

    long before1 = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      ll.add(i);
    }
    long after1 = System.nanoTime();
    System.out.println("LinkedList 실행시간 : " + (after1 - before1));

  }
}
