package zoo;

public class Creature {
  private String enclosure;
  private String type;
  private String magicalaffinity;
  private boolean isHungry;
  private boolean hasEnclosure;

  public Creature( String enclosure , String type , String magicalaffinity , Boolean isHungry , Boolean hasEnclosure ) {
    this.enclosure = enclosure;
    this.type = type;
    this.magicalaffinity = magicalaffinity;
    this.isHungry = isHungry;
    this.hasEnclosure = hasEnclosure;
  }

  public String getName() {
    return this.enclosure;
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
