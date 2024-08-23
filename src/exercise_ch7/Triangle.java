package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 3-2
public class Triangle implements Comparable {
  int height;
  int width;

  public Triangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

  public int getArea(){
    double area = (double) height * width / 2;
    return (int) area;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Triangle){
      Triangle tri = (Triangle) o;
      int res;
      if (this.getArea() < tri.getArea()){
        res = -1;
      } else if (this.getArea() > tri.getArea()) {
        res = 1;
      }
      else {
        res = 0;
      }
      return res;
    }
    return -999;
  }

  @Override
  public String toString() {
    return "Triangle[" + "height=" + height + ", width=" + width + ", area=" + getArea() + "]";
  }
}
