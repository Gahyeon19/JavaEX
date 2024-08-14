package basic;

public class OverLoadDemo2 {
  public static void main(String[] args) {
    int a = 3, b = 7, c = 10;
    double d1 = 7.0, d2 = 3.0;

    System.out.println(max(a, b));
    System.out.println(max(d1, d2));
    System.out.println(max(a, b, c));
  }

  public static int max(int n1, int n2){
    return (n1 > n2) ? n1 : n2;
  }

  public static double max(double n1, double n2){
    return (n1 > n2) ? n1 : n2;
  }

  public static int max(int n1, int n2, int n3){
    return max(n1, max(n2, n3));
  }
}
