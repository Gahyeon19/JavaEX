package basic;

public class MethodDemo4 {
  public static void main(String[] args) {
//    System.out.println(add(2,3));
//    System.out.println(add(10,20));
//    System.out.println(add(100,200));
//    System.out.println();
//    System.out.println(minus(2,3));
//    System.out.println(minus(20,10));
//    System.out.println(minus(200,100));
//    System.out.println();
//    System.out.println(multiply(2,3));
//    System.out.println(multiply(20,10));
//    System.out.println(multiply(200,100));
//    System.out.println();
//    System.out.println(div(2,3));
//    System.out.println(div(20,10));
//    System.out.println(div(200,100));

    int a = 1_000_000, b = 2_000_000;
    long long1 = 1_000_000_000_000L, long2 = 2_000_000_000_000L;
    System.out.println(longAdd(long1, long2));
    System.out.println(longMinus(long1, long2));
    System.out.println();
    System.out.println(add(a,b));
    System.out.println(minus(a,b));
    System.out.println(multiply(a, b));
    System.out.println(longMultiply(a,b));
    System.out.println(div(a, b));
    System.out.printf("%.4f", doubleDiv(a,b));
  }

  public static int add(int x, int y){  //더하기
    return x + y;
  }

  public static long longAdd(long x, long y){  //더하기
    return x + y;
  }

  public static int minus(int x, int y){  //빼기
    return x - y;
  }

  public static long longMinus(long x, long y){  //빼기
    return x - y;
  }

  public static int multiply(int x, int y){   //곱하기   //long으로 반환
    return x * y;
  }

  public static long longMultiply(int x, int y){  //long으로 반환
    return (long)x * y;
  }

  public static int div(int x, int y){  //나누기
    if (y == 0) return 0;
    return x / y;
  }

  public static double doubleDiv(int x, int y){  //double로 반환
    if (y == 0) return 0;
    return (double)x / y;
  }
}
