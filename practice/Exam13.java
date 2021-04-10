public class Exam13 {
  
  public static void main(String[] args){
    String[][] week = {{"日","月","火","水","木","金","土"}, {"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."}};
    for (int i = 0; i < week[0].length; i++){
      System.out.println(week[0][i] + "曜日は英語では" +  week[1][i] + "です");
    }
  }
}
