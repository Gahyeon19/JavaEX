package advanced2;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
  public static void main(String[] args) {
    //매개 값 O, 반환 값 O
    //매개 값을 연산하여 반환 값으로 보냄.

    //Operator
//    UnaryOperator<String> addStrings = new UnaryOperator<String>() {
//      @Override
//      public String apply(String s) {
//        return s + "!";
//      }
//    };
//    System.out.println(addStrings.apply("world"));

    UnaryOperator<String> addStrings = s -> s + "!";
    System.out.println(addStrings.apply("hello world"));


    //BinaryOperator
//    BinaryOperator<String> concat =
//        new BinaryOperator<String>() {
//      @Override
//      public String apply(String s1, String s2) {
//        return s1 + ", " + s2;
//      }
//    };
//    System.out.println(concat.apply("Hello", "World"));

    BinaryOperator<String> concat = (s1, s2) -> s1 + ", " + s2;
    System.out.println(concat.apply("Hello", "World"));
  }
}
