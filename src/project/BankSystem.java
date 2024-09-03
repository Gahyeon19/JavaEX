package project;
/**
 *
 <클래스>
 -계좌 (map)
 (은행코드,) 계좌번호(5자리 숫자), 고객번호(생년월일), 계좌 오픈일자, 삭제일자, 비밀번호, 잔고를 가지고 계좌를 생성한다.
 해당 은행에 계좌가 있고, 계좌번호와 고객번호, 비밀번호가 일치하면 잔액 한도 내에서 출금할 수 있다.
 해당 은행에 계좌가 있고, 계좌번호와 고객번호가 일치하면 입금할 수 잇다.
 해당 은행에 계좌가 있고, 계좌번호와 고객번호, 비밀번호가 일치하면 잔액을 조회할 수 있다.
 더이상 거래를 원하지않으면 계좌를 없앨 수 있다. 잔액이 남아있으면 모두 출금처리 후 삭제처리한다.
 ㄴ(계좌번호, 고객번호, 비밀번호 일치확인 필요)

 -고객 (map)
 (은행코드,) seqno ((각 은행의) 몇 번째 고객인지 - static), 고객번호, 고객명, 신규거래일자 (= 계좌 개설일), 최종거래일자

 ##고객과 계좌는 Aggregation 관계 (집합 관계)

 -은행별 입출금 내역 (map)
 seqno (해당 은행의 몇 번째 거래인지 - static), 생성/입금/출금/조회/삭제 구분코드, 일시, 계좌번호, 고객번호, 금액, 직원번호, 처리상태

 -은행원 (map)
 은행코드, 직원번호, 직원명

 -은행코드 (enum) -- 하나만 하기
 신한, 국민, 카카오 등 10개 정도

 -직업구분코드 (enum)
 생성/입금/출금/조회/삭제

 -처리상태 (enum)
 정상/휴면/오류


 <Map>
 계좌 - 키 ((은행코드,) 계좌번호) / 데이터 (계좌 객체)
 고객 - 키 ((은행코드,) 고객번호) / 데이터 (고객 객체)
 은행별 입출금내역 - 키 (seqno) / 데이터 (입출금내역 객체)
 은행원 - 키 (직원 번호) / 데이터 (은행원 객체)


 <화면>
 업무 구분 코드 - 입금 / 출금 / 조회 / 계좌 생성 / 계좌 삭제
 입금) 계좌번호, .. 입력
 출금) 계좌번호, .. 입력
 조회)
 계좌 생성)
 계좌 삭제)

 */

import java.util.*;

public class BankSystem {
  static Map<String, Account> Accounts = new HashMap<>();    //계좌 : 키-계좌번호, 데이터-계좌 객체
  static Map<String, Customer> Customers = new HashMap<>();  //고객 : 키-고객번호, 데이터-고객 객체

  public static void main(String[] args) {
    Map<Long, Transaction> BankTransaction = new HashMap<>();   //은행별 입출금내역 : 키-seqno, 데이터-입출금내역 객체
    Map<String, BankClerk> BankClerks = new HashMap<>();    //은행원 : 키-직원 번호, 데이터-은행원 객체
//
//    String customernum;
//    String customername;
//    long balance;
//    long deposit;
//    long withdraw;
//    String accountnum;
//    int secret;

    Scanner sc = new Scanner(System.in);

    boolean is = true;
    while (is) {
      System.out.println("1.계좌 생성  2.입금  3.출금  4.조회  5.계좌 삭제  6.종료");
      int n = Integer.parseInt(sc.nextLine());
      switch (n){
        case 1:
          System.out.println("---계좌 생성---");

          CreateAccount(sc);

          System.out.println();
          break;
        case 2 :
          System.out.println("---입금---");

          Deposit(sc);

          System.out.println();
          break;
        case 3 :
          System.out.println("---출금---");

          Withdraw(sc);

          System.out.println();
          break;
        case 4 :
          System.out.println("---조회---");

          CheckAccount(sc);

          System.out.println();
          break;
        case 5 :
          System.out.println("---계좌 삭제---");

          DeleteAccount(sc);

          System.out.println();
          break;
        case 6 :
          System.out.println("---종료---");
          is = false;
          break;
      }
    }
  }

