import java.util.ArrayList;

public class Ship {
  private String name;
  private int rumStorage;
  private ArrayList<Pirate> crew;

  public Ship() {
    name = "no name";
    rumStorage = 0;
    crew = new ArrayList<>();
  }

  public Ship(String name) {
    this.name = name;
    rumStorage = 0;
    crew = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Ship{" +
            "name='" + name + '\'' +
            ", rumStorage=" + rumStorage +
            ", crew=" + crew +
            '}';
  }

  public static void main(String[] args) {
    Ship ship = new Ship();
    System.out.println(ship.toString());
  }
}
