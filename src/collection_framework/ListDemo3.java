package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3 {
  public static void main(String[] args) {
    List<String> sList = Arrays.asList("사자", "호랑이", "곰"); //Arrays.asList(new String[]{"사자","호랑이"});
    sList.set(2, "판다");
    System.out.println(sList);

//    sList.add("기린");  //처음부터 List의 길이를 고정했기 때문에 add가 안됨.

    List<String> sList2 =  new ArrayList<>(sList);
    sList2.add("기린");   //새로 List를 만들어서 add 하면 가능
    System.out.println(sList2);
  }
}
