package advanced;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity());  //16(char) (=32byte)
    sb.append("hello");
    sb.append(" world");
    System.out.println(sb);   //hello world
    sb.reverse();
    System.out.println(sb);   //dlrow olleh

  }
}
