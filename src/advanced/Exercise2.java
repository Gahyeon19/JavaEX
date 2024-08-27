package advanced;

//강의자료 9.제네릭 - 프로그래밍 문제 2
/**
 * 1. 티켓의 가격으로 크고 작음을 비교해야 한다.
 * 2. 배열에서 특정 가격보다 티켓의 가격이 큰 티켓이 몇 개 있는지 세는 매소드가 필요하다.
 * 3. 2에서 만드는 메소드는 티켓 뿐 아니라 비교를 할 수 있는 다른 객체가 와도 재사용 가능해야 한다.
 */
public class Exercise2 {
  public static void main(String[] args) {
    Ticket[] tickets = { new Ticket(1000), new Ticket(2000), new Ticket(3000) };
    System.out.println(countGT(tickets, tickets[0]));

  }

  //Generic Method
  public static <T extends Comparable> int countGT(T[] t, T e){
    int count = 0;
    for (T t1 : t) {
      if (t1.compareTo(e) > 0) count++;
    }
    return count;
  }
}

class Ticket implements Comparable{
  int price;

  public Ticket(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Ticket){
      Ticket t = (Ticket) o;
      return price - t.price;
    }
    return -999;
  }


}
