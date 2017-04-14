import java.util.Random;

public class Pirate {
  private String name;
  private int age, mountOfRum;
  private boolean isWoodenLeged, isSleeping, isDead;

  public Pirate() {
    this.name = "Jack";
    this.age = -1;
    this.mountOfRum = 0;
    this.isWoodenLeged = this.isSleeping = this.isDead = false;
  }

  public Pirate(String name) {
    this.name = name;
    this.age = -1;
    this.mountOfRum = 0;
    this.isWoodenLeged = this.isSleeping = this.isDead = false;
  }

  public Pirate(String name, Boolean isWoodenLeged) {
    this.name = name;
    this.age = -1;
    this.mountOfRum = 0;
    this.isWoodenLeged = isWoodenLeged;
    this.isSleeping = this.isDead = false;
  }

  public Pirate(String name, int age, int mountOfRum, Boolean isWoodenLeged, Boolean isSleeping, Boolean isDead) {
    this.name = name;
    this.age = age;
    this.mountOfRum = mountOfRum;
    this.isWoodenLeged = isWoodenLeged;
    this.isSleeping = isSleeping;
    this.isDead = isDead;
  }

  public int drinkSomeRum(){
    return ++mountOfRum;
  }

  public boolean isSleeping() {
    return isSleeping;
  }

  public void setSleeping(boolean sleeping) {
    isSleeping = sleeping;
  }

  public String howsItGoingMate(){
    if(mountOfRum < 5){
      return "Pour me anudder!";
    }
    else {
      isSleeping = true;
      mountOfRum = 0;
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }
  }

  public boolean die(){
    return isDead = true;
  }

  public int brawl(Pirate enemy){
    if(!enemy.isDead){
      int fortuna = (int) (Math.random() * 3);
      if(fortuna == 1){
        enemy.die();
      } else if(fortuna == 2){
        die();
      } else {
        enemy.setSleeping(true);
        setSleeping(true);
      }
      return fortuna;
    }
    return 1;
  }

  @Override
  public String toString() {
    return "Pirate{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", mountOfRum=" + mountOfRum +
            ", isWoodenLeged=" + isWoodenLeged +
            ", isSleeping=" + isSleeping +
            ", isDead=" + isDead +
            '}';
  }
}
