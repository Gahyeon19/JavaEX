package basic;

public class MethodDemo3 {
  public static void main(String[] args) {
//    int result = 2 + 3;
//    System.out.println(result);
//
//    result = 10 + 20;
//    System.out.println(result);
//
//    result = 100 + 200;
//    System.out.println(result);

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

    int a = 10, b = 7;
    System.out.println(add(a,b));
    System.out.println(minus(a,b));
    System.out.println(multiply(a,b));
    System.out.println(div(a,b));
  }

  public static int add(int x, int y){  //더하기
    return x + y;
  }

  public static int minus(int x, int y){  //빼기
    return x - y;
  }

  public static int multiply(int x, int y){   //곱하기
    return x * y;
  }

  public static int div(int x, int y){  //나누기
    if (y == 0) return 0;
    return x / y;
  }
}
