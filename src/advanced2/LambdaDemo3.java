package advanced2;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
  public static void main(String[] args) {
    //글자수를 기준으로 정렬하기
    String[] strings = {"abcde", "a", "abc"};

    //방법1
//    Arrays.sort(strings, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o2.length() - o1.length();   //내림차순
//      }
//    });

    //람다식(방법2)
    Arrays.sort(strings, (o1, o2) -> o2.length() - o1.length());    //내림차순

    for (String string : strings) {
      System.out.println(string);
    }
  }
}
