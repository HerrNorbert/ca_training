
public class Pirate {
  String name;
  int age, mountOfRum;
  Boolean isWoodenLeged, isSleeping, isDead;

  public Pirate() {
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

  public static void main(String[] args) {
    Pirate pirate = new Pirate();
    System.out.println("You have created a pirate!");
  }
}
