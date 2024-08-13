package basic;

public class PlusMinusDemo {
  public static void main(String[] args) {
    int i = 0;
    int j = i++;    //후위연산자
    System.out.printf("i = %d, j = %d\n", i, j);

    i = 0;
    j = ++i;    //전위연산자
    System.out.printf("i = %d, j = %d", i, j);
  }
}
