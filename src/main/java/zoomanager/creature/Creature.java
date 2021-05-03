package zoomanager.creature;

import zoomanager.food.IFood;

import java.util.ArrayList;

public class Creature implements ICreature {

    private final String creatureName;
    private final String creatureType;
    private final String foodPreference;
    private ArrayList<IFood> creatureStomach;
    private boolean creatureIsHungry;
    private boolean creatureIsContained;

    public Creature(String name, String type, String foodPreference) {
        this.creatureName = name;
        this.creatureType = type;
        this.foodPreference = foodPreference;
        this.creatureStomach = new ArrayList<>();
        this.creatureIsHungry = true;
        this.creatureIsContained = false;
    }

    public String getCreatureName() {
        return this.creatureName;
    }

    public String getCreatureType() {
        return this.creatureType;
    }

    public int getStomachContentsCount() {
        return this.creatureStomach.size();
    }

    public Boolean getHungerState() {
        return this.creatureIsHungry;
    }

    public Boolean getContainmentState() {
        return this.creatureIsContained;
    }

    public void eat(IFood food) {
        
        this.creatureStomach.add(food);

        if (creatureStomach.size() > 0) {
            this.creatureIsHungry = false;
        }
    }

    public String getPreferences() {
        return this.foodPreference;
    }
}
