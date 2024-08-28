package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    System.out.println(q.size());     //0
    System.out.println(q.isEmpty());  //true
//    q.remove();   //NoSuchElementException 발생

    q.offer("banana");
    q.offer("apple");
    q.offer("watermelon");

    System.out.println(q);    //[banana, apple, watermelon]
//    while (!q.isEmpty()){
//      System.out.println(q.remove());
//    }
    while (!q.isEmpty()){
      System.out.println("맨 처음에 있는 element : " + q.peek());

      System.out.println("제거된 element : " + q.poll());
    }

  }
}
