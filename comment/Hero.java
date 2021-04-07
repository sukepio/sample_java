public class Hero extends Character {

  public Hero(){
    this.setHp(100);
    this.setName("ダミー");
  }
  public void attack(Matango m){
    m.hp -= 5;
  }
  public void sleep(){
    this.setHp(1000);
    System.out.println(this.getName() + "は、眠って回復した！");
  }
  public void sit(int sec){
    this.setHp(this.getHp() + sec );
    System.out.println(this.getName() + "は、" + sec + "秒座った！");
    System.out.println("ＨＰが" + sec + "ポイント回復した！");
  }
  public void slip(){
    this.setHp(this.getHp() - 5 );
    System.out.println(this.getName() + "は、ころんだ！");
    System.out.println("5のダメージ！");
  }
  public void run(){
    System.out.println(this.getName() + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.getHp() + "でした");
  }

}