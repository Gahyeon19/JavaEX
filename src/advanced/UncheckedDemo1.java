package advanced;

import java.util.StringTokenizer;

public class UncheckedDemo1 {
  public static void main(String[] args) {
    String s = "Time is money";
    StringTokenizer st = new StringTokenizer(s);

    while (st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
//    System.out.println(st.nextToken());  //컴파일러에서 체크하지 않는 Unchecked Exception 발생

  }
}
