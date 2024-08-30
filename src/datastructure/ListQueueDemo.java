package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class ListQueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(10);
    q.offer(20);
    q.offer(30);
    while (!q.isEmpty()){
      System.out.print(q.poll() + " 삭제   ");    //10 삭제   20 삭제   30 삭제
    }
    System.out.println();

    ListQueue<Integer> queue = new ListQueue<>();
    System.out.println(queue.isEmpty());  //true
    System.out.println(queue.size());     //0
    queue.offer(10);
    queue.offer(20);
    queue.offer(30);
    while (!queue.isEmpty()){
      System.out.print(queue.poll() + " 삭제   ");   //10 삭제   20 삭제   30 삭제
    }

  }
}
