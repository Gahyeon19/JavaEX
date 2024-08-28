package advanced2;

public class MethodRefDemo {
  public static void main(String[] args) {
    //절대값 반환해주는 calculate
    Mathematical m;

//    m = new Mathematical() {    //방법1
//      @Override
//      public double calculate(double d) {
//        return 0;
//      }
//    };

//    m = d -> Math.abs(d);   //방법2

    m = Math::abs;    //방법3

    System.out.println(m.calculate(-3.2));
  }
}

interface Mathematical{
  double calculate(double d);
}