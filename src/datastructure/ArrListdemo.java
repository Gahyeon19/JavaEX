package datastructure;

import java.util.ArrayList;

/**
 * 맨 뒤에 추가 or 삭제 > O(N)
 * 맨 앞에 추가 or 삭제 > O(2N) = O(N)
 * 탐색(index 이용) > O(1)
 */
public class ArrListdemo {
  public static void main(String[] args) {
    ArrList<Integer> arr = new ArrList<>();
    System.out.println(arr.length() + " : " + arr.size());
    System.out.println(arr.size());   //0
    boolean add = arr.add(10);
    System.out.println(arr.length() + " : " + arr.size());  //1 : 1
    System.out.println(arr);    //[10]

    arr.add(20);
    System.out.println(arr.length() + " : " + arr.size());  //2 : 2
    System.out.println(arr);    //[10, 20]

    arr.add(30);
    System.out.println("index 2 : " + arr.peek(2));     //index 2 : 30
    System.out.println(arr.length() + " : " + arr.size());  //4 : 3
    System.out.println(arr);    //[10, 20, 30, null]

    Integer removed = arr.remove(); //맨 마지막 element가 삭제
    System.out.println(removed + "가 삭제됨");
    System.out.println(arr.length() + " : " + arr.size());  //4 : 2
    System.out.println(arr);    //[10, 20, null, null]

    removed = arr.remove(); //맨 마지막 element가 삭제
    System.out.println(removed + "가 삭제됨");
    System.out.println(arr.length() + " : " + arr.size());  //2 : 1
    System.out.println(arr);    //[10, null]

    removed = arr.remove(); //맨 마지막 element가 삭제
    System.out.println(removed + "가 삭제됨");
    System.out.println(arr.length() + " : " + arr.size());  //1 : 0
    System.out.println(arr);    //[null]

    System.out.println(add);    //true
    System.out.println(arr.size());


    ArrayList<Integer> javaArr = new ArrayList<>();
    System.out.println(javaArr.size());
    javaArr.add(10);
    javaArr.add(20);
    javaArr.add(30);
    javaArr.remove(javaArr.size() - 1);
    System.out.println(javaArr.size());

  }
}
