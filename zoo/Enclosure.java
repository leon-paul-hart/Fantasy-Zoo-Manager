package zoo;

import java.util.*;

public class Enclosure {
  private String enclosure;
  private String type;
  private int maximumCapacity;
  private ArrayList<Creature> creatures;

  public Enclosure( String enclosure , String type , int maximumcapacity ) {
    this.enclosure = enclosure;
    this.type = type;
    this.maximumCapacity = maximumcapacity;
    this.creatures = new ArrayList<Creature>();
  }

  public String getEnclosureName() {
    return this.enclosure;
  }

  public String getEnclosureType() {
    return this.type;
  }

  public int getEnclosureMaxCapacity() {
    return this.maximumCapacity;
  }

  public ArrayList<Creature> getEnclosureCreatures() {
    return this.creatures;
  }

}
