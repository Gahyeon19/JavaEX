package object;

import java.util.Arrays;

public class RockScissorPaper {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
//    System.out.println(Arrays.toString(name));

    //Math.floor : 버림
    //Math.ceil : 올림
    //Math.round : 반올림
    for (int i = 0; i < 10; i++) {
//      int random = (int)Math.floor(Math.random() * 10);   //Math.random에서 정수부분만 추출
////      System.out.print(random + " ");
//      int mod = random % name.length;     //random을 배열의 길이만큼 나눈 나머지값 추출
//      System.out.print(mod + " ");
//      System.out.println(name[mod]);
      System.out.println(name[(int)(Math.random() * 3)]);
    }
  }
}
