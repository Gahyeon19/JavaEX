package datastructure;

public class ListStackDemo {
  public static void main(String[] args) {
    ListStack<String> stack = new ListStack<>();
    System.out.println(stack.isEmpty());    //true
    System.out.println(stack.size);         //0
    if (!stack.isEmpty()){
      stack.peek();
    }

    stack.push("A");
    stack.push("B");
    stack.push("C");

    while (!stack.isEmpty()){
      System.out.println(stack.pop() + " 삭제");
    }

//    stack.pop();

  }
}
