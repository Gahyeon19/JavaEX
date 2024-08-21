package intermediate;

public class SuperConstructorDemo {
  public static void main(String[] args) {
    ColoredBox coloredBox1 = new ColoredBox();
    System.out.println(coloredBox1.size);
    ColoredBox coloredBox2 = new ColoredBox(5);
    System.out.println(coloredBox2.size);

  }
}

class Box{
  int size = 0;

  public Box(){
    System.out.println("Parent Constructor");
  }
  public Box(int size){
    this.size = size;
    System.out.println("Parent Constructor2");
  }
}

class ColoredBox extends Box{
  public ColoredBox(){
    super();
    System.out.println("Child Constructor");
  }
  public ColoredBox(int size){
    super(size);
    System.out.println("Child Constructor2");
  }
}
