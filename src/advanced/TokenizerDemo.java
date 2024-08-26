package advanced;

import java.util.StringTokenizer;

public class TokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";

    //input 값을 입력받고 ~를 기준으로 잘라서 저장할 때
    StringTokenizer st = new StringTokenizer(s, " ,"); //s를 , 기준으로 잘라줌

    while (st.hasMoreElements()){
      System.out.println(st.nextElement());
    }

  }
}
