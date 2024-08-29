package advanced2;

import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    //매개 값 X, 반환 값 O

    //Supplier
    Supplier<String> s = () -> "Hello";
    System.out.println(s.get());
  }
}
