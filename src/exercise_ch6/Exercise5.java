package exercise_ch6;

//강의자료 6.상속 - 프로그래밍 문제 5
public class Exercise5 {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};

    for (Phone phone : phones) {            //instanceof 확인하는 조건문 순서 주의!
      if (phone instanceof Smartphone) {
        Smartphone s = (Smartphone) phone;
        s.playGame();
      }
      else if (phone instanceof Telephone) {
        Telephone t = (Telephone) phone;
        t.autoAnswering();
//        continue;
      }
      else if (phone instanceof Phone){
        phone.talk();
//        continue;
      }
    }
//
//    for (int i = 0; i < phones.length; i++) {
//      if (phones[i] instanceof Smartphone){
//        Smartphone s = (Smartphone) phones[i];
//        s.playGame();
//      }
//      else if (phones[i] instanceof Telephone){
//        Telephone t = (Telephone) phones[i];
//        t.autoAnswering();
//      }
//      else if (phones[i] instanceof Phone){
//        phones[i].talk();
//      }
//    }
  }
}

class Phone{
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void talk(){
    System.out.println(this.owner + "는 통화 중");
  }
}

class Telephone extends Phone{
  private String when;

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  public Telephone(String owner) {
    super(owner);
  }

  public void autoAnswering(){
    System.out.println(super.owner + "가 부재중이오니 " + this.when + " 전화 요망");
  }
}

class Smartphone extends Telephone{
  private String game;

  public Smartphone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  public void playGame(){
    System.out.println(super.owner + "는 " + this.game + " 게임 중");
  }
}
