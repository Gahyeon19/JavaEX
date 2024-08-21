package intermediate;

import java.util.Arrays;
import java.util.Calendar;
import static java.util.Calendar.getInstance;

public class StaticImportDemo {
  public static void main(String[] args) {
    int[] i = new int[5];
    Arrays.toString(i);
    int[] l = new int[3];
    Arrays.toString(l);

    getInstance();
  }
}
