package zoomanager.creature.types;

import zoomanager.creature.Creature;
import zoomanager.creature.ICreature;

import java.util.HashMap;

public class Unicorn extends Creature implements ICreature {

  private HashMap<String, String> preferences;

  public Unicorn(String name, String type, HashMap<String, String> preferences) {
    super(name, type);
    this.preferences = preferences;
  }

  public HashMap<String, String> getPreferences() {
    return this.preferences;
  }

}
