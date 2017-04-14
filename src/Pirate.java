
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

  public static void main(String[] args) {
    Pirate pirate = new Pirate();
//    System.out.println(pirate.toString());
//    for (int i = 0; i < 5; ++i ){
//      pirate.drinkSomeRum();
//    }
//    System.out.println(pirate.toString());
//    System.out.println(pirate.howsItGoingMate());
    pirate.die();
    System.out.println(pirate.toString());
  }
}
