package object;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    Phone p2 = new Phone();

    p1.setModel("갤럭시 Z 폴드 6");
    p1.setPrice(2_586_000);
    p1.print();

    p2.setModel("아이폰 15 Pro");
    p2.setPrice(2_320_000);
    p2.print();

  }
}
