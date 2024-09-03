package project;

import java.time.LocalDate;

//계좌
class Account{
  //  private String bank;  //은행코드
  private String accountnum;  //계좌 번호(5자리 숫자)
  private Customer customer;
  private LocalDate opendate;          //계좌 개설일
  private LocalDate closedate;   //계좌 폐지일
  private long balance;     //잔액
  private int secret;         //비밀번호(4자리 숫자)

  //계좌 생성
  public Account(Customer customer, int secret, long balance) {
    this.accountnum = String.valueOf((int) (Math.random() * 89999) + 10000);
    this.customer = customer;
    this.opendate = LocalDate.now();
    this.closedate = null;
    this.balance = balance;
    this.secret = secret;

  }

  public String getAccountnum() {
    return accountnum;
  }



  public long getBalance() {
    return balance;
  }

  @Override
  public String toString() {
    return "Account{" +
        "accountnum=" + accountnum +
        ", customer=" + customer +
        ", opendate=" + opendate +
        ", closedate=" + closedate +
        ", balance=" + balance +
        ", secret=" + secret +
        '}';
  }

  //입금
  public void Deposit(String accountnum, String customernum, long deposit){
    //삭제된 계좌번호를 입력하면?
    if (this.accountnum == null){
      System.out.println("존재하지 않는 계좌 번호입니다.");
    }
    else {
      if (this.accountnum.equals(accountnum) && customer.getCustomerNum().equals(customernum)){
        this.balance += deposit;
        System.out.println("입금 성공 | 잔액 : " + this.balance);
      } else if (customer.getCustomerNum().equals(customernum)){
        System.out.println("입금 실패 | 고객 번호가 일치하지 않습니다.");
      } else if (this.accountnum.equals(accountnum)){
        System.out.println("입금 실패 | 계좌 번호가 일치하지 않습니다."); //
      }
    }

    customer.setTransactionDate();
  }

  //출금
  public void Withdraw(String accountnum, String customernum, int secret, long withdraw){
    if (accountnum.equals(this.accountnum) && customernum.equals(customer.getCustomerNum()) && secret == this.secret){
      if (withdraw <= this.balance){
        this.balance -= withdraw;
        System.out.println("출금 성공 | 잔액 : " + this.balance);
      }
      else {
        System.out.println("잔액이 부족합니다.");
      }
    }
    else {
      System.out.println("출금 실패 | 정보가 일치하지 않습니다.");
    }
    customer.setTransactionDate();
  }

  //조회
  public void CheckAccount(String accountnum, String customernum, int secret){
    if (accountnum.equals(this.accountnum) && customernum.equals(customer.getCustomerNum()) && secret == this.secret){
      System.out.println("잔액 : " + this.balance);
    }
    else {
      System.out.println("잔액 조회 불가 | 정보가 일치하지 않습니다.");
    }
    customer.setTransactionDate();
  }

  //계좌 삭제
  public void DeleteAccount(String accountnum, String customernum, int secret){
    if (accountnum.equals(this.accountnum) && customernum.equals(customer.getCustomerNum()) && secret == this.secret){
      if (balance != 0){
        Withdraw(accountnum, customernum, secret, balance);
      }
      System.out.println("계좌를 삭제합니다.");
      this.accountnum = null;
      this.secret = 0;
      this.opendate = null;
      this.closedate = LocalDate.now();
      System.out.println("계좌 삭제일 : " + LocalDate.now());
    }
    customer.setTransactionDate();  //계좌 삭제도 거래일에 포함 ?

  }

}
