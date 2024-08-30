package datastructure;

import java.util.LinkedList;

public class SLinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    System.out.println(ll.size());    //0
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addFirst(30);
    System.out.println(ll.size());    //3
    System.out.println(ll);   //[30, 20, 10]
    Integer i = ll.removeLast();
    System.out.println(i + " 삭제");  //10 삭제


    SLinkedList<Integer> sll = new SLinkedList<>();
    System.out.println(sll.size());   //0
    sll.addFirst(10);
    System.out.println(sll.size());   //1

    sll.addFirst(10);
    sll.addFirst(20);
    sll.addFirst(30);
    sll.addLast(40);
    System.out.println(sll.size());
    System.out.println(sll.getValue(1));  //20
    System.out.println(sll.size());   //5
    System.out.println(sll.getValue(4));  //40

    System.out.println(sll.removeLast() + " 삭제");  //40 삭제
    System.out.println("삭제 후 " + sll.size() + "개 남음");    //4개 남음

    System.out.println(sll.removeFirst() + " 삭제");  //30 삭제
    System.out.println(sll.removeFirst() + " 삭제");  //20 삭제
  }
}
