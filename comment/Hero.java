public class Hero extends Character {

  public Hero(String name){
    this.hp = 100;
    this.name = name;
  }

  public Hero(){
    this("ダミー");
  }

  public void attack(Matango m){
    m.hp -= 5;
  }
  public void sleep(){
    this.hp = 1000;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("ＨＰが" + sec + "ポイント回復した！");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は、ころんだ！");
    System.out.println("5のダメージ！");
  }
  public void run(){
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}