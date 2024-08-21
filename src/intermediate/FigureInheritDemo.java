package intermediate;

public class FigureInheritDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 3, 3);
    System.out.println(triangle.getArea());

    Rectangular rectangular = new Rectangular(4, 5, 5);
    System.out.println(rectangular.getArea());
  }
}

class Figure{
  int poly;
  public double getArea(){

    return 0.0;
  }
}

class Pentagon extends Figure{

}

class Rectangular extends Figure{
//  private int poly = 4;
  private int height;
  private int width;

  public Rectangular(int poly, int height, int width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double getArea() {
    return height * width;
  }
}

class Triangle extends Figure{
//  private int poly = 3;
  private int height;
  private int width;

  public Triangle(int poly, int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    double area = (double) width * height / 2;
    return area;
  }
}