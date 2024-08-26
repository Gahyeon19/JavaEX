package advanced;

public class CheckedDemo {
  public static void main(String[] args) throws InterruptedException {
    Thread.sleep(100);  //Checked Exception > throws InterruptedException 으로 해결
    try {
      Thread.sleep(100);
      System.out.println("아무일도 일어나지 않음");
    } catch (InterruptedException e){
      throw new RuntimeException(e);
//      System.out.println("예외가 발생했습니다.");
    }
  }
}
