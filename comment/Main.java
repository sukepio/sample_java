import java.util.*;
public class Main {
  public static void main(String[] args){
    Hero h = new Hero();
    h.setName("ミナト");
    Hero h2 = new Hero();
    h2.setName("アサカ");

    ArrayList<Hero> names = new ArrayList<>();
    names.add(h);
    names.add(h2);
    for(Hero name : names) {
      System.out.println(name.getName());
    }
    Wizard w = new Wizard();
    w.setName("スガワラ");
    w.setHp(50);

    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(h);
    System.out.println(h.getHp());
  }

}