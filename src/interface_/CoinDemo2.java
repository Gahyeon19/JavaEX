package interface_;

public class CoinDemo2 implements Coin, MyInterface{  //다중 상속
  public static void main(String[] args) {
    //CoinDemo.java 에서와 다르게 Coin 을 상속하고 있기 때문에 Coin.DIME 이 아닌 DIME 으로 불러올 수 있다.
    System.out.println("Dime : " + DIME);
    System.out.println("Quater : " + QUARTER);
  }

  //MyInterface 를 상속하고 있기 때문에 Override 해주어야한다.
  @Override
  public void sayHello() {

  }
}
