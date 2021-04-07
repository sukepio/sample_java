public class Main {
  public static void main(String[] args){
    Hero h = new Hero();
    h.setName("ミナト");
    Hero h2 = new Hero();
    h2.setName("アサカ");

    Wizard w = new Wizard();
    w.setName("スガワラ");
    w.setHp(50);

    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(h);
    System.out.println(h.getHp());
  }
}