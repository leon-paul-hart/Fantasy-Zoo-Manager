package zoo;

import java.util.ArrayList;

public class Creature {
  private String name;
  private String type;
  private ArrayList<FoodTypes> stomach;
  private boolean isHungry;
  private boolean isContained;

  public Creature( String name , String type ) {
    this.name = name;
    this.type = type;
    this.stomach = new ArrayList<FoodTypes>();
    this.isHungry = true;
    this.isContained = false;
  }

  public String getCreatureName() {
    return this.name;
  }

  public String getCreatureType() {
    return this.type;
  }

  public int getStomachContents() {
    return this.stomach.size();
  }

  public Boolean getHungerState() {
    return this.isHungry;
  }

  public Boolean getContainmentState() {
    return this.isContained;
  }

  public void eat(FoodTypes food){
    this.stomach.add(food);
  }

} // End of class
