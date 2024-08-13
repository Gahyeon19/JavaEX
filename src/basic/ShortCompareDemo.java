package basic;

public class ShortCompareDemo {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");

    s2 = s1;

    if (s1 != null && s1.equals(s2)) {
      //s1에 null값을 넣었을 때) s1.equals(s2)는 오류지만 쇼트서킷으로 앞항(s1 != null)만 계산했을 때 false이므로
      //이미 false로 계산이 됨. 뒷항은 계산하지 않아서 오류없이 정상 작동됨.
      System.out.println("같음");
    }

    System.out.println("문자열 내용 비교 : " + s1.equals(s2));
    System.out.println("두 문자열이 동등한지 비교 :" + (s1 == s2));
  }
}
