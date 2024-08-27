package advanced;

import java.util.ArrayList;

//Generic Type
public class GenericTestDemo {
  public static void main(String[] args) {
    ArrayList<Integer> intArray = new ArrayList<>();  //integer만 담을 수 있는 동적 배열
    intArray.add(10);
    intArray.add(20);
    intArray.add(30);
    System.out.println(intArray);   //[10, 20, 30]
    System.out.println(intArray.get(2) + 10);   //40

    ArrayList<String> strArray = new ArrayList<>();
    strArray.add("hi");
    strArray.add("he");
    strArray.add("ho");
    System.out.println(strArray);   //[hi, he, ho]

    ArrayList<Object> objArray = new ArrayList<>();
    objArray.add(new Any());
    objArray.add(new All());
    objArray.add(1);
    objArray.add("hello");
    System.out.println(objArray);   //[advanced.Any@776ec8df, advanced.All@4eec7777, 1, hello]
    Object o = objArray.get(2);
    if (o instanceof Integer){   //불필요한 타입 체크
      Integer i = (Integer) o;
      System.out.println(i + 10);   //11
    }

  }
}

class Any{
  int any;
}

class All{
  int all;
}