package advanced;

public class GenericDemo {
  public static void main(String[] args) {
    CupBoricha cupBoricha = new CupBoricha();
    cupBoricha.setBeverage(new Boricha());
    Boricha beverage1 = cupBoricha.getBeverage();

    CupBeer cupBeer = new CupBeer();
    cupBeer.setBeverage(new Beer());
    Beer beverage2 = cupBeer.getBeverage();

    //컵 안에 있는게 맥주인지 보리차인지 알 수 없으므로 매번 타입 확인을 해주어야하므로 번거로움 발생.
//    Cup cup = new Cup();
//    cup.setBeverage(new Beer());
//    Object beverage = cup.getBeverage();
//    Beer b = (Beer) beverage;   //형변환 해주어야 name을 출력 할 수 있다.
//    System.out.println(((Beer) beverage).name);   //맥주
//
//    cup.setBeverage(new Boricha());
//    Object beverage3 = cup.getBeverage();
//    Boricha bo = (Boricha) beverage3;
//    System.out.println(((Boricha) beverage3).name);   //보리차

  }
}

class Beverage{

}

class Boricha extends Beverage{
  String name = "보리차";
}

class Beer extends Beverage{
  String name = "맥주";
}
//
//class Cup{
//  private Object beverage;
//
//  public Object getBeverage() {
//    return beverage;
//  }
//
//  public void setBeverage(Object beverage) {
//    this.beverage = beverage;
//  }
//}

class CupBeer{
  private Beer beverage;

  public Beer getBeverage() {
    return beverage;
  }

  public void setBeverage(Beer beverage) {
    this.beverage = beverage;
  }
}

class CupBoricha{
  private Boricha beverage;

  public Boricha getBeverage() {
    return beverage;
  }

  public void setBeverage(Boricha beverage) {
    this.beverage = beverage;
  }
}