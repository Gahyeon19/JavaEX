package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> s = Set.of("바나나", "사과", "블루베리", "무화과", "포도");   //immutable에서
    HashSet<String> hs = new HashSet<>(s);                               //mutable로

    hs.add("수박");
    Iterator<String> iterator = hs.iterator();

    while (iterator.hasNext()){
      System.out.println(iterator.next());  //순서 상관없이 출력됨
    }

    boolean add = hs.add("수박");
    System.out.println(add);    //false > 중복 값 추가 불가
    System.out.println(hs.size());    //6


  }
}
