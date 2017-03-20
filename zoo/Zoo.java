package zoo;
import java.util.*;

public class Zoo {
  String name;
  ArrayList<Creature> creatures;

  public Zoo( String name ) {
    this.name = name;
    this.creatures = new ArrayList<Creature>();
  }

  public String getName() {
    return this.name;
  }

  public void addCreature(Creature creature) {
    creatures.add(creature);
  }

  public int countCreatures() {
    return creatures.size();
  }

}
