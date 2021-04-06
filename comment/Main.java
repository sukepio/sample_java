public class Main {
  public static void main(String[] args){
    Hero h = new Hero("ミナト");
    Hero h2 = new Hero("アサカ");

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;

    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(h);
    System.out.println(h.hp);
  }
}