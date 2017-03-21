package zoo;
import java.util.*;

public class Zoo {
  String name;
  ArrayList<Enclosure> enclosures;

  public Zoo( String name ) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
  }

  public String getZooName() {
    return this.name;
  }

  public int feedCreature( Creature creature , FoodTypes food ) {

    if( creature.getIsHungry() ) {
      creature.eat(food);
    }
    return creature.getStomachContents();
  }

  public int countEnclosures() {
    return enclosures.size();
  }

  public void addEnclosure( Enclosure enclosure ) {
    enclosures.add(enclosure);
  }

  public void removeEnclosure( Enclosure enclosure ) {
    enclosures.remove(enclosure);
  }

}
