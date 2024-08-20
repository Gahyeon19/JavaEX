package object;

import java.util.Arrays;

public class StringArrayDemo {
  public static void main(String[] args) {
    String[] names = new String[3];
//    System.out.println(Arrays.toString(names));   //[null, null, null]

    names[0] = "Hong Kil-dong";
    names[1] = "Son Heung-min";
    names[2] = "Lee Kang-in";
    System.out.println(Arrays.toString(names));

    for (String name : names){    //iter로 자동생성
      System.out.print(name.length() + "\t");
    }
  }
}
