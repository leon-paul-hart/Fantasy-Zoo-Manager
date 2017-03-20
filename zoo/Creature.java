package zoo;

import java.util.*;

public class Creature {
  private String name;
  private String type;
  private String magicalaffinity;
  private ArrayList<FoodTypes> stomach;
  private boolean isHungry;
  private boolean hasEnclosure;

  public Creature( String name , String type , String magicalaffinity , ArrayList<FoodTypes> stomach ,  Boolean isHungry , Boolean hasEnclosure ) {
    this.name = name;
    this.type = type;
    this.magicalaffinity = magicalaffinity;
    this.stomach = new ArrayList<FoodTypes>();
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

  public int getStomachContents() {
    return stomach.size();
  }

  public Boolean getIsHungry() {
    return this.isHungry;
  }

  public Boolean getHasEnclosure() {
    return this.hasEnclosure;
  }

}
