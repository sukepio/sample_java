import java.util.*;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "はMPが" + this.hp + "に回復した！");
  }

  public int pray(int sec){
    int recover = new Random(3).nextInt(sec);
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println(this.name + "は祈り、MPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}