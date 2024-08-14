package basic;

public class WhileDemo {
  public static void main(String[] args) {
    int count = 0;
    while (true){
//      for (int i = 0; i < 3; i++) {
//        System.out.println("반복출력");
//      }
      count++;
      System.out.println(count);
      if (count >= 3) {
        break;
      }
    }
  }
}
