package zoo;

import java.util.*;

public class Creature {
  private String name;
  private String type;
  private String magicalaffinity;
  private ArrayList<FoodTypes> stomach;
  private boolean isHungry;
  private boolean hasEnclosure;

  public Creature( String name , String type , String magicalaffinity ) {
    this.name = name;
    this.type = type;
    this.magicalaffinity = magicalaffinity;
    this.stomach = new ArrayList<FoodTypes>();
    this.isHungry = true;
    this.hasEnclosure = false;
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

  public void eat(FoodTypes food){
    this.stomach.add(food);
  }

}
