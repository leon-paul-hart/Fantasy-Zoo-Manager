package zoomanager.creature;

import zoomanager.food.IFood;

public interface ICreature {

    String getCreatureName();

    String getCreatureType();

    int getStomachContents();

    Boolean getHungerState();

    Boolean getContainmentState();

    void eat(IFood food);

    String getPreferences();

}
