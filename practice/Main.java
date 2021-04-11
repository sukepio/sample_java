import java.util.*;

public class Main {
  public static void main(String[] args){
    ArrayList<Integer> array = new ArrayList<Integer>();
    array.add(10);
    array.add(15);
    array.add(20);
    Iterator<Integer> it = array.iterator();
    while (it.hasNext()){
      int e = it.next();
      System.out.println(e);
    }
  }
}
