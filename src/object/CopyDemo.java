package object;

public class CopyDemo {
  public static void main(String[] args) {
    int ten = 10;
    System.out.println("ten : " + ten);
    copyByValue(ten);

    Circle c1 = new Circle(1); //0x100
    System.out.println("c1의 반지름 : " + c1.getRadius());
    copyByReference(c1);
  }

  public static void copyByValue(int val){    //read only
//    int copyTen = val;
//
//    System.out.println("ten : " + val);         //10
//    System.out.println("copyTen : " + copyTen); //10

    val = 20;
    System.out.println("ten의 값 변경 : " + val);         //20
//    System.out.println("copyTen : " + copyTen); //10

  }

  public static void copyByReference(Circle c1){    //read and write
    Circle c2 = new Circle(1); //0x200

//    System.out.println("인스턴스 생성 후");
//    System.out.println("c1의 반지름 : " + c1.getRadius()); //1
//    System.out.println("c2의 반지름 : " + c2.getRadius()); //1
//
//    c2 = c1;
//    System.out.println("주소 복사 후");
//    System.out.println("c1의 반지름 : " + c1.getRadius()); //1
//    System.out.println("c2의 반지름 : " + c2.getRadius()); //1
//
    c1.setRadius(10);
    System.out.println("c1의 반지름 변경 후");
    System.out.println("c1의 반지름 : " + c1.getRadius()); //10
//    System.out.println("c2의 반지름 : " + c2.getRadius()); //10
  }
}


