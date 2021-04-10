public class Exam10 {
  public static void main(String[] args){
    int[] numbers = {32,79,35,25,82,77,34,16,61,39};
    System.out.println("配列内の偶数は以下の数値です");
    for (int n : numbers ){
      if (n % 2 == 0){
        System.out.println(n);
      }
    }
    System.out.println("配列内の奇数は以下の数値です");
    for (int n : numbers ){
      if (n % 2 != 0){
        System.out.println(n);
      }
    }
  }
}
