package advanced2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorDemo {
  public static void main(String[] args) {
    Set<String> nationNames = Nation.nations.stream()
        .map(n -> n.getName())    //이름만 뽑아서
        .collect(Collectors.toSet());  //Set 에 저장

    for (String nationName : nationNames) {
      System.out.println(nationName);
    }

    Set<Nation.Type> nationTypes = Nation.nations.stream()
        .map(n -> n.getType())    //타입만 뽑아서
        .collect(Collectors.toSet());//Set 에 저장

    for (Nation.Type nationType : nationTypes) {
      System.out.println(nationType);
    }

    List<String> names = Nation.nations.stream()
        .map(n -> n.getName())    //이름만 뽑아서
        .limit(3)           //상위 3개만
        .collect(Collectors.toList());//List 에 저장

    for (String name : names) {
      System.out.println(name);
    }


    Map<String, Double> nationsMap = Nation.nations.stream()
        .filter(Nation::isIsland)
        .collect(Collectors.toMap(Nation::getName, Nation::getPopulation));   //key : name, value : population
    System.out.println(nationsMap);

  }
}
