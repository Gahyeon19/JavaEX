package advanced;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    System.out.println(c);
    System.out.println(c.get(Calendar.YEAR));   //2024
    System.out.println(c.get(Calendar.MONTH) + 1);  //month 구할 때는 +1 해주어야한다.
    System.out.println(c.get(Calendar.DAY_OF_MONTH));   //26
    System.out.println(c.get(Calendar.DAY_OF_WEEK));    //2 (1: 일요일, 2: 월요일, ...)

  }
}
