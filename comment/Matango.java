public class Matango {
  int hp;
  final int LEVEL = 10;
  char suffix;
  public Matango(char suffix){
    this.suffix = suffix;
  }

  public void attack(Hero h){
    System.out.println("キノコ" + this.suffix + "の攻撃");
    System.out.println("10の攻撃");
    h.setHp(h.getHp() - 10);
  }

  public void run(){
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }
}