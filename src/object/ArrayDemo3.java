package object;

import java.util.Arrays;

public class ArrayDemo3 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};

//    System.out.println(num);    //num 배열의 주소값 출력
    System.out.println(Arrays.toString(num));   //[10, 20, 30] 출력

    for (int i = 0; i < num.length; i++) {
      if (i != num.length-1){
        System.out.print(num[i] + ",");
      }
      else {
        System.out.println(num[i]);
      }
    }

    //방법1
    //Step1 : num 배열의 크기를 5로 변경
    int[] newNum = new int[5];
    for (int i = 0; i < newNum.length; i++) {
      if (i != newNum.length-1){
        System.out.print(newNum[i] + ",");
      }
      else {
        System.out.println(newNum[i]);
      }
    }

    //Step2 : num 배열의 요소들을 newNum으로 복사
    for (int i = 0; i < num.length; i++) {
      newNum[i] = num[i];
    }

    //Step3 : newNum을 num이 참조하도록 한다.
    num = newNum;

    for (int i = 0; i < num.length; i++) {
      if (i != num.length-1){
        System.out.print(num[i] + ",");
      }
      else {
        System.out.println(num[i]);
      }
    }

    System.out.println(Arrays.toString(num));       //[10, 20, 30, 0, 0] 출력
    System.out.println(Arrays.toString(newNum));    //[10, 20, 30, 0, 0] 출력

    //방법2 : 새로운 객체로 만들어서 재생성
//    num = new int[] {10,20,30,40,0,0,0,0};

  }
}
