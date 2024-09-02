package project;
/**
 *
 <클래스>
 -계좌 (map)
 은행코드, 계좌번호(5자리 숫자), 고객번호(생년월일), 계좌 오픈일자, 삭제일자, 비밀번호, 잔고를 가지고 계좌를 생성한다.
 해당 은행에 계좌가 있고, 계좌번호와 고객번호, 비밀번호가 일치하면 잔액 한도 내에서 출금할 수 있다.
 해당 은행에 계좌가 있고, 계좌번호와 고객번호가 일치하면 입금할 수 잇다.
 해당 은행에 계좌가 있고, 계좌번호와 고객번호, 비밀번호가 일치하면 잔액을 조회할 수 있다.
 더이상 거래를 원하지않으면 계좌를 없앨 수 있다. 잔액이 남아있으면 모두 출금처리 후 삭제처리한다.
 ㄴ(계좌번호, 고객번호, 비밀번호 일치확인 필요)

 -고객 (map)
 은행코드, accountnum, 고객번호, 고객명, 신규거래일자, 최종거래일자

 -은행별 입출금 내역 (map)
 accountnum, 생성/입금/출금/조회/삭제 구분코드, 일시, 계좌번호, 고객번호, 금액, 직원번호, 처리상태

 -은행원 (map)
 은행코드, 직원번호, 직원명

 -은행코드 (enum)
 신한, 국민, 카카오 등 10개 정도

 -직업구분코드 (enum)
 생성/입금/출금/조회/삭제

 -처리상태 (enum)
 정상/오류


 <Map>
 계좌 - 키 ((은행코드,) 계좌번호) / 데이터 (계좌 객체)
 고객 - 키 ((은행코드,) 고객번호) / 데이터 (고객 객체)
 은행별 입출금내역 - 키 (accountnum) / 데이터 (입출금내역 객체)
 은행원 - 키 (직원 번호) / 데이터 (은행원 객체)


 <화면>
 업무 구분 코드 - 입금 / 출금 / 조회 / 계좌 생성 / 계좌 삭제
 입금) 계좌번호, .. 입력
 출금) 계좌번호, .. 입력
 조회)
 계좌 생성)
 계좌 삭제)
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("1.계좌 생성  2.입금  3.출금  4.조회  5.계좌 삭제");
      int n = sc.nextInt();


    } while (true);



  }
}

//계좌
class Account{
//  private String bank;  //은행코드
  private int accountnum;  //계좌 번호(5자리 숫자)
  private String num;      //고객 번호(생년월일)
  private Date open;          //계좌 개설일
  private Date close = null;   //계좌 폐지일
  private double balance;     //잔액
  private int secret;         //비밀번호(4자리 숫자)

  public Account(int accountnum, String num, Date open, Date close, double balance, int secret) {
    this.accountnum = accountnum;
    this.num = num;
    this.open = open;
    this.close = close;
    this.balance = balance;
    this.secret = secret;
  }
}

//고객
class Customer{
//  private String bank;    //은행 코드
  private static int seqno = 0;      //몇 번째 고객인지
  private String num;     //고객 번호(생년월일)
  private String name;    //고객 이름
  private Date open, last;  //신규 거래 일자(=계좌 개설일), 최종 거래 일자

}

//은행별 입출금 내역
class DepositWithdraw{
  private static int seqno = 0;   //해당 은행의 몇 번째 거래인지
  private int code;   //
  private Date date;    //일시
  private int accountnum;  //계좌 번호(5자리 숫자)
  private String num; //고객 번호(생년월일)
  private double balance;   //금액
  private String clerknum;  //직원 번호
  private String state;     //처리 상태

}

//은행원
class BankClerk{
  private String bankcode;
  private String clerknum;
  private String clerkname;

  public BankClerk(String bankcode, String clerknum, String clerkname) {
    this.bankcode = bankcode;
    this.clerknum = clerknum;
    this.clerkname = clerkname;
  }
}

//작업 구분 코드(생성/입금/출금/조회/삭제)
class Menu{

}

//은행 코드(신한, 국민, 카카오, 우리, 토스, 농협, )
class BankCode{
  String bankcode = "신한";
}

//처리 상태(정상/오류)
class State{

}
