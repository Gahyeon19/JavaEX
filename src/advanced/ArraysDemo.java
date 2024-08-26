package advanced;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    Integer[] intArray = {2,4,6,8,10};   //new Integer[5];
    String[] strArray = {"사과", "도넛", "바나나"};
    int[] iArray = new int[5];

//    System.out.println(intArray);   //getClass().getName() + "@" + Integer.toHexString(hashCode()) > Ljava.lang.Integer;@4c873330
    System.out.println(Arrays.toString(intArray));  //[2, 4, 6, 8, 10]
    System.out.println(Arrays.binarySearch(intArray, 10));  //4
//    System.out.println(strArray);   //getClass().getName() + "@" + Integer.toHexString(hashCode()) > Ljava.lang.String;@119d7047
    System.out.println(Arrays.toString(strArray));  //[사과, 도넛, 바나나]
//    System.out.println(iArray);     //getClass().getName() + "@" + Integer.toHexString(hashCode()) > I@776ec8df
    System.out.println(Arrays.toString(iArray));    //[0, 0, 0, 0, 0]

  }
}
