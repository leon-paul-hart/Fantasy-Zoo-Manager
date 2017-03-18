package zoo;

public class Creature {
  private String name;
  private String type;
  private String magicalaffinity;
  private boolean isHungry;
  private boolean hasEnclosure;

  public Creature( String name , String type , String magicalaffinity , Boolean isHungry , Boolean hasEnclosure ) {
    this.name = name;
    this.type = type;
    this.magicalaffinity = magicalaffinity;
    this.isHungry = isHungry;
    this.hasEnclosure = hasEnclosure;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public String getMagicalAffinity() {
    return this.magicalaffinity;
  }

  public Boolean getIsHungry() {
    return this.isHungry;
  }

  public Boolean getHasEnclosure() {
    return this.hasEnclosure;
  }

}
