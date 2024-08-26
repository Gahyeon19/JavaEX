package exercise_ch7;

//강의자료 7.인터페이스와 특수클래스 - 프로그래밍 문제 3-3
import java.util.Arrays;
/**
 * 가격 순서대로 오름차순 정렬한 후 출력한다.
 */
public class Exercise3_3 {
  public static void main(String[] args) {
    //Books[] books = new Book[3];
    Book[] books = {new Book(15000), new Book(50000), new Book(20000)};   //3개의 Book 객체로 구성된 Book 배열

    for (Book book : books) {
      System.out.println(book);
    }

    Arrays.sort(books);
    System.out.println();
    for (Book book : books) {
      System.out.println(book);
    }
  }
}

class Book implements Comparable{
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book [price=" + price + "]";
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Book){
      Book b = (Book) o;
      return this.price - b.price;  //+,- 값에 따라 크기 비교 가능
    }
    return -999999999;
  }
}