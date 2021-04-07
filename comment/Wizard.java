public class Wizard {
  private String name;
  private int hp;
  private int mp;
  private Wand wand;

  void heal(Hero h){
    int basePoint = 10;
    int recovPoint = (int)(basePoint * this.getWand().getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    if (name.length() < 3){
      throw new IllegalArgumentException("名前が短すぎます。処理を中断");
    }
    this.name = name;
  }

  public Wand getWand(){
    return this.wand;
  }

  public void setWand(Wand wand){
    if (wand == null){
      throw new IllegalArgumentException("設定されようとしている杖がNUllです");
    }
    this.wand = wand;
  }

  public int getHp(){
    return this.hp;
  }

  public void setHp(int hp){
    if (hp < 0 ){
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  public int getMp(){
    return this.mp;
  }

  public void setMp(int mp){
    if (mp < 0 ){
      throw new IllegalArgumentException("MPは0以上に設定してください。処理を中断");
    }
    this.mp = mp;
  }
}
