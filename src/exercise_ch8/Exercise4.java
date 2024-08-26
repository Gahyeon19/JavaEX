package exercise_ch8;

//강의자료 8.기본패키지 - 프로그래밍 문제 4
/**
 * 주사위 게임용 Dice 클래스 작성
 */
import java.util.Random;

public class Exercise4 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(new Dice().roll());
    }
  }
}

//방법1. Math 클래스의 random() 메서드를 사용해 숫자를 임의로 반환
//방법2. Random 클래스의 메서드를 이용
class Dice{
//  Random random = new Random();
//
  public int roll(){
//    return random.nextInt(1,7);   //random.nextInt(1,7) 은 1,2,3,4,5,6 을 출력
    return ((int)(Math.random() * 6) + 1);
  }

}