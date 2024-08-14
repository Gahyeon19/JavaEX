package basic;
//오버로딩
//이름은 같고 매개변수와 반환타입이 다른 메소드
public class OverLoadDemo {
  public static void main(String[] args) {
    int a = 1, b = 2;
    long long1 = 1000L, long2 = 2000L;
    double da = 10.0, db = 20.0;
    System.out.println(add(long1, long2));
    System.out.println(minus(long1, long2));
    System.out.println();
    System.out.println(add(a,b));
    System.out.println(minus(a,b));
    System.out.println(multiply(a, b));
    System.out.println(multiply(long1, long2));
    System.out.println(div(a, b));
    System.out.printf("%.4f", div(da,db));
  }

  public static int add(int x, int y){  //더하기
    return x + y;
  }

  public static long add(long x, long y){  //더하기
    return x + y;
  }

  public static int minus(int x, int y){  //빼기
    return x - y;
  }

  public static long minus(long x, long y){  //빼기
    return x - y;
  }

  public static int multiply(int x, int y){   //곱하기
    return x * y;
  }

  public static long multiply(long x, long y){  //long으로 반환
    return x * y;
  }

  public static int div(int x, int y){  //나누기
    if (y == 0) return 0;
    return x / y;
  }

  public static double div(double x, double y){  //double로 반환
    if (y == 0) return 0;
    return x / y;
  }
}
