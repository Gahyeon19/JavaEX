package intermediate;

public class ClassCastDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 5,8);
    //Triangle extends Figure 이므로
    Figure figure = triangle;   //
    System.out.println(figure.poly);
    System.out.println(figure.getArea());

  }
}


