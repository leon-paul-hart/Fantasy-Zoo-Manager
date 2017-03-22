package zoo;

public class MagicalCreature extends Creature {

  public String magicalAffinity;

  public MagicalCreature( String name , String type , String magicalAffinity ) {
    super( name , type );
    this.magicalAffinity = magicalAffinity;
  }

  public String getMagicalAffinity() {
    return this.magicalAffinity;
  }

}
