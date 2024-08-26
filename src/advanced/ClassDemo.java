package advanced;


import exercise_ch7.Line;

public class ClassDemo {
  public static void main(String[] args) {
    Line line = new Line(10);

    Class aClass = line.getClass();
    System.out.println(aClass.getName());               //exercise_ch7.Line
    System.out.println(aClass.getSimpleName());         //Line
    System.out.println(aClass.getTypeName());           //exercise_ch7.Line
    System.out.println(aClass.getPackage());            //package exercise_ch7
    System.out.println(aClass.getPackage().getName());  //exercise_ch7
  }
}
