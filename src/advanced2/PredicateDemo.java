package advanced2;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    //매개 값 O, 반환 값 boolean

    //IntPredicate
//    IntPredicate even =
//        new IntPredicate() {
//      @Override
//      public boolean test(int value) {
//        return value % 2 == 0;
//      }
//    };
    IntPredicate even = i -> i % 2 == 0;
    System.out.println(even.test(3));   //false
    System.out.println(even.test(4));   //true


    //BiPredicate
//    BiPredicate<Integer, Integer> bi =
//        new BiPredicate<Integer, Integer>() {
//      @Override
//      public boolean test(Integer integer, Integer integer2) {
//        return false;
//      }
//    };
    BiPredicate<Integer, Integer> bi = (i, j) -> i == j;
    System.out.println(bi.test(2,2));   //true
    System.out.println(bi.test(2,4));   //false


    //Predicate
//    Predicate<Integer> p = new Predicate<Integer>() {
//      @Override
//      public boolean test(Integer integer) {
//        return false;
//      }
//    };
    Predicate<Integer> positive = i -> i > 0;
    System.out.println(positive.test(3));    //true
    System.out.println(positive.test(-9));   //false
  }
}
