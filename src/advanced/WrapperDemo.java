package advanced;

public class WrapperDemo {
  public static void main(String[] args) {
    Integer ic = 10;  //자동 boxing
    // ic = new Integer(10); > jdk 9 부터 없어짐

    System.out.println(ic.getClass().getSimpleName());  //Integer
    System.out.println(ic);                             //10(integer 타입)
    int i = ic;                                         //자동 unboxing
    System.out.println(i);                              //10(primitive 타입)

    long lc = 10000000000L;   //자동 boxing
    long l = lc;              //지동 unboxing
  }
}
