package advanced2;

public class LambdaDemo {
  public static void main(String[] args) {
    Object obj = new Object(){
      int max(int a, int b){
        return (a > b) ? a : b;
      }
    };
//    int max = obj.max(3,5);   //Object 에는 max 라는 메서드가 없기 때문에 오류 발생


    Myfunction f = new Myfunction() {
      @Override
      public int max(int a, int b) {
        return (a > b) ? a : b;
      }
    };

    int max = f.max(3,5);
    System.out.println(max);
  }
}

@FunctionalInterface
interface Myfunction{   //추상 매서드 한 개를 갖는 functional interface
  public abstract int max(int a, int b);
}

@FunctionalInterface
interface NewFunction{
  int min(int a, int b);
}