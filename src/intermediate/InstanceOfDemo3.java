package intermediate;

public class InstanceOfDemo3 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(3, 3,5);
    Triangle t2 = new Triangle(3, 15,1);
    Triangle t3 = new Triangle(3, 4,4);

    //넓이가 같으면 true 로 반환해주는 equals 매소드 추가(FigureInheritDemo.java)
    System.out.println(t1.equals(t2));  //true
    System.out.println(t1.equals(t3));  //false

  }
}


