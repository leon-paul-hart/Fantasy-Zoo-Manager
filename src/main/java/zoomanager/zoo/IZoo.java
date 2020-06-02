package zoomanager.zoo;

import zoomanager.creature.Creature;
import zoomanager.enclosure.Enclosure;
import zoomanager.food.IFood;

public interface IZoo {

    String getZooName();

    void feedCreature(Creature creature, IFood food);

    int countEnclosures();

    void addEnclosure(Enclosure enclosure);

    void removeEnclosure(Enclosure enclosure);

    int countCreatures();

    void addCreature(Creature creature);

    void removeCreature(Creature creature);

}
