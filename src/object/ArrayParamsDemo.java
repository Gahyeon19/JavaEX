package object;

public class ArrayParamsDemo {
  public static void main(String[] args) {
    if(args.length == 1){
      System.out.println("Main Method로 전달된 인자는 " + args[0] + "입니다.");
      return;   //인자가 1개일 경우 바로 종료
    }

    int[] x = {0};
    System.out.println("매서드 호출 전 : " + x[0]); //0
    increment(x);
    System.out.println("매서드 호출 후 : " + x[0]);    //1

  }

  public static void increment(int[] n){  //값을 하나 증가
    System.out.println("매서드 안에서 증가 전 : " + n[0]); //0
    n[0]++;
    System.out.println("매서드 안에서 증가 후 : " + n[0]); //1
  }
}
