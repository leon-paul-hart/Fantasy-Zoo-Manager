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

  public String getName() {
    return this.name;
  }

  public void addCreature(Creature creature) {
    creatures.add(creature);
  }

  public int countCreatures() {
    return creatures.size();
  }

  public void addEnclosure(Enclosure enclosure) {
    enclosures.add(enclosure);
  }

  public int countEnclosures() {
    return enclosures.size();
  }

}
