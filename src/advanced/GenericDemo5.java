package advanced;

public class GenericDemo5 {
  public static void main(String[] args) {
    Integer[] ia = {1,2,3,4,5};
    MyUtils.showArray(ia);
    System.out.println("Last : " + MyUtils.getLast(ia));

    String[] sa = {"H","I"};
    MyUtils.showArray(sa);
    System.out.println("Last : " + MyUtils.getLast(sa));

    Double[] da = {1.0, 2.0, 3.5};
    MyUtils.showArray(da);
    System.out.println("Last : " + MyUtils.getLast(da));

    Character[] ca = {'j', 'a', 'v'};
    MyUtils.showArray(ca);
    System.out.println("Last : " + MyUtils.getLast(ca));

  }
}

class MyUtils{
//  public static void showArray(Integer[] iArrays){
//    for (Integer iArray : iArrays) {
//      System.out.print(iArray + "\t");
//    }
//    System.out.println();
//  }
//
//  public static void showArray(String[] sArrays){
//    for (String sArray : sArrays) {
//      System.out.print(sArray + "\t");
//    }
//    System.out.println();
//  }

  public static <T> void showArray(T[] sArrays){
    for (T sArray : sArrays) {
      System.out.print(sArray + "\t");
    }
    System.out.println();
  }

//  public static Integer getLast(Integer[] a){
//    return a[a.length-1];
//  }
//
//  public static Character getLast(Character[] a){
//    return a[a.length-1];
//  }

  public static <T> T getLast(T[] a){
    return a[a.length-1];
  }
}