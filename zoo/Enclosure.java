package zoo;

import java.util.*;

public class Enclosure {
  private String enclosureName;
  private String type;
  private int maximumCapacity;
  private ArrayList<Creature> creatures;

  public Enclosure( String enclosureName , String type , int maximumcapacity ) {
    this.enclosureName = enclosureName;
    this.type = type;
    this.maximumCapacity = maximumcapacity;
    this.creatures = new ArrayList<Creature>();
  }

  public String getEnclosureName() {
    return this.enclosureName;
  }

  public String getEnclosureType() {
    return this.type;
  }

  public int getEnclosureMaxCapacity() {
    return this.maximumCapacity;
  }

  public int countCreatures() {
    return this.creatures.size();
  }

  // returns all the contents of the creature arraylist.
  public ArrayList<Creature> getEnclosureCreatures() {
    return this.creatures;
  }

  public void addCreature(Creature creature) {
    this.creatures.add(creature);
  }

  public void removeCreature(Creature creature) {
    this.creatures.remove(creature);
  }

  public Boolean checkIfEnclosureIsEmpty() {
    return this.creatures.isEmpty();
  }

}
