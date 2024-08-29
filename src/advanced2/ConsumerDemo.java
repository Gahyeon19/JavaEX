package advanced2;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    //매개 값 O, 반환 값 X

    //Consumer
//    Consumer<String> printX = new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//        System.out.println(s);
//      }
//    };
//    printX.accept("hello");
    Consumer<String> printX = System.out::println;  //s -> System.out.println(s);
    printX.accept("Hello World");


    //ObjIntConsumer
//    ObjIntConsumer<String> printITimes = new ObjIntConsumer<String>() {
//      @Override
//      public void accept(String s, int value) {
//        for (int i = 0; i < value; i++) {
//          System.out.println(s);
//        }
//      }
//    };
//    printITimes.accept("Hello", 3);
    ObjIntConsumer<String> printITimes = (s, n) ->
    {
      for (int j = 0; j < n; j++) {
        System.out.println(s);
      }
    };
    printITimes.accept("World", 3);

  }
}
