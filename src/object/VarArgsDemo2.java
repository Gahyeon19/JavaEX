package object;

public class VarArgsDemo2 {
  public static void main(String[] args) {
    int[] arr = {2,3};
    System.out.println(sum(1,2,3,4));
    System.out.println(sum(1,arr));
    System.out.println(sum(1,2,3,4,5));
  }

  private static int sum(int num, int...nums){
    int sum = 0;
    for (int n : nums) {
      sum += n;
    }
    return sum;
  }
}
