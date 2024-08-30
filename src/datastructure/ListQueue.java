package datastructure;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;

  public ListQueue(){
    front = null;
    rear = null;
    size = 0;
  }

  boolean isEmpty(){
    return size == 0 ? true : false;
  }

  int size(){
    return size;
  }

  //offer, poll
  void offer(E e){
    Node<E> newNode = new Node<>();
    newNode.e = e;

    rear = newNode;
    newNode.next = rear;
    if (size == 0){
      front = newNode;
    }
    else {
      getNode(size-1).next = newNode;
    }
    size++;
  }

  E poll(){
    if (isEmpty()){
      return null;
    }
    Node<E> removedNode = front;
    front = front.next;
    removedNode.next = null;
    if (size == 1){
      front = null;
      rear = null;
    }
    size--;
    return removedNode.e;
  }

  Node<E> getNode(int index){
    Node<E> find = front;
    for (int i = 0; i < index; i++) {
      find = find.next;
    }
    return find;
  }

  private class Node<E>{
    E e;
    Node<E> next;
  }
}
