package advanced;

public class ExceptionHandlingDemo2 {
  public static void main(String[] args) {
    System.out.println(Integer.parseInt("10"));
    System.out.println(Integer.parseInt("hi")); //NumberFormatException(Unchecked Exception)

  }
}
