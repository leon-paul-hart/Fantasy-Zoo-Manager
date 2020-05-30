package zoo;

import java.util.HashMap;

public class Unicorn extends Creature implements MagicalCreature {

  private HashMap< String , String > preferences = new HashMap< String , String>();

  public Unicorn( String name , String type , HashMap< String , String > preferences ) {
    super( name , type );
    this.preferences = preferences;
  }

  public HashMap< String , String> getPreferences() {
    return this.preferences;
  }

}
