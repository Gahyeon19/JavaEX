package exercise_ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//강의자료 11.컬렉션프레임워크 - 프로그래밍 문제 4
public class Exercise3 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("Kim", 80);
    map.put("Choi", 90);
    map.put("Woo", 95);
    map.put("Na", 88);

    Scanner in = new Scanner(System.in);
    System.out.print("이름을 입력하세요 : ");
    String name = in.nextLine();
    System.out.println(map.get(name));

  }
}
