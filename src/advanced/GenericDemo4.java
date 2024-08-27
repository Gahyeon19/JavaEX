package advanced;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
  public static void main(String[] args) {
    List<Beverage> list = new ArrayList<>();

    ArrayList<Beverage> beverages = new ArrayList<>();
    beverages.add(new Beer());
    beverages.add(new Boricha());
    bevTest(beverages);
    listTest(beverages);    //List는 ArrayList의 부모 + listTest는 Beverage를 담는 매서드이므로 사용가능
    //ArrayList<Beverage>와 ArrayLit<Beer>는 상속관계가 아니다.
    ArrayList<Beer> beers = new ArrayList<>();
    beers.add(new Beer());
//    beers.add(new Boricha());   //불가능
//    bevTest(beers);             //Beverage를 담는 ArrayList만 사용할 수 있는 매서드이므로 사용 불가
//    listTest(beers);            //불가능


    //Beverage와 Beer는 상속관계이므로 아래의 코드는 가능.
    Beverage beverage = new Beverage();
    Beer beer = new Beer();
    beverage = beer;

  }

  public static void bevTest(ArrayList<Beverage> b){
    //Beverage를 담는 ArrayList만 사용할 수 있는 매서드
  }

  public static void listTest(List<Beverage> l){
    //Beverage를 담는 List만 사용할 수 있는 매서드
  }
}
