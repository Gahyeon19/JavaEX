package collection_framework;

import java.util.*;

public class CollectionDemo {
  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();
    c.add(10);
    c.add(20);
    c.add(30);
    System.out.println(c);                //[10, 20, 30]      (List)
    System.out.println(c.size());         //3
    boolean contains = c.contains(10);
    System.out.println(contains);         //true
    Integer[] iarray = c.toArray(new Integer[c.size()]); //
    System.out.println(Arrays.toString(iarray));  //[10, 20, 30]    (Array)

    c.remove(10);
    System.out.println(c);                //[20, 30]
    System.out.println(c.size());         //2
    c.clear();
    System.out.println(c.isEmpty());      //true
    System.out.println(c);                //[]
    System.out.println();

    Collection<String> s = new ArrayList<>();
    s.add("A");
    s.add("B");
    s.add("C");
    System.out.println(s);
    Iterator<String> iterator = s.iterator();//
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

//    iterator i = Iterator;


  }
}
