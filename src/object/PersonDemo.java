package object;

import java.util.Scanner;

public class PersonDemo {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(88).setName("김민국").setNat("UK").setAddress("Seoul").sayHello();

    Person p2 = new Person();
    p2.setAge(20).setName("홍길동").setAddress("경기도").setNat("Canada").sayHello();

//    Person p3 = new Person();
//    Scanner in = new Scanner(System.in);
//    System.out.printf("나이를 입력하시오 : ");
//    String age = in.nextLine();
////    p3.setAge(age);
//    System.out.printf("이름을 입력하시오 : ");
//    String name = in.nextLine();
//    p3.setName(name).setAge(Integer.parseInt(age));
//    p3.sayHello();
  }
}

class Person{
  //필드
  private String name;
  private int age;
  private String nat;
  private String address;
  
  //  
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
  
  public String getNat() {
    return nat;
  }
  
  public Person setName(String name) {
    if (name == null || name.isEmpty() || name.isBlank()){  
      this.name = "홍길동";
    }
    else {
      this.name = name;
    }
    return this;    //main에서 연속된 매서드를 호출할 수 있도록 만들어 줌. (MethodChain)
  }

  public Person setAge(int age) {
    if (age < 0 || age > 130){
      System.out.println("0~129사이만 입력 가능");
    }
    else {
      this.age = age;
    }
    return this;
  }
  
  public Person setNat(String nat) {
    if (nat == null || nat.isEmpty() || nat.isBlank()){ 
      this.nat = "대한민국";
    }
    else {
      this.nat = nat;
    }
    return this;
  }
  
  public Person setAddress(String address) {
    if (address == null || address.isEmpty() || address.isBlank()){  
      this.address = "서울";
    }
    else {
      this.address = address;
    }
    return this;
  }
  
  //매서드
  public void sayHello(){
    System.out.printf("이름 : %s, 나이 : %d, 국적 : %s, 주소 : %s\n", this.name, this.age, this.nat, this.address);
  }
}



