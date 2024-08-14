package basic;

public class MethodDemo2 {
  public static void main(String[] args) {
    int num = 99;
    String res = "";
//    if (num % 2 == 0){
//      res = "짝수";
//    } else {
//      res = "홀수";
//    }
    res = (num % 2 == 0) ? "짝수" : "홀수";
    System.out.printf("%5d 는 %s 입니다. \n", num, res);

    //매개변수는 있고, 반환값은 없는 매소드로 작성.
    OddOrEven(2); //"짝수입니다." 출력되도록
    OddOrEven(5); //"홀수입니다." 출력되도록
    OddOrEven(10);
  }

  public static void OddOrEven(int a){
    String res = "";
    res = (a % 2 == 0) ? "짝수" : "홀수";
    System.out.printf("%5d 는 %s 입니다.\n", a, res);
  }
}
