package exercise_ch6;

//강의자료 6.상속 - 프로그래밍 문제 2
public class Exercise2 {
  public static void main(String[] args) {
    Point point = new Point(3,4);
    MovablePoint movablePoint = new MovablePoint(5,6,10,11);

    System.out.println(point.toString());
    System.out.println(movablePoint.toString());

  }
}

class Point{
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "좌표 ( " + "x = " + x + ", y = " + y + " )";
  }
}

class MovablePoint extends Point{
  private int xSpeed, ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return "좌표 ( " + "x = " + super.getX() + ", y = " + super.getY() + " ) " + "이동속도 ( " + "xSpeed = " + xSpeed + ", ySpeed = " + ySpeed + " )";
  }
}
