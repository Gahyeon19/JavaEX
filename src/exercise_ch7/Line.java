package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 3-1
public class Line implements Comparable {
  int length;

  public Line(int length) {
    this.length = length;
  }


  @Override
  public int compareTo(Object o) {
    if (o instanceof Line){
      Line line = (Line) o;
      int res;
      if (this.length < line.length){
        res = -1;
      }
      else if (this.length > line.length) {
        res = 1;
      }
      else res = 0;
      return res;
    }
    return -999;
  }

  @Override
  public String toString() {
    return "Line[" + "length=" + length + "]";
  }
}
