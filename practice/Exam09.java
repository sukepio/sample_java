public class Exam09 {
  public static void main(String[] args){
    int[] numbers = {21,54,19,68,49,37,3,15,34,6};
    int min = numbers[0];
    int max = numbers[0];
    for(int n = 1; n < numbers.length; n++ ){
      min = Math.min(min, numbers[n]);
      max = Math.max(max, numbers[n]);
    }
    System.out.println("配列内で最も小さい数値は" + min);
    System.out.println("配列内で最も小さい数値は" + max);
  }
}
