package collection_framework;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> list = new Stack<>();
    Stack<String> st = new Stack<>();

    System.out.println(list.isEmpty());
    System.out.println(st.empty());

    st.push("복숭아");          //addFirst()
    st.push("키위");            //addFirst()
    st.push("포도");            //addFirst()
    System.out.println(st);         //[복숭아, 키위, 포도]
    System.out.println(st.peek());  //포도

    System.out.println(st.search("복숭아") + "번째");    //3
    System.out.println(st.search("키위") + "번째");     //2
    System.out.println(st.search("포도") + "번째");     //1 (위에서부터 1로 센다)

    while (!st.empty()){
      st.pop();                       //removeFirst()
      System.out.println(st);
    }
//    st.pop();                       //removeFirst()
//    System.out.println(st);         //[복숭아, 키위]
//    st.pop();                       //removeFirst()
//    System.out.println(st);         //[복숭아]
//    st.pop();                       //removeFirst()
//    System.out.println(st);         //[]
  }
}
