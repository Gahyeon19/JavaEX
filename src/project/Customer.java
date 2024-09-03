package project;

import java.time.LocalDate;

//고객
class Customer{
  private BankCode bankcode;    //은행 코드
  private static long seqno = 0;      //몇 번째 고객인지
  private String customernum;     //고객 번호(생년월일)
  private String customername;    //고객 이름
  private LocalDate transactiondate;  //신규 거래 일자(=계좌 개설일), 최종 거래 일자

  public Customer(String customername, String customernum) {
    this.customername = customername;
    this.customernum = customernum;
    seqno++;
  }

  public BankCode getBankcode() {
    return bankcode;
  }

  public static long getSeqno() {
    return seqno;
  }

  public String getCustomerName() {
    return customername;
  }

  public String getCustomerNum() {
    return customernum;
  }

  public LocalDate getTransactiondate() {
    return transactiondate;
  }

  public void setTransactionDate(){
    this.transactiondate = LocalDate.now();
  }

  @Override
  public String toString() {
    return "Customer{" +
        "customernum='" + customernum + '\'' +
        ", customername='" + customername + '\'' +
        ", transactiondate=" + transactiondate +
        '}';
  }
}

