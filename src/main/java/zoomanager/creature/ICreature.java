package zoomanager.creature;

import zoomanager.food.IFood;

public interface ICreature {

    String getCreatureName();

    String getCreatureType();

    int getStomachContentsCount();

    Boolean getHungerState();

    Boolean getContainmentState();

    void eat(IFood food);

    String getPreferences();

}
