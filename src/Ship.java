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

  public ArrayList<Pirate> fillShip(){
    int mountOfPirates = (int) (Math.random() * 5) + 2;
    for (int i = 0 ; i < mountOfPirates ; ++i){
      Pirate pirate = new Pirate();
      crew.add(pirate);
    }
    return crew;
  }

  @Override
  public String toString() {
    int numberOfAlivePirates = 0;
    for (int i = 1; i < crew.size(); ++i){
      if(!crew.get(i).isDead()){
        numberOfAlivePirates++;
      }
    }
    boolean readyToFight = true;
    if(crew.get(0).isDead()){
      readyToFight = false;
    }else{
      readyToFight = !crew.get(0).isSleeping();
    }
    return "The captain drank " + crew.get(0).getMountOfRum() + " mount rum and ready to fight: " + readyToFight + ", " + numberOfAlivePirates + " pirate alive" ;
  }

  public boolean battle(Ship otherShip){
    int ourScore, theirScore;
    ourScore = theirScore = 0;
    ourScore -= crew.get(0).getMountOfRum();
    theirScore -= otherShip.crew.get(0).getMountOfRum();
    for (int i = 1; i< crew.size();i++){
      if(!crew.get(i).isDead()){
        ourScore++;
      }
    }
    for (int i = 1; i < otherShip.crew.size();i++){
      if(!otherShip.crew.get(i).isDead()){
        theirScore++;
      }
    }
    return ourScore >= theirScore;
  }

  public void afterBattle(Ship otherShip, boolean weWon){
    int deaths = 0;
    if(weWon){
      deaths = ((int) (Math.random() * otherShip.crew.size() - 1 )) + 1;
      for(int i = 1; i <= deaths; ++i){
        otherShip.crew.get(i).die();
        crew.get(0).drinkSomeRum();
        crew.get((int) (Math.random() * crew.size() - 1)+1).drinkSomeRum();
      }
    } else {
      deaths = ((int) (Math.random() * crew.size() - 1 )) + 1;
      for(int i = 1; i <= deaths; ++i){
        crew.get(i).die();
        otherShip.crew.get(0).drinkSomeRum();
        otherShip.crew.get((int) (Math.random() * otherShip.crew.size() - 1)+1).drinkSomeRum();
      }
    }
  }

  public static void main(String[] args) {
    Ship ship = new Ship();
    Ship ship2 = new Ship();
    ship.fillShip();
    ship2.fillShip();
    System.out.println(ship.toString());
    System.out.println(ship2.toString());
    boolean weWon = ship.battle(ship2);
    System.out.println("We won: " + weWon);
    ship.afterBattle(ship2,weWon);
    System.out.println(ship.toString());
    System.out.println(ship2.toString());
  }
}
