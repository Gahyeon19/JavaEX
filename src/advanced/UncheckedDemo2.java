package advanced;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    int[] array = {1,2,3};
    int[] array2 = null;


    try {
//      System.out.println(array[3]);   //컴파일러에서 체크하지 않는 Unchecked Exception 발생
//      System.out.println(array2[3]);
      int result = 3/0;
    } catch (ArrayIndexOutOfBoundsException e) {  //array[3]에서 발생하는 오류 예외 처리
//      throw new RuntimeException(e);
      System.out.println("인덱스 범위를 벗어났습니다.");
    } catch (NullPointerException e){             //array2[3]에서 발생하는 오류 예외 처리
      System.out.println("배열이 생성되지 않았습니다.");
    } catch (ArithmeticException e){
      System.out.println("0으로 나눌 수 없습니다."); //3/0에서 발생하는 오류 예외 처리
    } catch (Exception e){
      System.out.println("알 수 없는 예외가 발생했습니다.");
      e.printStackTrace();
      System.out.println(e.getMessage()); //예외 message 출력
    }

    System.out.println("프로그램 종료");


  }
}
