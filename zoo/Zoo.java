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

  public void addEnclosure(Enclosure enclosure) {
    enclosures.add(enclosure);
  }

  public int countEnclosures() {
    return enclosures.size();
  }

}
