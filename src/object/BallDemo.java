package object;

public class BallDemo {
  public static void main(String[] args) {
    Ball b1 = new Ball();
    b1.setRadius(6);
    System.out.println("구의 반지름 : " + b1.getRadius());
    System.out.printf("구의 부피 : %.5f", b1.getVolume());
  }

}

class Ball{
  //필드
  private int radius = 1;

  //생성자

  //매서드
  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    if (radius <= 0){
      System.out.println("반지름은 0보다 커야 합니다.");
    }
    else {
      this.radius = radius;
    }
  }

  public double getVolume(){
    final double PI = 3.14;
    double volume = (double)4/3 * PI * radius * radius * radius;
    return volume;
  }


}

class Cylinder{

}