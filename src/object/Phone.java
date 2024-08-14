package object;

class Phone {
  //필드(변수)
  private String model;
  private int price;

  //매서드
  public String getModel(){
    return model;
  }

  public void setModel(String modelname){
    this.model = modelname;
  }

  public int getPrice(){
    return price;
  }

  public void setPrice(int price1){
    this.price = price1;
  }

  void print(){
    System.out.println(price + "원의 모델 " + model + " 휴대폰입니다.");
  }
}
