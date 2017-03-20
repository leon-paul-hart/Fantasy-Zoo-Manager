package zoo;
import java.util.*;

public class Zoo {
  String name;
  ArrayList<Creature> creatures;
  ArrayList<Enclosure> enclosures;

  public Zoo( String name ) {
    this.name = name;
    this.creatures = new ArrayList<Creature>();
    this.enclosures = new ArrayList<Enclosure>();
  }

  // Zoo Methods

  public String getName() {
    return this.name;
  }

  // Zoo+Creature Methods

  public void addCreature(Creature creature) {
    creatures.add(creature);
  }

  public void removeCreature(Creature creature) {
    creatures.remove(creature);
  }

  public int countCreatures() {
    return creatures.size();
  }

  public int feedCreature( Creature creature , FoodTypes food ) {

    if( creature.getIsHungry() ) {
      creature.eat(food);
    }
    return creature.getStomachContents();
  }

  // Zoo+Enclosure Methods

  public void addEnclosure( Enclosure enclosure ) {
    enclosures.add(enclosure);
  }

  public void removeEnclosure( Enclosure enclosure ) {
    enclosures.remove(enclosure);
  }

  public int countEnclosures() {
    return enclosures.size();
  }

  // Zoo+Creature+Enclosure Methods

  public int getEnclosureCreatureCount(String enclosureName) {
    for(Enclosure enclosure : this.enclosures ) {
      if( enclosure.getEnclosureName().equals(enclosureName) ) {
        return enclosure.getEnclosureCreatures().size();
      }
    }
    return 0;
  }

}
