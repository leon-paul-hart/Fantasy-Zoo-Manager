package zoomanager.creature;

import zoomanager.food.IFood;

import java.util.HashMap;

public interface ICreature {

    String getCreatureName();

    String getCreatureType();

    int getStomachContents();

    Boolean getHungerState();

    Boolean getContainmentState();

    void eat(IFood food);

    String getPreferences();

}
