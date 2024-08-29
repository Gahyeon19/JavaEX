package advanced2;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = null;

    Optional<String> o1 = Optional.ofNullable(s1);
    Optional<String> o2 = Optional.ofNullable(s2);

    if (o2.isPresent()){
      Util.print(o2);
    }
    else {
      System.out.println("값이 없음");  //
      Util.print(o2);   //Optional.empty
    }

    System.out.println();

    if (o1.isPresent()){
      Util.print(o1);   //Optional[Hello]
      System.out.println();
      Util.print(o1.get());   //Hello
    }
    else {
      System.out.println("값이 없음");
      Util.print(o1);
    }
    o1.ifPresent(Util::print);    //Hello

//    String result = o2.orElse("값이 없음");
//    System.out.println(result);   //값이 없음
    Util.printWithParenthesis(o2.orElse("값이 없음"));  //값이 없음
  }
}
