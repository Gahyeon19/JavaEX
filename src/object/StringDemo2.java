package object;

public class StringDemo2 {
  public static void main(String[] args) {
//    String s1 = "Hi, JAVA!";
//    String s2 = "Hi, JAVA!";
//    String s3 = new String("Hi, JAVA!");
//
//    System.out.println("s1 == s2 : " + (s1 == s2));            //true  //동일비교
//    System.out.println("s1 == s3 : " + (s1 == s3));            //false //동일비교
//    System.out.println("s1, s3 동등비교 : " + s1.equals(s3));   //ture   //동등비교
//
//    s1 = s3;
//    System.out.println("s1 == s3 : " + (s1 == s3));            //true   //동일비교
//    System.out.println("s1, s3 동등비교 : " + s1.equals(s3));   //ture   //동등비교

    String s1 = "JAVA!";
    String s2 = "java!";
    String s3 = new String("HTML!");

    int compareResult = s2.compareTo(s1);
    System.out.println(compareResult);
    int compareResult2 = s1.compareTo(s2);
    System.out.println(compareResult2);

    int compareResult3 = s1.compareToIgnoreCase(s2);
    boolean equalResult = s1.equalsIgnoreCase(s2);
    if (equalResult == true) System.out.println("s1과 s2는 값이 같다.");
    if (compareResult == 0) System.out.println("s1과 s2는 값이 같다.");
     System.out.println(compareResult3);


  }
}
