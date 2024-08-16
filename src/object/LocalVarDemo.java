package object;

public class LocalVarDemo {
  public static void main(String[] args) {
    int a = 1;
    System.out.println(a);

    for (int i = 0; i < 10; i++) {  //i는 지역변수
      System.out.print(i);
    }

  }
}
