package object;

public class WithoutArrayDemo {
  public static void main(String[] args) {
    int score1 = 90;
    String grade1 = "";
    if (score1 >= 90){
      grade1 = "A";
    }

    int score2 = 75;
    String grade2 = "";
    if (score2 >= 90){
      grade2 = "A";
    }
    else if (score2 >= 80){
      grade2 = "B";
    }
    else {
      grade2 = "C";
    }

    int score3 = 85;
    String grade3 = "";
    if (score3 >= 90){
      grade3 = "A";
    }
    else if (score3 >= 80){
      grade3 = "B";
    }
    else {
      grade3 = "C";
    }

    System.out.println(grade1);
    System.out.println(grade2);
    System.out.println(grade3);
  }
}
