package zoo;

import java.util.ArrayList;

public class Zoo {
  private String name;
  private ArrayList<Enclosure> enclosures;

  public Zoo( String name ) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
  }

  public String getZooName() {
    return this.name;
  }

  public int feedCreature( Creature creature , FoodTypes food ) {

    if (creature.getHungerState()) {
      creature.eat(food);
    }
    return creature.getStomachContents();
  }

  public int countEnclosures() {
    return this.enclosures.size();
  }

  public void addEnclosure( Enclosure enclosure ) {
    this.enclosures.add(enclosure);
  }

  public void removeEnclosure( Enclosure enclosure ) {
    this.enclosures.remove(enclosure);
  }

} // End of class
