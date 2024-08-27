package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l = new LinkedList<>();
    boolean add = l.add(10);
    l.add(0,30);

    System.out.println(l);    //[30, 10]
    System.out.println(l.get(1)); //10
    System.out.println(l.indexOf(10));    //10이 몇번째 인덱스에 있는지
    l.remove(0);
    System.out.println(l);
    l.remove(0);
    l.add(40);
    System.out.println(l);
//    Integer set = l.set(1,20);
//    System.out.println(set);


  }
}
