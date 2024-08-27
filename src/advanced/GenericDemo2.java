package advanced;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup<Beer> c1 = new Cup<>();     //Beer를 담을 Cup c1

    c1.setBeverage(new Beer());
    Beer beer = c1.getBeverage();
    System.out.println(beer.name);    //맥주

//    c1.setBeverage(new Boricha());  //c1의 타입을 Beer 로 타입을 정했기 때문에 Boricha는 담을 수 없음

    Cup<Boricha> c2;
//    Cup<String> cs;   //Cup<T extends Beverage> 이므로 String 은 쓸 수 없음.
//                      //Beverage 를 상속받아 타입을 제한하기 위하 방법

  }
}

class Cup<T extends Beverage>{     //타입을 정하지 않은 Generic Type의 클래스
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }

}

