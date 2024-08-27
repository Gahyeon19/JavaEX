package advanced;

//강의자료 9.제네릭 - 프로그래밍 문제 1
public class Exercise1 {
  public static void main(String[] args) {
    Box<Integer> I = new Box<>();
    I.setValue(Integer.valueOf(100));
    System.out.println(I.getValue());

    Box<String> s = new Box<>();
    s.setValue("만능이네!");
    System.out.println(s.getValue());
  }
}

class Box<T>{
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}