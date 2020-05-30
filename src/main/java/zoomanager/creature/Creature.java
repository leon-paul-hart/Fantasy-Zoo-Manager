package zoomanager.creature;

import zoomanager.food.IFood;

import java.util.ArrayList;

public class Creature {
    private final String name;
    private final String type;
    private final ArrayList<IFood> stomach;
    private final boolean isHungry;
    private final boolean isContained;

    public Creature(String name, String type) {
        this.name = name;
        this.type = type;
        this.stomach = new ArrayList<>();
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

    public void eat(IFood food) {
        this.stomach.add(food);
    }

} // End of class
