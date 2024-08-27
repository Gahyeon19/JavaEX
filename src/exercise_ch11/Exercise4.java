package exercise_ch11;

//강의자료 11.컬렉션프레임워크 - 프로그래밍 문제 4
/**
 * 키보드로 입력한 정수 값을 학생의 점수로 사용하여 동적배열 ArrayList에 저장한다.
 * 점수를 한 줄로 ','로 구분하여 입력받는다.
 * 정수가 아닌 다른 값이 입력될 경우 예외처리 해야한다.
 * 학생들의 총점과 평균을 출력한다.
 *
 * 입력된 정수 값이 음수면 입력의 끝이되는 코드도 작성해보기
 */
import java.util.*;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Integer> scoreList = new ArrayList<>();
    System.out.print("학생들의 점수를 ,로 구분하여 한 줄로 입력하세요 : ");
    String scores = in.nextLine();
    StringTokenizer st = new StringTokenizer(scores, ",");
    int score;
    int sum = 0;

    while (st.hasMoreTokens()){
      try {
//      score = in.nextInt();
        score = Integer.parseInt(st.nextToken());  //score = Integer.valueOf(st.nextToken());
        System.out.println(score);
        scoreList.add(score);
      } catch (NumberFormatException e){
        System.out.println("정수를 입력하세요.");
      }
    }

    for (Integer i : scoreList) {
      sum += i;
    }
    double avg = (double) sum / scoreList.size();

    System.out.println("전체 학생 : " + scoreList.size() + "명");
    System.out.println("학생들의 성적 : " + scoreList);
    System.out.println("전체 합계 : " + sum);
    System.out.println("전체 평균 : " + avg);
  }
}
