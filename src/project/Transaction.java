package project;

import java.time.LocalDate;

//은행별 입출금 내역
class Transaction {
  private static long seqno = 0;   //해당 은행의 몇 번째 거래인지
  private int code;   //작업 구분 코드(생성/입금/출금/조회/삭제)
  private LocalDate date;    //일시
  private int accountnum;  //계좌 번호(5자리 숫자)
  private String Customernum; //고객 번호(생년월일)
  private double balance;   //금액
  private String clerknum;  //직원 번호
  private String state;     //처리 상태

  private Customer customer;
  private BankClerk bankclerk;
  private Account account;




}
