package interface_;

/*
모든 동물을 소리를 낸다.  > interface
강아지는 멍멍, 뻐꾸기는 뻐꾹  >구혀
 */

public interface Animal {
  void sound();
}

class Dog implements Animal{
  @Override
  public void sound() {
    System.out.println("멍멍 ~");
  }
}

class Cuckoo implements Animal{
  @Override
  public void sound() {
    System.out.println("뻐꾹 ~");
  }
}
