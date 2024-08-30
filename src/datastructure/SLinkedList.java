package datastructure;

public class SLinkedList<E> {
  private Node<E> head;
  private Node<E> tail;
  private int size;

  public SLinkedList(){
    head = null;
    tail = null;
    size = 0;
  }

  public int size(){
    return size;
  }

  //탐색, 삽입, 삭제 매서드
  void addLast(E e){
    Node<E> newNode = new Node<>();
    newNode.e = e;

    tail = newNode;
    newNode.next = tail;
    if (size == 0){
      head = newNode;
    }
    else {
      getNode(size-1).next = newNode;
    }
    size++;
  }

  void addFirst(E e){
    //Node 생성 + 값을 할당.
    Node<E> newNode = new Node<>();
    newNode.e = e;
    newNode.next = head;

    if (size == 0){
      tail = newNode;
    }
    head = newNode;   //head는 첫번째 Node를 가리킨다.

    size++;
  }

  E removeFirst(){
    Node<E> removedNode = head;
    head = head.next;
    removedNode.next = null;
    if (size == 1){
      head = null;
      tail = null;
    }
    size--;
    return removedNode.e;
  }

  E removeLast(){
    Node<E> removedNode = tail;
    if (size > 1) {
      Node<E> previousNode = getNode(size - 2);
      previousNode.next = null;
      tail = previousNode;
    } else if (size == 1) {
      head = null;
      tail = null;
    }
    size--;
    return removedNode.e;
  }

  E getValue(int index){
    Node<E> find = head;
    for (int i = 0; i < index; i++) {
      find = find.next;
    }
    return find.e;
  }

  Node<E> getNode(int index){
    Node<E> find = head;
    for (int i = 0; i < index; i++) {
      find = find.next;
    }
    return find;
  }

  private class Node<E>{
    private E e;
    Node<E> next;
  }

  @Override
  public String toString() {
    return "SLinkedList[head=" + head + ", size=" + size + "]";
  }
}

