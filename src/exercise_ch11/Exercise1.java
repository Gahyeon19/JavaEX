package exercise_ch11;

//강의자료 11.컬렉션프레임워크 - 프로그래밍 문제 1
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
  public static void main(String[] args) {
    Collection<String> animals = new ArrayList<>();

    animals = new LinkedList<>();


    animals.add("갈매기");
    animals.add("나비");
    animals.add("다람쥐");
    animals.add("라마");

    for (String animal : animals) {
      if (animal.length() == 2){
        System.out.println(animal);
      }
    }
  }
}
