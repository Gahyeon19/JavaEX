package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    //원소들을 맨 앞에 넣을 경우의 수행시간 비교
    //ArrayList 보다 LinkedList 가 훨씬 빠르다.
    //원소들을 맨 뒤에 넣을 경우에는 ArrayList 가 LinkedList 보다 빠르다.

    long before = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      arrayList.add(0, i);
    }
    long after = System.nanoTime();
    System.out.println("ArrayList 수행시간 : " + (after - before));

    before = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      linkedList.addFirst(i);
    }
    after = System.nanoTime();
    System.out.println("LinkedList 수행시간 : " + (after - before));


  }
}
