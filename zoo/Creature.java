package zoo;

import java.util.*;

public class Creature {
  private String name;
  private String type;
  private ArrayList<FoodTypes> stomach;
  private boolean isHungry;
  private boolean hasEnclosure;

  public Creature( String name , String type ) {
    this.name = name;
    this.type = type;
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

  public int getStomachContents() {
    return this.stomach.size();
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

} // End of class
