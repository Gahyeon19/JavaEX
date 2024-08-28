package advanced2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 4, 5, 2, 3);
//    Collections.sort(list);
    System.out.println(list);

//    Collections.reverse(list);    //reverse 방법1
//    Collections.sort(list, Collections.reverseOrder());   //reverse 방법2
//    System.out.println(list);

//    Collections.sort(list, new Comparator<Integer>() {  //reverse 방법3
//      @Override
//      public int compare(Integer o1, Integer o2) {
//        return o2 - o1;   //o1 - o2 > sort
//      }
//    });

    Collections.sort(list, (i1, i2) -> i2 - i1);   //reverse 방법3 lambda 식

    System.out.println(list);

  }
}
