package advanced2;

import java.util.Collections;
import java.util.Comparator;

public class CarDemo {
  public static void main(String[] args) {
//    Car c1 = new Car("K3", true, 4, 25000);
//    System.out.println(c1);

    int count = 0;
    for (Car car : Car.cars) {
      if (car.getModel() == "소나타") {
        count++;
        System.out.println(car);
      }
    }
    System.out.println("소나타는 " + count + "대 입니다");

    //age 를 기준으로 오름차순 정렬
//    Collections.sort(Car.cars, new Comparator<Car>() {
//      @Override
//      public int compare(Car o1, Car o2) {
//        return o1.getAge() - o2.getAge();
//      }
//    });
    Collections.sort(Car.cars, (c1, c2) -> c1.getAge() - c2.getAge());
    System.out.println(Car.cars);


    //mileage 를 기준으로 내림차순 정렬
    //    Collections.sort(Car.cars, new Comparator<Car>() {
//      @Override
//      public int compare(Car o1, Car o2) {
//        return o2.getMileage() - o1.getMileage();
//      }
//    });
    Collections.sort(Car.cars, (c1, c2) -> c2.getMileage() - c1.getMileage());
    System.out.println(Car.cars);


    //model 을 기준으로 오름차순 정렬
    Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);    //car -> car.getModel()
    Collections.sort(Car.cars, modelComparator);
    System.out.println(Car.cars);

  }
}
