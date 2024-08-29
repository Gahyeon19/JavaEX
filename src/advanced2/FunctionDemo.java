package advanced2;

import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {
    //매개 값 O, 반환 값 O
    //매개 값을 반환 값으로 매핑

    //Function
//    Function<String, Integer> lengthCount = new Function<String, Integer>() {
//      @Override
//      public Integer apply(String s) {
//        return s.length();
//      }
//    };
//    System.out.println(lengthCount.apply("hello"));   //5

    Function<String, Integer> lengthCount = s -> s.length();
    System.out.println(lengthCount.apply("hello!"));    //6
  }
}
