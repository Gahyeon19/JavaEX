package datastructure;

import java.util.EmptyStackException;

public class ListStack<E> {
  Node<E> top;
  int size;

  public ListStack(){
    top = null;
    size = 0;
  }

  boolean isEmpty(){
    return size == 0 ? true : false;
  }

  int size(){
    return size;
  }

  //push, pop, peek
  E peek(){
    if (isEmpty()){
      throw new EmptyStackException();
    }
    return top.e;
  }

  void push(E e){
    //Node 생성 + 값을 할당.
    Node<E> newNode = new Node<>();
    newNode.e = e;
    newNode.next = top;

    top = newNode;   //head는 첫번째 Node를 가리킨다.
    size++;
  }

  E pop(){
    if (isEmpty()){
      throw new EmptyStackException();
    }
    Node<E> removedNode = top;
    top = top.next;
    removedNode.next = null;
    if (size == 1){
      top = null;
    }
    size--;
    return removedNode.e;
  }

  private class Node<E>{
    E e;
    Node<E> next;
  }
}

