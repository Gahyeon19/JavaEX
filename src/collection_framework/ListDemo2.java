package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
  public static void main(String[] args) {
    List<Integer> l = List.of(10, 20, 30);
    System.out.println(l);    //[10, 20, 30]
//    l.add(40);     //UnsupportedOperationException 오류 발생
//    l.set(0, 1);   //UnsupportedOperationException 오류 발생
    List<Integer> integers = new ArrayList<>(l);
    integers.add(40);
    integers.add(1, 50);
    System.out.println(integers);   //[10, 50, 20, 30, 40]
  }
}
