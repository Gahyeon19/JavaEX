package datastructure;

import java.util.Arrays;

public class ArrList<E> {   //Generic Class
  private E[] a;  //E a[];
  private int size;

  public ArrList() {
    a = (E[])(new Object[1]);
    size = 0;
  }

  public int size() {
    return size;
  }

  public int length(){
    return a.length;
  }

  //삽입, 탐색, 삭제를 위한 연산 매서드
  private void resize(int length) {
    //배열의 크기를 length 만큼 증가 혹은 감소시킨다.
    //기존 배열의 값을 새로 만든 배열로 옮긴다.
    //기존 배열(a)을 가리키던 참조변수는 새로 만든 배열(t)을 가리킨다.
    E[] t = (E[])new Object[length];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a = t;
  }

  public boolean add(E e){  //맨 마지막에 추가한다. (addLast)
    if (a.length == size){
      resize(a.length * 2);
    }
    a[size] = e;
    size++;
    return true;
  }



  public E remove() {
    if (size > 0){
      E removed = a[size - 1];
      a[size - 1] = null;
      size--;

      if (a.length / 2 > size){
        resize(a.length / 2);
      }
      return removed;
    }
    else {
      return null;
    }
  }

  public E peek(int k){
    //underflow 방지하도록 해야함
    return a[k];
  }

  @Override
  public String toString() {
    return "ArrList : " + Arrays.toString(a);
  }
}