  //계좌 삭제
  private static void DeleteAccount(Scanner sc) {
    String accountnum;
    int secret;
    String customernum;
    System.out.print("계좌 번호 입력 : ");
    accountnum = sc.nextLine();
    System.out.print("고객 번호(생년월일) 입력 : ");
    customernum = sc.nextLine();
    System.out.print("비밀번호 입력 : ");
    secret = Integer.parseInt(sc.nextLine());

    try {
      Accounts.get(accountnum).DeleteAccount(accountnum, customernum, secret);
    } catch (NullPointerException e) {
      System.out.println("===존재하지 않는 계좌 번호입니다.===");
    }

  }

  //계좌 조회
  private static void CheckAccount(Scanner sc) {
    String customernum;
    String accountnum;
    int secret;
    System.out.print("계좌 번호 입력 : ");
    accountnum = sc.nextLine();
    System.out.print("고객 번호(생년월일) 입력 : ");
    customernum = sc.nextLine();
    System.out.print("비밀번호 입력 : ");
    secret = Integer.parseInt(sc.nextLine());

    try {
      Accounts.get(accountnum).CheckAccount(accountnum, customernum, secret);
    } catch (NullPointerException e) {
      System.out.println("===존재하지 않는 계좌 번호입니다.===");
    }

  }

  //출금
  private static void Withdraw(Scanner sc) {
    String customernum;
    int secret;
    long withdraw;
    String accountnum;
    System.out.print("계좌 번호 입력 : ");
    accountnum = sc.nextLine();
    System.out.print("고객 번호(생년월일) 입력 : ");
    customernum = sc.nextLine();
    System.out.print("비밀번호 입력 : ");
    secret = Integer.parseInt(sc.nextLine());
    System.out.print("출금할 금액 입력 : ");
    withdraw = Long.parseLong(sc.nextLine());

    try {
      Accounts.get(accountnum).Withdraw(accountnum, customernum, secret, withdraw);
    } catch (NullPointerException e){
      System.out.println("===존재하지 않는 계좌 번호입니다.===");
    }

  }

  //입금
  private static void Deposit(Scanner sc) {
    long deposit;
    String accountnum;
    String customernum;
    System.out.print("계좌 번호 입력 : ");
    accountnum = sc.nextLine();
    System.out.print("고객 번호(생년월일) 입력 : ");
    customernum = sc.nextLine();
    System.out.print("입금할 금액 입력 : ");
    deposit = Long.parseLong(sc.nextLine());
    try {
      Accounts.get(accountnum).Deposit(accountnum, customernum, deposit);
    } catch (NullPointerException e){
      System.out.println("===존재하지 않는 계좌 번호입니다.===");
    }


//    System.out.println(Customers.get(customernum).getCustomerName());          //고객 이름
//    System.out.println(Customers.get(customernum).getCustomerNum());           //고객 번호
//    System.out.println(Accounts.get(account1.getAccountnum()));                //계좌 번호
//    System.out.println(Accounts.get(account1.getAccountnum()).getBalance());   //잔액
  }

  //계좌 생성
  private static void CreateAccount(Scanner sc) {
    int secret;
    String customernum;
    long balance;
    String customername;

    System.out.print("고객 번호(생년월일) 입력 : ");
    customernum = sc.nextLine();
    System.out.print("고객 이름 입력 : ");
    customername = sc.nextLine();
    System.out.print("잔액 입력 : ");
    balance = Long.parseLong(sc.nextLine());
    System.out.print("비밀번호 입력 : ");
    secret = Integer.parseInt(sc.nextLine());

    Customer customer = new Customer(customername, customernum);
    Account account = new Account(customer, secret, balance);

    System.out.println("계좌 번호는 " + account.getAccountnum() + " 입니다.");

    Accounts.put(account.getAccountnum(), account);
    Customers.put(customernum, customer);
//
//    System.out.println(customer.getCustomerName());                           //고객 이름
//    System.out.println(customer.getCustomerNum());                            //고객 번호
//    System.out.println(Accounts.get(account.getAccountnum()));                //계좌 번호
//    System.out.println(Accounts.get(account.getAccountnum()).getBalance());   //잔액
    System.out.println();
  }
}




//작업 구분 코드(생성/입금/출금/조회/삭제)
enum Menu{
  CREATE, DEPOSIT, WITHDRAW, CHECK, DELETE;
}

//처리 상태(정상/휴면/오류)
enum State{
  SUCCESS, DORMANT, ERROR;
}
